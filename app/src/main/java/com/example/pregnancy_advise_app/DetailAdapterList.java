package com.example.pregnancy_advise_app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailAdapterList extends ArrayAdapter<AdviseActivity> {

    private final Context context;
    private final ArrayList<AdviseActivity> data;

    public DetailAdapterList(Context context, ArrayList<AdviseActivity> data) {
        super(context, R.layout.advise_detail, data);
        this.context = context;
        this.data = data;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate the item_card layout
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.advise_detail, parent, false);

        // Get the TextView and ImageView
        TextView textView = view.findViewById(R.id.advise_acitvity_title);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView listView = view.findViewById(R.id.detail_list);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView image1 = view.findViewById(R.id.detail_image1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView image2 = view.findViewById(R.id.detail_image2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView image3 = view.findViewById(R.id.detail_image3);
        textView.setText(data.get(position).name);
        image1.setImageResource(data.get(position).image1);
        image2.setImageResource(data.get(position).image2);
        image3.setImageResource(data.get(position).image3);

        AdivseDetailActivityAdapter adapter = new AdivseDetailActivityAdapter(context, data.get(position).advises);
        listView.setAdapter(adapter);
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Get the car data (name) for the clicked position
////                String name = data.get(position).title;
////                Intent intent = new Intent(context, AdivseHomeDetail.class);
////                intent.putExtra("name", name);
////                context.startActivity(intent);
//            }
//        });
        return view;
    }
}
