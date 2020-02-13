package edu.temple.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] colors = {"red", "yellow", "green", "blue", "purple", "teal", "aqua", "fuchsia", "black", "white"};



        final Spinner spinner = findViewById(R.id.ColorSpinner);


        final ColorAdapter adapter = new ColorAdapter(ColorActivity.this, colors);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                View layout = findViewById(R.id.colorLayout);
                layout.setBackgroundColor(Color.parseColor(parent.getSelectedItem().toString()));
                adapter.getView(position, view, parent).setBackgroundColor(Color.WHITE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}


