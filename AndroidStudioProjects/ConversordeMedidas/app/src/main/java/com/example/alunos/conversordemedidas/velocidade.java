package com.example.alunos.conversordemedidas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class velocidade extends AppCompatActivity {

    private String[] velocidade = {"Metros por segundo (m/s)", "Centímetros por segundo (cm/s)", "Pés por segundo (ft/s)", "Milhas por hora (mph)", "Quilômetros por hora (km/h)"};
    Spinner spinner10;
    Spinner spinner11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_velocidade);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, velocidade);
         spinner10 = (Spinner) findViewById(R.id.spinner10);
         spinner11 = (Spinner) findViewById(R.id.spinner11);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner10.setAdapter(adapter);
        spinner11.setAdapter(adapter);
    }

    public void VoltarVelocidade(View v) {
        Intent intent = new Intent(this, TelaInicial.class);
        startActivity(intent);
    }

    public void ConversorVelocidade(View ma) {
        EditText valorV = (EditText) findViewById(R.id.RVVe);
        double valorVe = Double.parseDouble(valorV.getText().toString());
        String Text = spinner10.getSelectedItem().toString();
        String Text2 = spinner11.getSelectedItem().toString();

        if (Text == "Metros por segundo (m/s)") {
            switch (Text2) {
                case "Centímetros por segundo (cm/s)":
                    valorVe = valorVe * 100;
                    String valorV0 = String.valueOf(valorVe);
                    EditText txtV0 = (EditText) findViewById(R.id.ResVe);
                    txtV0.setText(valorV0);
                    break;
                case "Pés por segundo (ft/s)":
                    valorVe = valorVe * 3.2808;
                    String valorV1 = String.valueOf(valorVe);
                    EditText txtV1 = (EditText) findViewById(R.id.ResVe);
                    txtV1.setText(valorV1);
                    break;
                case "Milhas por hora (mph)":
                    valorVe = valorVe * 2.2371;
                    String valorV2 = String.valueOf(valorVe);
                    EditText txtV2 = (EditText) findViewById(R.id.ResVe);
                    txtV2.setText(valorV2);
                    break;
                case "Quilômetros por hora (km/h)":
                    valorVe = valorVe * 3.5997;
                    String valorV3 = String.valueOf(valorVe);
                    EditText txtV3 = (EditText) findViewById(R.id.ResVe);
                    txtV3.setText(valorV3);
                    break;
                case "Metros por segundo (m/s)":
                    valorVe = valorVe * 1;
                    String valorV4 = String.valueOf(valorVe);
                    EditText txtV4 = (EditText) findViewById(R.id.ResVe);
                    txtV4.setText(valorV4);
                    break;

            }

        }else if (Text == "Centímetros por segundo (cm/s)") {
            switch (Text2) {
                case "Centímetros por segundo (cm/s)":
                    valorVe = valorVe * 1;
                    String valorV5 = String.valueOf(valorVe);
                    EditText txtV5 = (EditText) findViewById(R.id.ResVe);
                    txtV5.setText(valorV5);
                    break;
                case "Pés por segundo (ft/s)":
                    valorVe = valorVe * 0.0328;
                    String valorV6 = String.valueOf(valorVe);
                    EditText txtV6 = (EditText) findViewById(R.id.ResVe);
                    txtV6.setText(valorV6);
                    break;
                case "Milhas por hora (mph)":
                    valorVe = valorVe * 0.0224;
                    String valorV7 = String.valueOf(valorVe);
                    EditText txtV7 = (EditText) findViewById(R.id.ResVe);
                    txtV7.setText(valorV7);
                    break;
                case "Quilômetros por hora (km/h)":
                    valorVe = valorVe * 0.036 ;
                    String valorV8 = String.valueOf(valorVe);
                    EditText txtV8 = (EditText) findViewById(R.id.ResVe);
                    txtV8.setText(valorV8);
                    break;
                case "Metros por segundo (m/s)":
                    valorVe = valorVe * 0.01;
                    String valorV9 = String.valueOf(valorVe);
                    EditText txtV9 = (EditText) findViewById(R.id.ResVe);
                    txtV9.setText(valorV9);
                    break;

            }

        }else if (Text == "Pés por segundo (ft/s)") {
            switch (Text2) {
                case "Centímetros por segundo (cm/s)":
                    valorVe = valorVe * 30.48;
                    String valorV10 = String.valueOf(valorVe);
                    EditText txtV10 = (EditText) findViewById(R.id.ResVe);
                    txtV10.setText(valorV10);
                    break;
                case "Pés por segundo (ft/s)":
                    valorVe = valorVe * 1;
                    String valorV11 = String.valueOf(valorVe);
                    EditText txtV11 = (EditText) findViewById(R.id.ResVe);
                    txtV11.setText(valorV11);
                    break;
                case "Milhas por hora (mph)":
                    valorVe = valorVe * 0.6818 ;
                    String valorV12 = String.valueOf(valorVe);
                    EditText txtV12 = (EditText) findViewById(R.id.ResVe);
                    txtV12.setText(valorV12);
                    break;
                case "Quilômetros por hora (km/h)":
                    valorVe = valorVe * 1.09728;
                    String valorV13 = String.valueOf(valorVe);
                    EditText txtV13 = (EditText) findViewById(R.id.ResVe);
                    txtV13.setText(valorV13);
                    break;
                case "Metros por segundo (m/s)":
                    valorVe = valorVe * 0.3048;
                    String valorV14 = String.valueOf(valorVe);
                    EditText txtV14 = (EditText) findViewById(R.id.ResVe);
                    txtV14.setText(valorV14);
                    break;

            }

        }else if (Text == "Milhas por hora (mph)") {
            switch (Text2) {
                case "Centímetros por segundo (cm/s)":
                    valorVe = valorVe * 44.704;
                    String valorV15 = String.valueOf(valorVe);
                    EditText txtV15 = (EditText) findViewById(R.id.ResVe);
                    txtV15.setText(valorV15);
                    break;
                case "Pés por segundo (ft/s)":
                    valorVe = valorVe * 1.466666666667;
                    String valorV16 = String.valueOf(valorVe);
                    EditText txtV16 = (EditText) findViewById(R.id.ResVe);
                    txtV16.setText(valorV16);
                    break;
                case "Milhas por hora (mph)":
                    valorVe = valorVe * 1 ;
                    String valorV17 = String.valueOf(valorVe);
                    EditText txtV17 = (EditText) findViewById(R.id.ResVe);
                    txtV17.setText(valorV17);
                    break;
                case "Quilômetros por hora (km/h)":
                    valorVe = valorVe * 1.609344;
                    String valorV18 = String.valueOf(valorVe);
                    EditText txtV18 = (EditText) findViewById(R.id.ResVe);
                    txtV18.setText(valorV18);
                    break;
                case "Metros por segundo (m/s)":
                    valorVe = valorVe * 0.447;
                    String valorV19 = String.valueOf(valorVe);
                    EditText txtV19 = (EditText) findViewById(R.id.ResVe);
                    txtV19.setText(valorV19);
                    break;

            }

        }else if (Text == "Quilômetros por hora (km/h)") {
            switch (Text2) {
                case "Centímetros por segundo (cm/s)":
                    valorVe = valorVe * 27.777777777778;
                    String valorV15 = String.valueOf(valorVe);
                    EditText txtV15 = (EditText) findViewById(R.id.ResVe);
                    txtV15.setText(valorV15);
                    break;
                case "Pés por segundo (ft/s)":
                    valorVe = valorVe * 0.9113;
                    String valorV16 = String.valueOf(valorVe);
                    EditText txtV16 = (EditText) findViewById(R.id.ResVe);
                    txtV16.setText(valorV16);
                    break;
                case "Milhas por hora (mph)":
                    valorVe = valorVe * 0.6214 ;
                    String valorV17 = String.valueOf(valorVe);
                    EditText txtV17 = (EditText) findViewById(R.id.ResVe);
                    txtV17.setText(valorV17);
                    break;
                case "Quilômetros por hora (km/h)":
                    valorVe = valorVe * 1;
                    String valorV18 = String.valueOf(valorVe);
                    EditText txtV18 = (EditText) findViewById(R.id.ResVe);
                    txtV18.setText(valorV18);
                    break;
                case "Metros por segundo (m/s)":
                    valorVe = valorVe * 0.2778;
                    String valorV19 = String.valueOf(valorVe);
                    EditText txtV19 = (EditText) findViewById(R.id.ResVe);
                    txtV19.setText(valorV19);
                    break;

            }

        }
    }
}
