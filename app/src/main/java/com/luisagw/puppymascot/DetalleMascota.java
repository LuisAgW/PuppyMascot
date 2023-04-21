package com.luisagw.puppymascot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.luisagw.puppymascot.adapter.MascotaAdapter;
import com.luisagw.puppymascot.pojo.Mascota;

import java.util.ArrayList;

public class DetalleMascota extends AppCompatActivity {


    ArrayList<Mascota> contactos;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotass);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializaListaMascotas();
        inicializaAdaptador();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public MascotaAdapter adaptadorr;
    private void inicializaAdaptador(){
        adaptadorr = new MascotaAdapter(contactos, this);
        listaMascotas.setAdapter(adaptadorr);
    }
    public void inicializaListaMascotas(){

        contactos = new ArrayList<Mascota>();

        contactos.add(new Mascota("Waffel"," ",R.drawable.ik));
        contactos.add(new Mascota("Malvavisco"," ",R.drawable.poky));
        contactos.add(new Mascota("Tom"," ",R.drawable.spoke));
    }
}