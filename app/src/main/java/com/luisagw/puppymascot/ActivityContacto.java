package com.luisagw.puppymascot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityContacto extends AppCompatActivity {

    private Button botonEnviar;
    private EditText editTextNombre, editTextEmail, editTextMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        botonEnviar = findViewById(R.id.button);
        editTextNombre = findViewById(R.id.editTextTextPersonName2);
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        editTextMensaje = findViewById(R.id.editTextTextPersonName);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener los valores de los TextView
                String nombre = editTextNombre.getText().toString();
                String email = editTextEmail.getText().toString();
                String mensaje = editTextMensaje.getText().toString();

                // Enviar la información a través de la acción correspondiente
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Contacto desde app Android");
                intent.putExtra(Intent.EXTRA_TEXT, "Nombre: " + nombre + "\n" + "Mensaje: " + mensaje);
                startActivity(Intent.createChooser(intent, "Enviar correo electrónico"));
            }
        });
    }
}
