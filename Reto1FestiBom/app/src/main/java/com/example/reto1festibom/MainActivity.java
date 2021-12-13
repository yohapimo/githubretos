package com.example.reto1festibom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    Drawable drawable8;
    ImageView imagen8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-------------------------------------------------------------
        Resources res8 = getResources();
        drawable8 = res8.getDrawable(R.drawable.logoempresa_9, getTheme());

        imagen8 = (ImageView) findViewById(R.id.imagen8);
        imagen8.setImageDrawable(drawable8);

        //---------------------------------------------------------------
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
        if (id == R.id.servicios){
            Intent Servivios = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(Servivios);
            Toast.makeText(this, "oprimio el boton servicios", Toast.LENGTH_SHORT).show();

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