package edu.temple.coloractivityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class PaletteActivity extends AppCompatActivity {

    String[] colors;
    int readyCheck = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(R.string.palette_title);
        Resources res = getResources();



        final Spinner spinner = findViewById(R.id.spinner);

        colors = res.getStringArray(R.array.colors);

        ColorAdapter adapter = new ColorAdapter(PaletteActivity.this, colors);

        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener select = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(readyCheck++ > 0){
                    Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                    intent.putExtra("BACKGROUND", colors[position]);
                    startActivity(intent);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        };
        spinner.setOnItemSelectedListener(select);


    }
}
