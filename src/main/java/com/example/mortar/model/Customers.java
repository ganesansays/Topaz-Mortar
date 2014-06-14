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
import com.example.mortar.repository.CustomerService;

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
public class Customers {
    private final List<Customer> all;

    final Scheduler mainThread;
    final Executor messagePollThread;
    final CustomerService service;

    @Inject
    Customers(@MainThread Scheduler mainThread, Executor messagePollThread, CustomerService service) {
        this.mainThread = mainThread;
        this.messagePollThread = messagePollThread;
        this.service = service;

        all = Collections.unmodifiableList(asList(//
                new Customer(
                        "CA001"    ,
                        "AVIS RENT A CARE",
                        "John Dun",
                        "CEO",
                        "673 8727901",
                        "673 8727851",
                        "a@b.com",
                        "www.b.com",
                        "363, Arcot Road, Kodambakkam, " +
                                "Chennai"
                ), //
                new Customer(
                        "CA002"    ,
                        "ASIA PRINTER",
                        "FN LN",
                        "Managing Director",
                        "673 8765439",
                        "673 8765858",
                        "aaabb@bccc.com",
                        "www.bccc.com",
                        "17, Cathedral Rd, Teynampet," +
                                "Chennai, Tamil Nadu"
                )
        ) //
        );
    }

    public List<Customer> getAll() {
        return all;
    }

    public Customer getCustomer(int id) {
        return all.get(id);
    }

    @dagger.Module(injects = Customer.class, library = true, complete = false)
    public static class Module {
        @Provides @Singleton Executor provideMessagePollThread() {
            return Executors.newSingleThreadExecutor();
        }
    }
}
