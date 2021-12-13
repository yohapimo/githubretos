package com.example.reto1festibom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Drawable drawable3, drawable4, drawable5;
    ImageView imagen3, imagen4, imagen5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //-------------------------------------------------------------
        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.serviciocomida_1, getTheme());

        imagen3 = (ImageView) findViewById(R.id.imagen3);
        imagen3.setImageDrawable(drawable3);

        //---------------------------------------------------------------
        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.serviciodecoracion_2, getTheme());

        imagen4 = (ImageView) findViewById(R.id.imagen4);
        imagen4.setImageDrawable(drawable4);

        //-----------------------------------------------------------------
        Resources res5 = getResources();
        drawable5 = res5.getDrawable(R.drawable.servicioanimar_3, getTheme());

        imagen5 = (ImageView) findViewById(R.id.imagen5);
        imagen5.setImageDrawable(drawable5);
    }
    /* ---------------------------------------------------*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.productos){
            Intent Productos = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(Productos);
            Toast.makeText(this, "oprimio el boton productos", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.sucursales){
            Intent Sucursales = new Intent(getApplicationContext(), MainActivity4.class);
            startActivity(Sucursales);
            Toast.makeText(this, "oprimio el boton sucursales", Toast.LENGTH_SHORT).show();

        }

        return super.onOptionsItemSelected(item);
    }
    /* ---------------------------------------------------*/
}