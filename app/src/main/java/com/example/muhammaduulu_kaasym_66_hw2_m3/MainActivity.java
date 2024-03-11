package com.example.muhammaduulu_kaasym_66_hw2_m3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvZero;
    private Button btnPlus;
    private Button btnMinus;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText = String.valueOf(Integer.parseInt(tvZero.getText().toString()) + 1);
                tvZero.setText(newText);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(tvZero.getText().toString()) != 0) {

                }
                String newText = String.valueOf(Integer.parseInt(tvZero.getText().toString()) - 1);
                tvZero.setText(newText);
            }
        });

    }

    private void setUI() {

        tvZero = findViewById(R.id.tv_zero);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);

    }
}