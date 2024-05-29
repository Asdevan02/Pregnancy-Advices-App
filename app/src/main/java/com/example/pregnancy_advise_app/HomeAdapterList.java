package com.example.pregnancy_advise_app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public  class HomeAdapterList extends ArrayAdapter<AdviseModel> {

    private final Context context;
    private final ArrayList<AdviseModel> data;

    public HomeAdapterList(Context context, ArrayList<AdviseModel> data) {
        super(context, R.layout.advise_layout, data);
        this.context = context;
        this.data = data;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate the item_card layout
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         View view = inflater.inflate(R.layout.advise_layout, parent, false);

        // Get the TextView and ImageView
        TextView textView = view.findViewById(R.id.map_site_name);
        textView.setText(data.get(position).title);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the car data (name) for the clicked position
                String name = data.get(position).title;
                Intent intent = new Intent(context, AdivseHomeDetail.class);
                intent.putExtra("name", name);
                context.startActivity(intent);
            }
        });
        return view;
    }
}
