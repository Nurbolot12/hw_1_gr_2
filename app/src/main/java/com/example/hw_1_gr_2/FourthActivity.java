package com.example.hw_1_gr_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button next1 = findViewById(R.id.b1);
        Button next2 = findViewById(R.id.b2);
        Button next3 = findViewById(R.id.b3);
        EditText editText4 = findViewById(R.id.et_text4);
        TextView textView4 = findViewById(R.id.tv_text4);


        next1.setOnClickListener(view -> {
            Intent intent = new Intent(FourthActivity.this, MainActivity.class);
            intent.putExtra("hello", editText4.getText());
            startActivity(intent);
        });
        next2.setOnClickListener(view -> {
            Intent intent = new Intent(FourthActivity.this, SecondActivity.class);
            intent.putExtra("hello", editText4.getText());
            startActivity(intent);
        });
        next3.setOnClickListener(view -> {
            Intent intent = new Intent(FourthActivity.this, ThirdActivity.class);
            intent.putExtra("hello", editText4.getText());
            startActivity(intent);
        });


        Bundle arguments = getIntent().getExtras();
        String textNurbola = arguments.get("hello").toString();

        textView4.setText(textNurbola);

    }
}