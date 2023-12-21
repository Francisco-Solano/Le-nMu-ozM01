package com.vedruna.leonmunoze01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText contrasena;
    private TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nombre = findViewById(R.id.Nombre); // Asignar la referencia correcta al EditText del nombre
        contrasena = findViewById(R.id.Contrasena); // Asignar la referencia correcta al EditText de la contraseña
        mensaje = findViewById(R.id.mensajeFinal);
    }

    public void loguear(View view) {

        if (!nombre.getText().toString().equals("admin") || !contrasena.getText().toString().equals("admin")) {
            mensaje.setText("Usuario o contraseña incorrecta");
        } else {
            mensaje.setText("Usuario y contraseña correcta");

            Intent intent = new Intent(this, ContadorActivity.class);
            intent.putExtra("valor", nombre.getText().toString()); // Obtener el texto del EditText y convertirlo a String
            startActivity(intent);
        }
    }
}
