package com.luisagw.puppymascot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder>{
    public static class MascotaViewHolder extends RecyclerView.ViewHolder{


        private ImageView ivContact;
        private TextView tvContact;
        private TextView tvTelefono;
        private ImageButton btnLike;


        public MascotaViewHolder(View itemView) {
            super(itemView);
            ivContact=(ImageView) itemView.findViewById(R.id.ivContact);
            tvContact=(TextView) itemView.findViewById(R.id.tvContact);
            tvTelefono=(TextView) itemView.findViewById(R.id.tvTelefono);
            btnLike=(ImageButton) itemView.findViewById(R.id.btnLike);
        }
    }
    ArrayList<Mascota> contactos;
    Activity activity;

    public MascotaAdapter(ArrayList<Mascota>contactos, Activity activity){
        this.contactos=contactos;
        this.activity= activity;

    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override //Asoscia cada elemnto a la lista ddel card view
    public void onBindViewHolder( MascotaViewHolder contactoViewHolder, int position) {
        final Mascota contacto = contactos.get(position);
        contactoViewHolder.ivContact.setImageResource(contacto.getFoto());
        contactoViewHolder.tvContact.setText(contacto.getNombre());
        contactoViewHolder.tvTelefono.setText(contacto.getRaiting());

        contactoViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Like a "+ contacto.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() { //Cantidad de elementos que contiene la lista
        return contactos.size();
    }
}
