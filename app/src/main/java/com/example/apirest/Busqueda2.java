package com.example.apirest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Busqueda2 extends AppCompatActivity {
    Button buttonSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda2);
        buttonSearch=(Button)findViewById(R.id.btnsearch1);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(Busqueda2.this,Estudiante.class);
                startActivity(i6);
            }
        });
    }
}