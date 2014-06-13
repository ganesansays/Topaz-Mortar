package com.example.mortar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mortar.R;
import com.example.mortar.model.Lead;
import com.example.mortar.screen.LeadScreen;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import mortar.Mortar;

/**
 * Created by Ganesan_Gurumurthy on 5/30/2014.
 */
public class LeadView extends LinearLayout {
    @Inject LeadScreen.Presenter presenter;

    @InjectView(R.id.id) TextView id;

    public LeadView(Context context, AttributeSet attrs) {
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

    public void showDetails(Lead lead) {
        this.id.setText(lead.toString());
    }
}
