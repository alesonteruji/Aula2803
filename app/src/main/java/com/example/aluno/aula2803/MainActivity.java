package com.example.aluno.aula2803;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener{



    private ListView listViewTimes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listViewTimes = (ListView) findViewById(R.id.listTimes);

        String times[] = {"Flamengo", "ACP", "Inter", "Avai"};

        ArrayAdapter<String> adapterTimes = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, times);


        List<Time> listaTimes = new ArrayList<>();
        listaTimes.add(new Time(1L,"inter", "milan", R.drawable.inter));
        AdapterTimes adapter = new AdapterTimes(this, listaTimes);


//        listViewTimes.setAdapter(adapterTimes);
        listViewTimes.setAdapter(adapter);


        listViewTimes.setOnItemClickListener(this);

        listViewTimes.setOnItemLongClickListener(this);


    }


    public void chamarSegundaTela(View view){
        Intent intent = new Intent(this, SegundaTela.class);

        //passsagem de parmetro recuperar dados segunda tela
        intent.putExtra("timeCampeao", "são paulo");
        intent.putExtra("mundiais", 3);
        startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Log.i("MainActivity", parent.getItemAtPosition(position).toString());
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("MainActivity", parent.getItemAtPosition(position).toString());
        return false;
    }
}
