package com.example.hw_1_gr_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next2 = findViewById(R.id.button_next1);
        Button next3 = findViewById(R.id.button_next3);
        Button next4 = findViewById(R.id.button_next4);
        EditText editText = findViewById(R.id.et_text);

        next2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("hello", editText.getText());
            startActivity(intent);
        });
        next3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            intent.putExtra("hello", editText.getText());
            startActivity(intent);
        });
        next4.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, FourthActivity.class);
            intent.putExtra("hello", editText.getText());
            startActivity(intent);
        });
    }
}