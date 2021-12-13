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

public class MainActivity2 extends AppCompatActivity {

    Drawable drawable1, drawable2;
    ImageView imagen1, imagen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //-------------------------------------------------------------
        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.productofamiliar_1, getTheme());

        imagen1 = (ImageView) findViewById(R.id.imagen1);
        imagen1.setImageDrawable(drawable1);

        //---------------------------------------------------------------
        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.productoempresa_2, getTheme());

        imagen2 = (ImageView) findViewById(R.id.imagen2);
        imagen2.setImageDrawable(drawable2);

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