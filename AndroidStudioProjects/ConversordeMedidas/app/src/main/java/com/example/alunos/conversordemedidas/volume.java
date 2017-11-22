package com.example.alunos.conversordemedidas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class volume extends AppCompatActivity {
    private String[] volume = {"Quilômetros cúbicos km³", "Metros cúbicos m³", "Decímetro cúbico dm³", "Centímetro cúbico cm³","Milímetro cúbico mm³"};
    Spinner spinner4;
    Spinner spinner5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, volume);
         spinner4 = (Spinner) findViewById(R.id.spinner4);
         spinner5 = (Spinner) findViewById(R.id.spinner5);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);
    }
    public void VoltarVolume(View v){
        Intent intent = new Intent(this, TelaInicial.class);
        startActivity(intent);
    }
    public void ConversorVolume(View ma) {
        EditText valorVo = (EditText) findViewById(R.id.RVV);
        double valorVoo = Double.parseDouble(valorVo.getText().toString());
        String Text = spinner4.getSelectedItem().toString();
        String Text2 = spinner5.getSelectedItem().toString();

        if (Text == "Quilômetros cúbicos km³") {
            switch (Text2) {
                case "Metros cúbicos m³":
                    valorVoo = valorVoo * 10e9;
                    String valorm1 = String.valueOf(valorVoo);
                    EditText txt = (EditText) findViewById(R.id.ResV);
                    txt.setText(valorm1);
                    break;
                case "Quilômetros cúbicos km³":
                    valorVoo = valorVoo * 1;
                    String valorm2 = String.valueOf(valorVoo);
                    EditText txt2 = (EditText) findViewById(R.id.ResV);
                    txt2.setText(valorm2);
                    break;

                case "Centímetro cúbico cm³":
                    valorVoo = valorVoo * 1e15;
                    String valorm3 = String.valueOf(valorVoo);
                    EditText txt3 = (EditText) findViewById(R.id.ResV);
                    txt3.setText(valorm3);
                    break;

                case "Milímetro cúbico mm³":
                    valorVoo = valorVoo * 10e18;
                    String valorm4 = String.valueOf(valorVoo);
                    EditText txt4 = (EditText) findViewById(R.id.ResV);
                    txt4.setText(valorm4);
                    break;

                case "Decímetro cúbico dm³":
                    valorVoo = valorVoo * 10e12;
                    String valorm5 = String.valueOf(valorVoo);
                    EditText txt5 = (EditText) findViewById(R.id.ResV);
                    txt5.setText(valorm5);
                    break;
            }
        }else if(Text == "Metros cúbicos m³") {
            switch (Text2) {
                case "Metros cúbicos m³":
                    valorVoo = valorVoo * 1;
                    String valorm6 = String.valueOf(valorVoo);
                    EditText txt6 = (EditText) findViewById(R.id.ResV);
                    txt6.setText(valorm6);
                    break;
                case "Quilômetros cúbicos km³":
                    valorVoo = valorVoo * 10e-6;
                    String valorm7 = String.valueOf(valorVoo);
                    EditText txt7 = (EditText) findViewById(R.id.ResV);
                    txt7.setText(valorm7);
                    break;

                case "Centímetro cúbico cm³":
                    valorVoo = valorVoo * 10e6;
                    String valorm8 = String.valueOf(valorVoo);
                    EditText txt8 = (EditText) findViewById(R.id.ResV);
                    txt8.setText(valorm8);
                    break;

                case "Milímetro cúbico mm³":
                    valorVoo = valorVoo * 1e9;
                    String valorm9 = String.valueOf(valorVoo);
                    EditText txt9 = (EditText) findViewById(R.id.ResV);
                    txt9.setText(valorm9);
                    break;

                case "Decímetro cúbico dm³":
                    valorVoo = valorVoo * 1000;
                    String valorm10 = String.valueOf(valorVoo);
                    EditText txt10 = (EditText) findViewById(R.id.ResV);
                    txt10.setText(valorm10);
                    break;
            }
        }if (Text == "Decímetro cúbico dm³") {
            switch (Text2) {
                case "Metros cúbicos m³":
                    valorVoo= valorVoo * 0.001;
                    String valorm11 = String.valueOf(valorVoo);
                    EditText txt11 = (EditText) findViewById(R.id.ResV);
                    txt11.setText(valorm11);
                    break;
                case "Quilômetros cúbicos km³":
                    valorVoo = valorVoo * 10e-13;
                    String valorm12 = String.valueOf(valorVoo);
                    EditText txt12 = (EditText) findViewById(R.id.ResV);
                    txt12.setText(valorm12);
                    break;

                case "Centímetro cúbico cm³":
                    valorVoo = valorVoo * 10e15;
                    String valorm13 = String.valueOf(valorVoo);
                    EditText txt13 = (EditText) findViewById(R.id.ResV);
                    txt13.setText(valorm13);
                    break;

                case "Milímetro cúbico mm³":
                    valorVoo = valorVoo * 10e18;
                    String valorm14 = String.valueOf(valorVoo);
                    EditText txt14 = (EditText) findViewById(R.id.ResV);
                    txt14.setText(valorm14);
                    break;

                case "Decímetro cúbico dm³":
                    valorVoo = valorVoo * 1;
                    String valorm15 = String.valueOf(valorVoo);
                    EditText txt15 = (EditText) findViewById(R.id.ResV);
                    txt15.setText(valorm15);
                    break;
            }
        }if (Text == "Centímetro cúbico cm³") {
            switch (Text2) {
                case "Metros cúbicos m³":
                    valorVoo = valorVoo *10e-6;
                    String valorm16 = String.valueOf(valorVoo);
                    EditText txt16 = (EditText) findViewById(R.id.ResV);
                    txt16.setText(valorm16);
                    break;
                case "Quilômetros cúbicos km³":
                    valorVoo = valorVoo * 10e-15;
                    String valorm17 = String.valueOf(valorVoo);
                    EditText txt17 = (EditText) findViewById(R.id.ResV);
                    txt17.setText(valorm17);
                    break;

                case "Centímetro cúbico cm³":
                    valorVoo = valorVoo * 1;
                    String valorm18 = String.valueOf(valorVoo);
                    EditText txt18 = (EditText) findViewById(R.id.ResV);
                    txt18.setText(valorm18);
                    break;

                case "Milímetro cúbico mm³":
                    valorVoo = valorVoo * 1000;
                    String valorm19 = String.valueOf(valorVoo);
                    EditText txt19 = (EditText) findViewById(R.id.ResV);
                    txt19.setText(valorm19);
                    break;

                case "Decímetro cúbico dm³":
                    valorVoo = valorVoo * 0.001;
                    String valorm20 = String.valueOf(valorVoo);
                    EditText txt20 = (EditText) findViewById(R.id.ResV);
                    txt20.setText(valorm20);
                    break;
            }
        }if (Text == "Milímetro cúbico mm³") {
            switch (Text2) {
                case "Metros cúbicos m³":
                    valorVoo = valorVoo *10e-9;
                    String valorm21 = String.valueOf(valorVoo);
                    EditText txt21 = (EditText) findViewById(R.id.ResV);
                    txt21.setText(valorm21);
                    break;
                case "Quilômetros cúbicos km³":
                    valorVoo = valorVoo * 10e-18;
                    String valorm22 = String.valueOf(valorVoo);
                    EditText txt22 = (EditText) findViewById(R.id.ResV);
                    txt22.setText(valorm22);
                    break;

                case "Centímetro cúbico cm³":
                    valorVoo = valorVoo * 0.001;
                    String valorm23 = String.valueOf(valorVoo);
                    EditText txt23 = (EditText) findViewById(R.id.ResV);
                    txt23.setText(valorm23);
                    break;

                case "Milímetro cúbico mm³":
                    valorVoo = valorVoo * 1;
                    String valorm24 = String.valueOf(valorVoo);
                    EditText txt24 = (EditText) findViewById(R.id.ResV);
                    txt24.setText(valorm24);
                    break;

                case "Decímetro cúbico dm³":
                    valorVoo = valorVoo * 1e-6;
                    String valorm25 = String.valueOf(valorVoo);
                    EditText txt25 = (EditText) findViewById(R.id.ResV);
                    txt25.setText(valorm25);
                    break;
            }
        }
    }
}

