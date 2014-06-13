package com.example.mortar.screen;

import android.os.Bundle;

import com.example.mortar.R;
import com.example.mortar.core.Main;
import com.example.mortar.core.MainScope;
import com.example.mortar.model.Login;
import com.example.mortar.view.LoginView;

import javax.inject.Inject;
import javax.inject.Singleton;

import flow.Flow;
import flow.Layout;
import mortar.Blueprint;
import mortar.ViewPresenter;

/**
 * Created by Ganesan_Gurumurthy on 5/30/2014.
 */
@Layout(R.layout.login_view) //
public class LoginScreen implements Blueprint {
    @Override
    public String getMortarScopeName() {
        return getClass().getName();
    }

    @Override
    public Object getDaggerModule() {
        return new Module();
    }

    @dagger.Module(injects = LoginView.class, addsTo = Main.Module.class)
    static class Module {

    }

    @Singleton
    public static class Presenter extends ViewPresenter<LoginView> {
        private final Flow flow;
        private final Login login;

        @Inject
        Presenter(@MainScope Flow flow, Login login) {
            this.flow = flow;
            this.login = login;
        }

        @Override public void onLoad(Bundle savedInstanceState) {
            super.onLoad(savedInstanceState);
            LoginView view = getView();
            if (view == null) return;
        }

        public void login(CharSequence userName, CharSequence password) {
            if(login.performLogin(userName.toString(), password.toString())) {
                android.util.Log.i("Login", "Successfully Logged in ...");
                flow.goTo(new LeadListScreen());
            }
        }
    }
}
