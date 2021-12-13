package com.example.reto2festibom;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Fragment_Servicios extends Fragment {

    Drawable drawable3, drawable4, drawable5;
    ImageView imagen3, imagen4, imagen5;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__servicios, container, false);
        // ------------------------------------------------------------------------------------

        //-------------------------------------------------------------
        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.serviciocomida_1, v.getContext().getTheme());

        imagen3 = (ImageView) v.findViewById(R.id.imagen3);
        imagen3.setImageDrawable(drawable3);

        //---------------------------------------------------------------
        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.serviciodecoracion_2, v.getContext().getTheme());

        imagen4 = (ImageView) v.findViewById(R.id.imagen4);
        imagen4.setImageDrawable(drawable4);

        //-----------------------------------------------------------------
        Resources res5 = getResources();
        drawable5 = res5.getDrawable(R.drawable.servicioanimar_3, v.getContext().getTheme());

        imagen5 = (ImageView) v.findViewById(R.id.imagen5);
        imagen5.setImageDrawable(drawable5);

        // ------------------------------------------------------------------------------------

        return v;

    }

}