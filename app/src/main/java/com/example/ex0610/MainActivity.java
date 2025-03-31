package com.example.ex0610;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    LinearLayout main;
    Switch sw;
    ToggleButton tb;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.main);
        sw = findViewById(R.id.sw);
        tb = findViewById(R.id.tb);
    }

    public void click(View view) {
        if (sw.isChecked() && tb.isChecked())
        {
            main.setBackgroundColor(Color.GREEN);
        }
        else if (sw.isChecked() && !tb.isChecked())
        {
            main.setBackgroundColor(Color.BLUE);
        }
        else if (!sw.isChecked() && tb.isChecked())
        {
            main.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            main.setBackgroundColor(Color.WHITE);
        }
    }
}