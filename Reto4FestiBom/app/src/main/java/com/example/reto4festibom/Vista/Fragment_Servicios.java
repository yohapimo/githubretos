package com.example.reto4festibom.Vista;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.reto4festibom.Modelo.Adaptador;
import com.example.reto4festibom.Modelo.BaseDatos.MotorBaseDatosSQLite;
import com.example.reto4festibom.Modelo.Entidad;
import com.example.reto4festibom.R;

import java.util.ArrayList;

public class Fragment_Servicios extends Fragment {

    String TAG = "Fragment_Servicios";

    View v;

    ListView listaServicios;
    Adaptador adaptador;

    // CONEXION A LA BASE DE DATOS: SQLite
    MotorBaseDatosSQLite conectar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__servicios, container, false);
        //-----------------------------------------------------------------------------
        listaServicios = (ListView) v.findViewById(R.id.lista_servicios);
        adaptador = new Adaptador(GetArrayItems(), getContext());

        listaServicios.setAdapter(adaptador);

        //-----------------------------------------------------------------------------
        return v;
    }

    private ArrayList<Entidad> GetTablaServicios(){
        ArrayList<Entidad> listaServicios = new ArrayList<>();
        conectar = new MotorBaseDatosSQLite(getContext(), "TiendaServicios", null, 1);
        SQLiteDatabase db_leer = conectar.getReadableDatabase();
        Cursor cursor = db_leer.rawQuery("SELECT * FROM servicios", null);
        Log.v(TAG, "Leyendo base de datos");

        while (cursor.moveToNext()){
            Log.v(TAG, "Leyendo base de datos");
            listaServicios.add(new Entidad(R.drawable.serviciocomida_1, cursor.getString(0), cursor.getString(1)));
        }

        return listaServicios;
    }
    private ArrayList<Entidad> GetArrayItems(){
        ArrayList<Entidad> listaItems = new ArrayList<Entidad>();
        listaItems.add(new Entidad(R.drawable.serviciocomida_1, "Comida", "El mejor servicio en comidas y bufet's"));
        listaItems.add(new Entidad(R.drawable.serviciodecoracion_2, "Ambiente", "La mejor decoración y ambiente"));
        listaItems.add(new Entidad(R.drawable.servicioanimar_3, "Música", "La mejor música"));

        return listaItems;
    }
}