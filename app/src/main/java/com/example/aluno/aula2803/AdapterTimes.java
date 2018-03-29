package com.example.aluno.aula2803;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aluno on 28/03/18.
 */

public class AdapterTimes extends BaseAdapter {

    Context contexto;
    List<Time> times;


    public AdapterTimes(Context contexto, List<Time> times) {
        this.contexto = contexto;
        this.times = times;
    }




    //retorna quantidade de linhas que tera a lista
    @Override
    public int getCount() {
        return times.size();
    }

    //retorna a posicao que recebe como parametro
    @Override
    public Object getItem(int position) {
        return times.get(position);
    }


    //Retorna id do objeto da lista
    @Override
    public long getItemId(int position) {
        return times.get(position).getId();
    }



    //retorna a visao, o arquivo xml criado, precisa buscar arquivo, setar o que ira ser exibido, imagem e as informações
    //
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewLinha = LayoutInflater.from(contexto).inflate(R.layout.linha_lista_times, parent, false);
        ImageView imagemTime = (ImageView) viewLinha.findViewById(R.id.imageViewTime);

        TextView nome = (TextView) viewLinha.findViewById(R.id.textViewNome);
        TextView cidade = (TextView) viewLinha.findViewById(R.id.textViewCidade);

        Time time = times.get(position);

        imagemTime.setImageResource(time.getImagem());
        nome.setText(time.getNome());
        cidade.setText(time.getCidade());


        return viewLinha;
    }
}
