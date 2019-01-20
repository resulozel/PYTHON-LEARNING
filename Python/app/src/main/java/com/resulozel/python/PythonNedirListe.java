package com.resulozel.python;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PythonNedirListe extends ListActivity {


    ListView listViewDagitim;
    String[] PythonNedir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        PythonNedir = getResources().getStringArray(R.array.kotlin_bilgiler);

        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.python_nedir_liste, R.id.python_nedir_isimler, PythonNedir));


        listViewDagitim = getListView();

        listViewDagitim.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String kotlinNedirAdi = PythonNedir[position];
                Intent i = new Intent(getApplicationContext(), PythonNedir.class);
                i.putExtra("kotlinnedir_adi", kotlinNedirAdi);
                startActivity(i);
            }
        });



    }
}
