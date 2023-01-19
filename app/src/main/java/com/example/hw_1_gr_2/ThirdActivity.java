package com.example.hw_1_gr_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button next1 = findViewById(R.id.button1);
        Button next2 = findViewById(R.id.button2);
        Button next4 = findViewById(R.id.button4);
        EditText editText3 = findViewById(R.id.et_text3);
        TextView textView3 = findViewById(R.id.tv_text3);


        next1.setOnClickListener(view -> {
            Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
            intent.putExtra("hello", editText3.getText());
            startActivity(intent);
        });
        next2.setOnClickListener(view -> {
            Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
            intent.putExtra("hello", editText3.getText());
            startActivity(intent);
        });
        next4.setOnClickListener(view -> {
            Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
            intent.putExtra("hello", editText3.getText());
            startActivity(intent);
        });


        Bundle arguments = getIntent().getExtras();
        String textNurbola = arguments.get("hello").toString();

        textView3.setText(textNurbola);


    }
}