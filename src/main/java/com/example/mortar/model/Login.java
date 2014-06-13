package com.example.mortar.model;

import com.example.mortar.core.MainThread;
import com.example.mortar.repository.LoginService;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Provides;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import rx.Scheduler;

/**
 * Created by Ganesan_Gurumurthy on 6/13/2014.
 */
public class Login {
    final Scheduler mainThread;
    final Executor messagePollThread;
    final LoginService service;
    boolean serviceStatus = false;

    @Inject
    Login(@MainThread Scheduler mainThread, Executor messagePollThread, LoginService service)
    {
        this.mainThread = mainThread;
        this.messagePollThread = messagePollThread;
        this.service = service;
    }

    public boolean performLogin(String userName, String password) {

        service.login(userName, password, new Callback<LoginService.AuthToken>() {
                @Override
                public void failure(final RetrofitError error) {
                    serviceStatus = false;
                    android.util.Log.e("example", "Error, body: Calling Service ...");
                    if(error != null) {
                        Response r = error.getResponse();
                        if (r != null) {
                            android.util.Log.e("Login", "Error, Status: " + r.getStatus());
                        }
                    }
                }
                @Override
                public void success(LoginService.AuthToken authToken, Response response) {
                    // Do something with the AuthToken object returned
                    serviceStatus = true;
                }
            }
        );

        return true;
    }

    @dagger.Module(injects = Login.class, library = true, complete = false)
    public static class Module {
        @Provides @Singleton Executor provideMessagePollThread() {
            return Executors.newSingleThreadExecutor();
        }
    }
}
