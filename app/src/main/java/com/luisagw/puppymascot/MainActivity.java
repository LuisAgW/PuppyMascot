package com.luisagw.puppymascot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> contactos;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializaListaMascotas();
        inicializaAdaptador();
    }

    public void secondActivity(View v){
        Intent intent = new Intent(this, DetalleMascota.class);
        startActivity(intent);
    }

    public MascotaAdapter adaptador;
    private void inicializaAdaptador(){
        adaptador = new MascotaAdapter(contactos, this);
        listaMascotas.setAdapter(adaptador);
    }
    public void inicializaListaMascotas(){

        contactos = new ArrayList<Mascota>();

        contactos.add(new Mascota("Waffel","6",R.drawable.ik));
        contactos.add(new Mascota("Malvavisco","3",R.drawable.poky));
        contactos.add(new Mascota("Cheto","2",R.drawable.pochi));
        contactos.add(new Mascota("Spike","5",R.drawable.pelusa));
        contactos.add(new Mascota("Tom","3",R.drawable.spoke));
    }


}