// Generated code from Butter Knife. Do not modify!
package com.example.mortar.view;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeadView$$ViewInjector {
  public static void inject(Finder finder, final com.example.mortar.view.LeadView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034163, "field 'userName'");
    target.userName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034164, "field 'password'");
    target.password = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034165, "field 'login'");
    target.login = (android.widget.Button) view;
  }

  public static void reset(com.example.mortar.view.LeadView target) {
    target.userName = null;
    target.password = null;
    target.login = null;
  }
}
