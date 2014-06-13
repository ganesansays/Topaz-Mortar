// Generated code from Butter Knife. Do not modify!
package com.example.mortar.view;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MessageView$$ViewInjector {
  public static void inject(Finder finder, final com.example.mortar.view.MessageView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034166, "field 'userView' and method 'userClicked'");
    target.userView = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.userClicked();
        }
      });
    view = finder.findRequiredView(source, 2131034167, "field 'messageView'");
    target.messageView = (android.widget.TextView) view;
  }

  public static void reset(com.example.mortar.view.MessageView target) {
    target.userView = null;
    target.messageView = null;
  }
}
