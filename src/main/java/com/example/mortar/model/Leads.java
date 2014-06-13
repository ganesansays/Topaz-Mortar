/*
 * Copyright 2013 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.mortar.model;

import com.example.mortar.core.MainThread;
import com.example.mortar.repository.LeadService;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Provides;
import rx.Scheduler;

import static java.util.Arrays.asList;

@Singleton
public class Leads {
    private final List<Lead> all;

    final Scheduler mainThread;
    final Executor messagePollThread;
    final LeadService service;

    @Inject
    Leads(@MainThread Scheduler mainThread, Executor messagePollThread, LeadService service) {
        this.mainThread = mainThread;
        this.messagePollThread = messagePollThread;
        this.service = service;

        all = Collections.unmodifiableList(asList(//
                new Lead(
                    "1", "Lead1", "TEl1", "Address1"
                ), //
                new Lead(
                    "2", "Lead2", "TEl2", "Address2"
                )
            ) //
        );
    }

    public List<Lead> getAll() {
        return all;
    }

    public Lead getLead(int id) {
        return all.get(id);
    }

    @dagger.Module(injects = Leads.class, library = true, complete = false)
    public static class Module {
        @Provides @Singleton Executor provideMessagePollThread() {
            return Executors.newSingleThreadExecutor();
        }
    }
}
