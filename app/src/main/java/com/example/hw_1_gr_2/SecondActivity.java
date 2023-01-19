package com.example.hw_1_gr_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button next1 = findViewById(R.id.btn1);
        Button next3 = findViewById(R.id.btn3);
        Button next4 = findViewById(R.id.btn4);
        EditText editText2 = findViewById(R.id.et_text2);
        TextView textView2 = findViewById(R.id.tv_text2);


        next1.setOnClickListener(view -> {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            intent.putExtra("hello", editText2.getText());
            startActivity(intent);
        });
        next3.setOnClickListener(view -> {
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            intent.putExtra("hello", editText2.getText());
            startActivity(intent);
        });
        next4.setOnClickListener(view -> {
            Intent intent = new Intent(SecondActivity.this, FourthActivity.class);
            intent.putExtra("hello", editText2.getText());
            startActivity(intent);
        });


        Bundle arguments = getIntent().getExtras();
        String textNurbola = arguments.get("hello").toString();

        textView2.setText(textNurbola);


    }
}