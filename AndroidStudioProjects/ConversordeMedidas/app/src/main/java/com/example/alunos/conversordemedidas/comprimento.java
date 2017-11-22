package com.example.alunos.conversordemedidas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class comprimento extends AppCompatActivity {

    private String[] comprimento = {"Quilômetro (km)", "Centímetro (cm)", "Milímetro (mm)"};
    Spinner spinner8;
    Spinner spinner9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprimento);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, comprimento);
        spinner8 = (Spinner) findViewById(R.id.spinner8);
        spinner9 = (Spinner) findViewById(R.id.spinner9);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(adapter);
        spinner9.setAdapter(adapter);
    }
    public void VoltarComprimento(View v){
        Intent intent = new Intent(this, TelaInicial.class);
        startActivity(intent);
    }
    public void ConversorComprimento(View ma){
        EditText valorCC = (EditText) findViewById(R.id.RVC);
        double valorCCC = Double.parseDouble(valorCC.getText().toString());
        String Text3 = spinner8.getSelectedItem().toString();
        String Text4 = spinner9.getSelectedItem().toString();

        if(Text3=="Quilômetro (km)"){
            switch(Text4){
                case "Centímetro (cm)":
                    valorCCC = valorCCC*100000;
                    String valorC = String.valueOf(valorCCC);
                    EditText txtC = (EditText) findViewById(R.id.ResC);
                    txtC.setText(valorC);
                    break;
                case "Milímetro (mm)":
                    valorCCC = valorCCC*1000000;
                    String valorC1 =  String.valueOf(valorCCC);
                    EditText txtC1 = (EditText) findViewById(R.id.ResC);
                    txtC1.setText(valorC1);
                    break;
                case "Quilômetro (km)":
                    valorCCC = valorCCC*1;
                    String valorC6 =  String.valueOf(valorCCC);
                    EditText txtC6 = (EditText) findViewById(R.id.ResC);
                    txtC6.setText(valorC6);
                    break;


            }

        }else if(Text3=="Centímetro (cm)"){
            switch(Text4){
                case "Quilômetro (km)":
                    valorCCC = valorCCC*0.00001;
                    String valorC2 =  String.valueOf(valorCCC);
                    EditText txtC2 = (EditText) findViewById(R.id.ResC);
                    txtC2.setText(valorC2);
                    break;
                case "Milímetro (mm)":
                    valorCCC = valorCCC*10;
                    String valorC3 =  String.valueOf(valorCCC);
                    EditText txtC3 = (EditText) findViewById(R.id.ResC);
                    txtC3.setText(valorC3);
                    break;
                case "Centímetro (cm)":
                    valorCCC = valorCCC*1;
                    String valorC7 = String.valueOf(valorCCC);
                    EditText txtC7 = (EditText) findViewById(R.id.ResC);
                    txtC7.setText(valorC7);
                    break;


            }

        }else if(Text3=="Milímetro (mm)"){
            switch(Text4){
                case "Quilômetro (km)":
                    valorCCC = valorCCC*0.000001;
                    String valorC4 =  String.valueOf(valorCCC);
                    EditText txtC4 = (EditText) findViewById(R.id.ResC);
                    txtC4.setText(valorC4);
                    break;
                case "Centímetro (cm)":
                    valorCCC = valorCCC*0.1;
                    String valorC5 =  String.valueOf(valorCCC);
                    EditText txtC5 = (EditText) findViewById(R.id.ResC);
                    txtC5.setText(valorC5);
                    break;
                case "Milímetro (mm)":
                    valorCCC = valorCCC*1;
                    String valorC8 =  String.valueOf(valorCCC);
                    EditText txtC8 = (EditText) findViewById(R.id.ResC);
                    txtC8.setText(valorC8);
                    break;



            }

        }


    }
}
