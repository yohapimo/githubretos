package com.example.reto2festibom;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Fragment_Sucursales extends Fragment {

    Drawable drawable6, drawable7;
    ImageView imagen6, imagen7;

    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__sucursales, container, false);
        // ------------------------------------------------------------------------------------

        //-------------------------------------------------------------
        Resources res6 = getResources();
        drawable6 = res6.getDrawable(R.drawable.sucursalcasa_1, v.getContext().getTheme());

        imagen6 = (ImageView) v.findViewById(R.id.imagen6);
        imagen6.setImageDrawable(drawable6);

        //---------------------------------------------------------------
        Resources res7 = getResources();
        drawable7 = res7.getDrawable(R.drawable.sucursalcastillo_2, v.getContext().getTheme());

        imagen7 = (ImageView) v.findViewById(R.id.imagen7);
        imagen7.setImageDrawable(drawable7);

        // ------------------------------------------------------------------------------------

        return v;
    }

}