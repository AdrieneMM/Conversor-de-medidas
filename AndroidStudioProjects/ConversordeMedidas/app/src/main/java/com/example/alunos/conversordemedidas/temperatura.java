package com.example.alunos.conversordemedidas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class temperatura extends AppCompatActivity {


    private String[] temperatura = {"Graus Celsius (°C)", "Graus Fahrenheit (°F)", "Kelvin (K)"};
    Spinner spinner6;
    Spinner spinner7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, temperatura);
        spinner6 = (Spinner) findViewById(R.id.spinner6);
        spinner7 = (Spinner) findViewById(R.id.spinner7);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter);
        spinner7.setAdapter(adapter);
    }

    public void VoltarTemperatura(View v) {
        Intent intent = new Intent(this, TelaInicial.class);
        startActivity(intent);
    }

    public void ConversorTemperatura(View ma) {
        EditText valorT = (EditText) findViewById(R.id.RMV);
        double valorTT = Double.parseDouble(valorT.getText().toString());
        String TextT1 = spinner6.getSelectedItem().toString();
        String TextT2 = spinner7.getSelectedItem().toString();

        if (TextT1 == "Graus Celsius (°C)") {
            switch (TextT2) {
                case "Graus Fahrenheit (°F)":
                    valorTT = (valorTT * 1.8) + 32;
                    String valorT2 = String.valueOf(valorTT);
                    EditText txtT2 = (EditText) findViewById(R.id.ResN);
                    txtT2.setText(valorT2);
                    break;

                case "Kelvin (K)":
                    valorTT = valorTT + 273;
                    String valorT4 = String.valueOf(valorTT);
                    EditText txtT4 = (EditText) findViewById(R.id.ResN);
                    txtT4.setText(valorT4);
                    break;

                case "Graus Celsius (°C)":
                    valorTT = valorTT * 1;
                    String valorT12 = String.valueOf(valorTT);
                    EditText txtT12 = (EditText) findViewById(R.id.ResN);
                    txtT12.setText(valorT12);
                    break;
            }

        }

        if (TextT1 == "Graus Fahrenheit (°F)") {
            switch (TextT2) {
                case "Graus Celsius (°C)":
                    valorTT = (valorTT - 32) / 1.8;
                    String valorT3 = String.valueOf(valorTT);
                    EditText txtT3 = (EditText) findViewById(R.id.ResN);
                    txtT3.setText(valorT3);
                    break;

                case "Kelvin (K)":
                    valorTT = (valorTT + 459.67) * 0.55555555555;
                    String valorT6 = String.valueOf(valorTT);
                    EditText txtT6 = (EditText) findViewById(R.id.ResN);
                    txtT6.setText(valorT6);
                    break;

                case "Graus Fahrenheit (°F)":
                    valorTT = valorTT * 1;
                    String valorT9 = String.valueOf(valorTT);
                    EditText txtT9 = (EditText) findViewById(R.id.ResN);
                    txtT9.setText(valorT9);
                    break;
            }
        }

         if (TextT1 == "Kelvin (K)") {
            switch (TextT2) {
                case "Graus Celsius (°C)":
                    valorTT = valorTT - 273;
                    String valorT5 = String.valueOf(valorTT);
                    EditText txtT5 = (EditText) findViewById(R.id.ResN);
                    txtT5.setText(valorT5);
                    break;

                case "Graus Fahrenheit (°F)":
                    valorTT = (valorTT * 1.8) - 459.67;
                    String valorT7 = String.valueOf(valorTT);
                    EditText txtT7 = (EditText) findViewById(R.id.ResN);
                    txtT7.setText(valorT7);
                    break;

                case "Kelvin (K)":
                    valorTT = valorTT * 1;
                    String valorT8 = String.valueOf(valorTT);
                    EditText txtT8 = (EditText) findViewById(R.id.ResN);
                    txtT8.setText(valorT8);
                    break;
            }
         }
    }
}










