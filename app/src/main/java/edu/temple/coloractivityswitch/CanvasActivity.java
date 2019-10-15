package edu.temple.coloractivityswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

public class CanvasActivity extends AppCompatActivity {

    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        getSupportActionBar().setTitle(R.string.canvas_title);

        layout = findViewById(R.id.CanvasBackground);

        Intent intent = getIntent();

        String backgroundColor = (String) intent.getSerializableExtra("BACKGROUND");

        layout.setBackgroundColor(Color.parseColor(backgroundColor));
    }
}
