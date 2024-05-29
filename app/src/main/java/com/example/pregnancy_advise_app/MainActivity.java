package com.example.pregnancy_advise_app;

import static com.example.pregnancy_advise_app.AdviseModel.getSampleData;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    ArrayList<AdviseModel> data = getSampleData();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        listView = findViewById(R.id.advise_activity_list);

        HomeAdapterList adapter = new HomeAdapterList(this, data);
        listView.setAdapter(adapter);
    }
}