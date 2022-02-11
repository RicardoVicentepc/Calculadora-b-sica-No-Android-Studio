package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtNum1;
    private EditText txtNum2;
    private TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        tvResultado = findViewById(R.id.tvResultado);
    }
    public void Somar(View view) {
        int valor1 = Integer.parseInt(txtNum1.getText().toString());
        int valor2 = Integer.parseInt(txtNum2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 + valor2));

    }
    public void Subtrair(View view) {
        int valor1 = Integer.parseInt(txtNum1.getText().toString());
        int valor2 = Integer.parseInt(txtNum2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 - valor2));

    }
    public void Multiplicacao(View view) {
        int valor1 = Integer.parseInt(txtNum1.getText().toString());
        int valor2 = Integer.parseInt(txtNum2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 * valor2));

    }
    public void Divisao(View view) {
        int valor1 = Integer.parseInt(txtNum1.getText().toString());
        int valor2 = Integer.parseInt(txtNum2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 / valor2));

    }
}