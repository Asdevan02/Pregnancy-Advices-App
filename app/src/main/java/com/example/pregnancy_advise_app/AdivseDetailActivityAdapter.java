package com.example.pregnancy_advise_app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdivseDetailActivityAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final ArrayList<String> data;

    public AdivseDetailActivityAdapter(Context context, ArrayList<String> data) {
        super(context, R.layout.advise_detail_activity, data);
        this.context = context;
        this.data = data;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate the item_card layout
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.advise_detail_activity, parent, false);

        // Get the TextView and ImageView
        TextView textView = view.findViewById(R.id.map_site_name);
        textView.setText(data.get(position));
        return view;
    }
}
