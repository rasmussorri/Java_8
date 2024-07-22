package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editFirstNumber;
    private EditText editSecondNumber;
    private Button plusButton;
    private Button minusButton;
    private Button multiplyButton;
    private Button divideButton;
    private TextView textSeeResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editFirstNumber = findViewById(R.id.editFirstNumber);
        editSecondNumber = findViewById(R.id.editSecondNumber);
        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        textSeeResult = findViewById(R.id.textSeeResult);


    }

    public void minus(View view) {
        int num1 = Integer.parseInt(editFirstNumber.getText().toString());
        int num2 = Integer.parseInt(editSecondNumber.getText().toString());
        int result = num1 - num2;
        textSeeResult.setText(String.valueOf(result));
    }

    public void plus(View view) {
        int num1 = Integer.parseInt(editFirstNumber.getText().toString());
        int num2 = Integer.parseInt(editSecondNumber.getText().toString());
        int result = num1 + num2;
        textSeeResult.setText(String.valueOf(result));
    }

    public void divide(View view) {
        int num1 = Integer.parseInt(editFirstNumber.getText().toString());
        int num2 = Integer.parseInt(editSecondNumber.getText().toString());
        int result = num1 / num2;
        textSeeResult.setText(String.valueOf(result));
    }

    public void multiply(View view) {
        int num1 = Integer.parseInt(editFirstNumber.getText().toString());
        int num2 = Integer.parseInt(editSecondNumber.getText().toString());
        int result = num1 * num2;
        textSeeResult.setText(String.valueOf(result));
    }
}