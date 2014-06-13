// Generated code from Butter Knife. Do not modify!
package com.example.mortar.view;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LoginView$$ViewInjector {
  public static void inject(Finder finder, final com.example.mortar.view.LoginView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034167, "field 'userName'");
    target.userName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034168, "field 'password'");
    target.password = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034169, "field 'login' and method 'loginClicked'");
    target.login = (android.widget.Button) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.loginClicked();
        }
      });
  }

  public static void reset(com.example.mortar.view.LoginView target) {
    target.userName = null;
    target.password = null;
    target.login = null;
  }
}
