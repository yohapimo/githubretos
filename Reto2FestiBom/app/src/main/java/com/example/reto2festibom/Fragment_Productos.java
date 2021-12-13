package com.example.reto2festibom;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Fragment_Productos extends Fragment {

    View v;

    Drawable drawable1, drawable2;
    ImageView imagen1, imagen2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__productos, container, false);
        // ------------------------------------------------------------------------------------

        //*******************CARGUE DE IMAGENES***********************

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.productofamiliar_1, v.getContext().getTheme());

        imagen1 = (ImageView) v.findViewById(R.id.imagen1);
        imagen1.setImageDrawable(drawable1);

        //---------------------------------------------------------------
        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.productoempresa_2, v.getContext().getTheme());

        imagen2 = (ImageView) v.findViewById(R.id.imagen2);
        imagen2.setImageDrawable(drawable2);

        // ------------------------------------------------------------------------------------

        return v;
    }
}