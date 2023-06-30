package com.example.apirest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Busqueda extends AppCompatActivity {
    Button buttonsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);
        buttonsearch=(Button)findViewById(R.id.buttonsearch);

        buttonsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent i5 = new Intent(Busqueda.this,Docente.class);
                    startActivity(i5);

            }
        });





        //retroceder una activity
      //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //public boolean onOptionsItemSelected(@NonNull MenuItem item) {
      //  switch (item.getItemId()) {
        //    case android.R.id.home:
         //       finish();
        //        return true;

        }
       // return super.onOptionsItemSelected(item);
   // }
//}