package com.ramaria.androidexamplefragments.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ramaria.androidexamplefragments.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class ContatosFragment extends Fragment {

    private TextView textContatos;

    public ContatosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contatos, container, false);
        textContatos = view.findViewById(R.id.textContatos);
        textContatos.setText("Contatos alterado");
        return view;
    }
}
