package com.resulozel.python;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PythonHosgeldin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hosgeldin);

        Button Kotlin = (Button) findViewById(R.id.python);
        Button KotlinDers= (Button) findViewById(R.id.python_dersleri);
        Button KotlinOrnek=(Button) findViewById(R.id.python_ornekleri);
        Button KotlinJava=(Button) findViewById(R.id.python_java);




        Kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LinuxActivityCagir = new Intent("com.resulozel.python.PYTHONNEDIRLISTE");
                startActivity(LinuxActivityCagir);
            }
        });


        KotlinDers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LinuxActivityCagir2 = new Intent("com.resulozel.python.PYTHONDERSLERILISTE");
                startActivity(LinuxActivityCagir2);
            }
        });



        KotlinOrnek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LinuxActivityCagir3 = new Intent(getApplicationContext(),PythonOrnekleriListe.class);
                startActivity(LinuxActivityCagir3);
            }
        });

        KotlinJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LinuxActivityCagir4 = new Intent("com.resulozel.python.PYTHONJAVA");
                startActivity(LinuxActivityCagir4);
            }
        });


    }

}
