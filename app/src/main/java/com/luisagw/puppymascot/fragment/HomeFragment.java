package com.luisagw.puppymascot.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisagw.puppymascot.pojo.Mascota;
import com.luisagw.puppymascot.R;
import com.luisagw.puppymascot.adapter.MascotaAdapter;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    ArrayList<Mascota> contactos;
    private RecyclerView listaMascotas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);

        // Inflate the layout for this fragment
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializaListaMascotas();
        inicializaAdaptador();

        return v;

    }
    public MascotaAdapter adaptador;

    private void inicializaAdaptador(){
        adaptador = new MascotaAdapter(contactos, getActivity());
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