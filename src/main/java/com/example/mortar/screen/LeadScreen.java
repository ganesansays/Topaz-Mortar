package com.example.mortar.screen;

import android.os.Bundle;

import com.example.mortar.R;
import com.example.mortar.core.Main;
import com.example.mortar.core.MainScope;
import com.example.mortar.model.Lead;
import com.example.mortar.model.Leads;
import com.example.mortar.view.LeadView;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Provides;
import flow.Flow;
import flow.HasParent;
import flow.Layout;
import mortar.Blueprint;
import mortar.ViewPresenter;

/**
 * Created by Ganesan_Gurumurthy on 5/30/2014.
 */
@Layout(R.layout.lead_view) //
public class LeadScreen implements HasParent<LeadListScreen>, Blueprint {
    private final int leadIndex;

    public LeadScreen(int leadIndex) {
        this.leadIndex = leadIndex;
    }

    @Override public String getMortarScopeName() {
        return "LeadScreen{" + "leadIndex=" + leadIndex + '}';
    }

    @Override
    public Object getDaggerModule() {
        return new Module();
    }

    @Override public LeadListScreen getParent() {
        return new LeadListScreen();
    }

    @dagger.Module(injects = LeadView.class, addsTo = Main.Module.class)
    public class Module {
        @Provides
        Lead provideLead(Leads leads) {
            return leads.getLead(leadIndex);
        }
    }

    @Singleton
    public static class Presenter extends ViewPresenter<LeadView> {
        private final Flow flow;
        private final Lead lead;

        @Inject
        Presenter(@MainScope Flow flow, Lead lead) {
            this.flow = flow;
            this.lead = lead;
        }

        @Override public void onLoad(Bundle savedInstanceState) {
            super.onLoad(savedInstanceState);
            LeadView view = getView();
            if (view == null) return;
        }
    }
}
