package com.example.aluno.aula2803;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void chamarSegundaTela(View view){
        Intent intent = new Intent(this, SegundaTela.class);

        //passsagem de parmetro recuperar dados segunda tela
        intent.putExtra("timeCampeao", "são paulo");
        intent.putExtra("mundiais", 3);
        startActivity(intent);
    }
}
