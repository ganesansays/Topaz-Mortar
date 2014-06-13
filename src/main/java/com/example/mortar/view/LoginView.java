package com.example.mortar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mortar.R;
import com.example.mortar.screen.LoginScreen;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import mortar.Mortar;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by Ganesan_Gurumurthy on 5/30/2014.
 */
public class LoginView extends LinearLayout {
    @Inject LoginScreen.Presenter presenter;

    @InjectView(R.id.userName) TextView userName;
    @InjectView(R.id.password) TextView password;
    @InjectView(R.id.login) Button login;

    public LoginView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOrientation(VERTICAL);
        Mortar.inject(context, this);
    }

    @Override protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.inject(this);
        presenter.takeView(this);
    }

    @Override protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        presenter.dropView(this);
    }

    public void setUser(String user) {
        userName.setText(user);
    }

    @OnClick(R.id.login) void loginClicked() {
        Toast.makeText(getContext(), "Let go of me!", LENGTH_SHORT).show();
        presenter.login(userName.getText(), password.getText());
    }
}
