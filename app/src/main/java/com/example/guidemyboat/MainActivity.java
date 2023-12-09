package com.example.guidemyboat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

    }

    @Override
    protected void onStart() {
        super.onStart();
        button_start = findViewById(R.id.Start_Button);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeToMain();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    private void changeToMain(){
        Intent main = new Intent(this, activity_main.class);
        startActivity(main);
    }
}