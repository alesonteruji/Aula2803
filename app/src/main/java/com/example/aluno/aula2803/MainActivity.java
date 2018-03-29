package com.example.aluno.aula2803;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private ListView listViewTimes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listViewTimes = (ListView) findViewById(R.id.listTimes);

        String times[] = {"Flamengo", "ACP", "Inter", "Avai"};

        ArrayAdapter<String> adapterTimes = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, times);


        listViewTimes.setAdapter(adapterTimes);


    }


    public void chamarSegundaTela(View view){
        Intent intent = new Intent(this, SegundaTela.class);

        //passsagem de parmetro recuperar dados segunda tela
        intent.putExtra("timeCampeao", "são paulo");
        intent.putExtra("mundiais", 3);
        startActivity(intent);
    }
}
