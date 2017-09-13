package br.ufrn.eaj.tads.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class FrutasAdapter extends BaseAdapter {

    Context context;
    List<Fruta>  frutas;

    public FrutasAdapter (Context context, List<Fruta> frutas){
        super();
        this.context = context;
        this.frutas = frutas;
    }

    @Override
    public int getCount() {
        return frutas != null ? frutas.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return frutas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = LayoutInflater.from(context).inflate(R.layout.fruta_inflater, parent, false);
        TextView t = v.findViewById(R.id.nomeFruta);
        ImageView img =  v.findViewById(R.id.imgFruta);

        Fruta fruta = frutas.get(position);

        t.setText(fruta.nome);
        img.setImageResource(fruta.img);

        return v;
    }
}
