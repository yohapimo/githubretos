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

public class MainActivity4 extends AppCompatActivity {

    Drawable drawable6, drawable7;
    ImageView imagen6, imagen7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //-------------------------------------------------------------
        Resources res6 = getResources();
        drawable6 = res6.getDrawable(R.drawable.sucursalcasa_1, getTheme());

        imagen6 = (ImageView) findViewById(R.id.imagen6);
        imagen6.setImageDrawable(drawable6);

        //---------------------------------------------------------------
        Resources res7 = getResources();
        drawable7 = res7.getDrawable(R.drawable.sucursalcastillo_2, getTheme());

        imagen7 = (ImageView) findViewById(R.id.imagen7);
        imagen7.setImageDrawable(drawable7);
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

        return super.onOptionsItemSelected(item);
    }
    /* ---------------------------------------------------*/
}