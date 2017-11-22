package com.example.alunos.conversordemedidas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);


    }
    public void IrMassas(View v){
        Intent intent = new Intent(this, Massa.class);
        startActivity(intent);
    }
    public void IrComprimento(View v){
        Intent intent = new Intent(this, comprimento.class);
        startActivity(intent);
    }
    public void IrTemperatura(View v){
        Intent intent = new Intent(this, temperatura.class);
        startActivity(intent);
    }
    public void IrVelocidade(View v){
        Intent intent = new Intent(this, velocidade.class);
        startActivity(intent);
    }
    public void IrVolume(View v){
        Intent intent = new Intent(this, volume.class);
        startActivity(intent);
    }
}
