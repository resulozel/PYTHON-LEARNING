package com.resulozel.python;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PythonDersleriListe extends ListActivity {

    ListView listViewDagitim;
    String[] pythonDersNedir;

    //ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        pythonDersNedir = getResources().getStringArray(R.array.ders_bilgiler);

        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.python_dersleri_liste, R.id.dersler, pythonDersNedir));


        listViewDagitim = getListView();

        listViewDagitim.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String kotlinNedirAdi = pythonDersNedir[position];
                Intent i = new Intent(getApplicationContext(), PythonDersleri.class);
                i.putExtra("kotlinders_adi", kotlinNedirAdi);
                startActivity(i);
            }
        });

    }
}
