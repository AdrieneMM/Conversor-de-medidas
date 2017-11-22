package com.example.alunos.conversordemedidas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import static com.example.alunos.conversordemedidas.R.id.RVM;
import static com.example.alunos.conversordemedidas.R.id.spinner;


public class Massa extends AppCompatActivity {
    Spinner spinner;
    Spinner spinner3;
    private String[] turmas = {"Tonelada t", "Kilograma kg", "Grama g", "Miligrama mg","Libra lb","Onça oz","Arroba @"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massa);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, turmas);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner3.setAdapter(adapter);
    }
    public void VoltarMassa(View v){
        Intent intent = new Intent(this, TelaInicial.class);
        startActivity(intent);
    }
    public void ConversorMassa(View ma) {
        EditText valorM = (EditText) findViewById(R.id.RVM);
        double valor = Double.parseDouble(valorM.getText().toString());
        String Text = spinner.getSelectedItem().toString();
        String Text2 = spinner3.getSelectedItem().toString();

        if (Text == "Tonelada t") {
            switch (Text2) {
                case "Kilograma kg":
                    valor = valor * 1000;
                    String valorm1 = String.valueOf(valor);
                    EditText txt1 = (EditText) findViewById(R.id.ResM);
                    txt1.setText(valorm1);
                    break;


                case "Miligrama mg":
                    valor = valor * 1000000000;
                    String valorm2 = String.valueOf(valor);
                    EditText txt2 = (EditText) findViewById(R.id.ResM);
                    txt2.setText(valorm2);
                    break;

                case "Grama g":
                    valor = valor * 100000;
                    String valorm3 = String.valueOf(valor);
                    EditText txt3 = (EditText) findViewById(R.id.ResM);
                    txt3.setText(valorm3);
                    break;

                case "Libra lb":
                    valor = valor * 2679.2340605668;
                    String valorm4 = String.valueOf(valor);
                    EditText txt4 = (EditText) findViewById(R.id.ResM);
                    txt4.setText(valorm4);
                    break;

                case "Onça oz":
                    valor = valor * 35274;
                    String valorm5 = String.valueOf(valor);
                    EditText txt5 = (EditText) findViewById(R.id.ResM);
                    txt5.setText(valorm5);
                    break;

                case "Arroba @":
                    valor = valor * 68.078154;
                    String valorm6 = String.valueOf(valor);
                    EditText txt6 = (EditText) findViewById(R.id.ResM);
                    txt6.setText(valorm6);
                    break;
                case "Tonelada t":
                    valor = valor * 1;
                    String valorm7 = String.valueOf(valor);
                    EditText txt7 = (EditText) findViewById(R.id.ResM);
                    txt7.setText(valorm7);
                    break;
            }

        } else if (Text == "Kilograma kg") {
            switch (Text2) {
                case "Tonelada t":
                    valor = valor * 0.001;
                    String valorm8 = String.valueOf(valor);
                    EditText txt8 = (EditText) findViewById(R.id.ResM);
                    txt8.setText(valorm8);
                    break;
                case "Kilograma kg":
                    valor = valor * 1;
                    String valorm9 = String.valueOf(valor);
                    EditText txt9= (EditText) findViewById(R.id.ResM);
                    txt9.setText(valorm9);
                    break;

                case "Miligrama mg":
                    valor = valor * 1000000;
                    String valorm10 = String.valueOf(valor);
                    EditText txt10 = (EditText) findViewById(R.id.ResM);
                    txt10.setText(valorm10);
                    break;

                case "Grama g":
                    valor = valor * 1000;
                    String valorm11 = String.valueOf(valor);
                    EditText txt11 = (EditText) findViewById(R.id.ResM);
                    txt11.setText(valorm11);
                    break;

                case "Libra lb":
                    valor = valor * 2.679234;
                    String valorm12 = String.valueOf(valor);
                    EditText txt12 = (EditText) findViewById(R.id.ResM);
                    txt12.setText(valorm12);
                    break;

                case "Onça oz":
                    valor = valor * 35.273991;
                    String valorm13 = String.valueOf(valor);
                    EditText txt13 = (EditText) findViewById(R.id.ResM);
                    txt13.setText(valorm13);
                    break;

                case "Arroba @":
                    valor = valor * 0.0680781;
                    String valorm14 = String.valueOf(valor);
                    EditText txt14 = (EditText) findViewById(R.id.ResM);
                    txt14.setText(valorm14);
                    break;
            }

        } else if (Text == "Grama g") {
            switch (Text2) {
                case "Tonelada t":
                    valor = valor * 0.000001;
                    String valorm15 = String.valueOf(valor);
                    EditText txt15 = (EditText) findViewById(R.id.ResM);
                    txt15.setText(valorm15);
                    break;

                case "Grama g":
                    valor = valor * 1;
                    String valorm16 = String.valueOf(valor);
                    EditText txt16 = (EditText) findViewById(R.id.ResM);
                    txt16.setText(valorm16);
                    break;


                case "Miligrama mg":
                    valor = valor * 1000;
                    String valorm17 = String.valueOf(valor);
                    EditText txt17 = (EditText) findViewById(R.id.ResM);
                    txt17.setText(valorm17);
                    break;

                case "Kilograma kg":
                    valor = valor * 0.001;
                    String valorm18 = String.valueOf(valor);
                    EditText txt18 = (EditText) findViewById(R.id.ResM);
                    txt18.setText(valorm18);
                    break;

                case "Libra lb":
                    valor = valor * 0.0026792341;
                    String valorm19 = String.valueOf(valor);
                    EditText txt19 = (EditText) findViewById(R.id.ResM);
                    txt19.setText(valorm19);
                    break;

                case "Onça oz":
                    valor = valor * 0.0352739907;
                    String valorm20 = String.valueOf(valor);
                    EditText txt20 = (EditText) findViewById(R.id.ResM);
                    txt20.setText(valorm20);
                    break;

                case "Arroba @":
                    valor = valor * 0.0000680782;
                    String valorm21 = String.valueOf(valor);
                    EditText txt21 = (EditText) findViewById(R.id.ResM);
                    txt21.setText(valorm21);
                    break;
            }

        } else if (Text == "Miligrama mg") {
            switch (Text2) {
                case "Tonelada t":
                    valor = valor * 0.0000000010;
                    String valorm23= String.valueOf(valor);
                    EditText txt23 = (EditText) findViewById(R.id.ResM);
                    txt23.setText(valorm23);
                    break;

                case "Miligrama mg":
                    valor = valor * 1;
                    String valorm24 = String.valueOf(valor);
                    EditText txt24 = (EditText) findViewById(R.id.ResM);
                    txt24.setText(valorm24);
                    break;

                case "Grama g":
                    valor = valor * 0.001;
                    String valorm25 = String.valueOf(valor);
                    EditText txt25 = (EditText) findViewById(R.id.ResM);
                    txt25.setText(valorm25);
                    break;

                case "Kilograma kg":
                    valor = valor * 0.000001;
                    String valorm26 = String.valueOf(valor);
                    EditText txt26 = (EditText) findViewById(R.id.ResM);
                    txt26.setText(valorm26);
                    break;

                case "Libra lb":
                    valor = valor * 0.0000026792;
                    String valorm27 = String.valueOf(valor);
                    EditText txt27 = (EditText) findViewById(R.id.ResM);
                    txt27.setText(valorm27);
                    break;

                case "Onça oz":
                    valor = valor * 0.0000352740;
                    String valorm28 = String.valueOf(valor);
                    EditText txt28 = (EditText) findViewById(R.id.ResM);
                    txt28.setText(valorm28);
                    break;

                case "Arroba @":
                    valor = valor * 0.0000000681;
                    String valorm29 = String.valueOf(valor);
                    EditText txt29 = (EditText) findViewById(R.id.ResM);
                    txt29.setText(valorm29);
                    break;
            }
        } else if (Text == "Libra lb") {
            switch (Text2) {
                case "Tonelada t":
                    valor = valor * 0.0003732410;
                    String valorm30 = String.valueOf(valor);
                    EditText txt30 = (EditText) findViewById(R.id.ResM);
                    txt30.setText(valorm30);
                    break;

                case "Libra lb":
                    valor = valor * 1;
                    String valorm31 = String.valueOf(valor);
                    EditText txt31 = (EditText) findViewById(R.id.ResM);
                    txt31.setText(valorm31);
                    break;

                case "Grama g":
                    valor = valor * 373.241;
                    String valorm32 = String.valueOf(valor);
                    EditText txt32 = (EditText) findViewById(R.id.ResM);
                    txt32.setText(valorm32);
                    break;

                case "Kilograma kg":
                    valor = valor * 0.373241;
                    String valorm33 = String.valueOf(valor);
                    EditText txt33 = (EditText) findViewById(R.id.ResM);
                    txt33.setText(valorm33);
                    break;

                case "Miligrama mg":
                    valor = valor * 373241;
                    String valorm34 = String.valueOf(valor);
                    EditText txt34 = (EditText) findViewById(R.id.ResM);
                    txt34.setText(valorm34);
                    break;

                case "Onça oz":
                    valor = valor * 13.1656995714;
                    String valorm35 = String.valueOf(valor);
                    EditText txt35 = (EditText) findViewById(R.id.ResM);
                    txt35.setText(valorm35);
                    break;

                case "Arroba @":
                    valor = valor * 0.0254095582;
                    String valorm36 = String.valueOf(valor);
                    EditText txt36 = (EditText) findViewById(R.id.ResM);
                    txt36.setText(valorm36);
                    break;
            }
        } else if (Text == "Onça oz") {
            switch (Text2) {
                case "Tonelada t":
                    valor = valor * 0.0000283495;
                    String valorm37 = String.valueOf(valor);
                    EditText txt37 = (EditText) findViewById(R.id.ResM);
                    txt37.setText(valorm37);
                    break;
                case "Onça oz":
                    valor = valor * 1;
                    String valorm38 = String.valueOf(valor);
                    EditText txt38 = (EditText) findViewById(R.id.ResM);
                    txt38.setText(valorm38);
                    break;


                case "Grama g":
                    valor = valor * 28.3495;
                    String valorm39 = String.valueOf(valor);
                    EditText txt39 = (EditText) findViewById(R.id.ResM);
                    txt39.setText(valorm39);
                    break;

                case "Kilograma kg":
                    valor = valor * 0.0283495;
                    String valorm40 = String.valueOf(valor);
                    EditText txt40 = (EditText) findViewById(R.id.ResM);
                    txt40.setText(valorm40);
                    break;

                case "Miligrama mg":
                    valor = valor * 28349.5;
                    String valorm41 = String.valueOf(valor);
                    EditText txt41 = (EditText) findViewById(R.id.ResM);
                    txt41.setText(valorm41);
                    break;

                case "Libra lb":
                    valor = valor * 0.0759549460;
                    String valorm42 = String.valueOf(valor);
                    EditText txt42 = (EditText) findViewById(R.id.ResM);
                    txt42.setText(valorm42);
                    break;

                case "Arroba @":
                    valor = valor * 0.0019299816;
                    String valorm43 = String.valueOf(valor);
                    EditText txt43 = (EditText) findViewById(R.id.ResM);
                    txt43.setText(valorm43);
                    break;
            }
        } else if (Text == "Arroba @") {
            switch (Text2) {
                case "Tonelada t":
                    valor = valor * 0.014689;
                    String valorm44 = String.valueOf(valor);
                    EditText txt44 = (EditText) findViewById(R.id.ResM);
                    txt44.setText(valorm44);
                    break;

                case "Arroba @":
                    valor = valor * 1;
                    String valorm45 = String.valueOf(valor);
                    EditText txt45 = (EditText) findViewById(R.id.ResM);
                    txt45.setText(valorm45);
                    break;

                case "Grama g":
                    valor = valor * 14689;
                    String valorm46 = String.valueOf(valor);
                    EditText txt46 = (EditText) findViewById(R.id.ResM);
                    txt46.setText(valorm46);
                    break;

                case "Kilograma kg":
                    valor = valor * 14.689;
                    String valorm47 = String.valueOf(valor);
                    EditText txt47 = (EditText) findViewById(R.id.ResM);
                    txt47.setText(valorm47);
                    break;

                case "Miligrama mg":
                    valor = valor * 14689000;
                    String valorm48 = String.valueOf(valor);
                    EditText txt48 = (EditText) findViewById(R.id.ResM);
                    txt48.setText(valorm48);
                    break;

                case "Libra lb":
                    valor = valor * 39.3552691157;
                    String valorm49 = String.valueOf(valor);
                    EditText txt49 = (EditText) findViewById(R.id.ResM);
                    txt49.setText(valorm49);
                    break;

                case "Onça oz":
                    valor = valor * 518.1396497293;
                    String valorm50 = String.valueOf(valor);
                    EditText txt50 = (EditText) findViewById(R.id.ResM);
                    txt50.setText(valorm50);
                    break;
            }
        }
    }
}