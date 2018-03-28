package com.example.aluno.aula2803;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SegundaTela extends AppCompatActivity {

    private final String TAG="SegundaTEla";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        //Pegar os valores por parametro...
        Bundle bundle = getIntent().getExtras();



        String time = bundle.getString("timeCampeao");
        Integer titulos = bundle.getInt("mundiais");


        Log.i(TAG, "Time: "+time);
        Log.i(TAG, "Titulos: "+titulos);

    }




}
