package com.resulozel.python;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PythonOrnekleriListe extends ListActivity {


    ListView listViewDagitim;
    String[] pythonOrnekNedir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        pythonOrnekNedir = getResources().getStringArray(R.array.kotlin_ornekler);

        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.python_ornekleri_liste, R.id.ornekler, pythonOrnekNedir));


        listViewDagitim = getListView();

        listViewDagitim.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String kotlinOrnekAdi = pythonOrnekNedir[position];
                Intent i = new Intent(getApplicationContext(), PythonOrnekleri.class);
                i.putExtra("kotlinornek_adi", kotlinOrnekAdi);
                startActivity(i);
            }
        });

    }

}
