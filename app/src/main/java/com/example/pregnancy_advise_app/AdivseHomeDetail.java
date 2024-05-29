package com.example.pregnancy_advise_app;

import static com.example.pregnancy_advise_app.AdviseModel.findAdviseInformation;
import static com.example.pregnancy_advise_app.AdviseModel.getSampleData;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdivseHomeDetail extends Activity {
private ImageButton backButton;
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advise_detail_page_layout);
        listView = findViewById(R.id.detail_page_list);
        backButton =  findViewById(R.id.map_item_back_btn);
        // Get references to UI elements
        TextView textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("name")) {
            String name = intent.getStringExtra("name");
            textView.setText(name);

            // Update UI elements with car data (replace with your logic)
            AdviseModel sampleData = findAdviseInformation(name,getSampleData());
//
            assert sampleData != null;
            DetailAdapterList adapter = new DetailAdapterList(this, sampleData.adviseActivities);
            listView.setAdapter(adapter);
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdivseHomeDetail.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
