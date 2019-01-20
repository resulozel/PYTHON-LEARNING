package com.resulozel.python;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Hosgeldin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.python_hosgeldin);

        Thread zamanlayici=new Thread()
        {
            public  void run()
            {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent mainActivityCagir=new Intent(getApplicationContext(),PythonHosgeldin.class);
                    startActivity(mainActivityCagir);

                }
            }
        };
        zamanlayici.start();


    }
    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }
}
