package com.example.apirest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seleccion extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Seleccion.this, Busqueda.class);
                startActivity(i2);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i3 = new Intent(Seleccion.this, Busqueda2.class);
                startActivity(i3);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                Intent i4 = new Intent(Seleccion.this,Busqueda3.class);
                startActivity(i4);
            }
        });
        //retroceder una activity
        //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //public boolean onOptionsItemSelected(@NonNull MenuItem item){
    //  switch (item.getItemId()){
    //    case android.R.id.home:
    //      finish();
    //       return true;
}

   //  return super.onOptionsItemSelected(item);

  //  }
//}