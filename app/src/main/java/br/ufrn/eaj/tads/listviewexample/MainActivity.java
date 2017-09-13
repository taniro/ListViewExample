package br.ufrn.eaj.tads.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Fruta> frutaArrayList =  new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carregaFrutas();

        listView = (ListView) findViewById(R.id.minhalista);
        listView.setAdapter(new FrutasAdapter(this, frutaArrayList));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruta  f =  frutaArrayList.get(i);
                Toast.makeText(MainActivity.this,
                        "Fruta selecionada: "+ f.nome + ", posicao: " + i,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void carregaFrutas(){

        frutaArrayList.add((new Fruta("Laranja", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Maca", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Pera", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Uva", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Goiaba", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Melao", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Limao", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Graviola", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Açaí", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Tomate", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Jaboticaba", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Acerola", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Manga", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Kiwi", R.drawable.fruit)));
        frutaArrayList.add((new Fruta("Morango", R.drawable.fruit)));

    }
}
