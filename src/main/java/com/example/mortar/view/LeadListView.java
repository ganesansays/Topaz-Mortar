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

package com.example.mortar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mortar.R;
import com.example.mortar.model.Lead;
import com.example.mortar.screen.LeadListScreen;

import java.util.List;

import javax.inject.Inject;

import mortar.Mortar;

public class LeadListView extends ListView {
    @Inject LeadListScreen.Presenter presenter;

    public LeadListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Mortar.inject(context, this);
    }

    @Override protected void onFinishInflate() {
        super.onFinishInflate();
        presenter.takeView(this);
    }

    @Override protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        presenter.dropView(this);
    }

    public void showLeads(List<Lead> leads) {

        if(leads == null) return;

        Adapter adapter = new Adapter(getContext(), leads);

        setAdapter(adapter);
        setOnItemClickListener(new OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                presenter.onLeadSelected(position);
            }
        });
    }

    private static class Adapter extends ArrayAdapter<Lead> {
        public Adapter(Context context, List<Lead> objects) {
            super(context, android.R.layout.simple_list_item_1, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            Lead lead = getItem(position);
            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_lead_list, parent, false);
            }
            // Lookup view for data population
            TextView id = (TextView) convertView.findViewById(R.id.id);
            TextView name = (TextView) convertView.findViewById(R.id.name);
            TextView telNo = (TextView) convertView.findViewById(R.id.telNo);
            TextView address = (TextView) convertView.findViewById(R.id.address);
            // Populate the data into the template view using the data object
            id.setText(lead.id);
            name.setText(lead.name);
            telNo.setText(lead.telNo);
            address.setText(lead.address);
            // Return the completed view to render on screen
            return convertView;
        }
    }
}
