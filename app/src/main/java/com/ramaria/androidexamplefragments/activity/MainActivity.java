package com.ramaria.androidexamplefragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

import com.ramaria.androidexamplefragments.R;
import com.ramaria.androidexamplefragments.fragments.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversas;
    private Button buttonContatos;
    private ConversasFragment conversasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameConteudo, conversasFragment);
        transaction.commit();
        

    }
}
