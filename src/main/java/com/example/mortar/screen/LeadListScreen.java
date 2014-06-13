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
package com.example.mortar.screen;

import android.os.Bundle;

import com.example.mortar.R;
import com.example.mortar.core.Main;
import com.example.mortar.model.Lead;
import com.example.mortar.model.Leads;
import com.example.mortar.view.LeadListView;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Provides;
import flow.Flow;
import flow.Layout;
import mortar.Blueprint;
import mortar.ViewPresenter;

@Layout(R.layout.lead_list_view) //
public class LeadListScreen implements Blueprint {

    @Override public String getMortarScopeName() {
        return getClass().getName();
    }

    @Override public Object getDaggerModule() {
        return new Module();
    }

    @dagger.Module(injects = LeadListView.class, addsTo = Main.Module.class)
    static class Module {
        @Provides List<Lead> provideConversations(Leads leads) {
            return leads.getAll();
        }
    }

    @Singleton
    public static class Presenter extends ViewPresenter<LeadListView> {
        private final Flow flow;
        private final List<Lead> leads;

        @Inject Presenter(Flow flow, List<Lead> leads) {
            this.flow = flow;
            this.leads = leads;
        }

        @Override public void onLoad(Bundle savedInstanceState) {
            super.onLoad(savedInstanceState);
            LeadListView view = getView();
            if (view == null) return;

            view.showLeads(leads);
        }

        public void onLeadSelected(int position) {
            flow.goTo(new LeadScreen(position));
        }
    }
}
