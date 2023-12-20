package com.vedruna.leonmunoze01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ContadorActivity extends AppCompatActivity {
    private TextView textoByNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoByNombre = findViewById(R.id.textoByNombre); // Asignar la referencia correcta al TextView

        Intent intent = this.getIntent();
        String valorRecibido = intent.getStringExtra("valor");

        textoByNombre.setText("Bienvenido " + valorRecibido);
    }
}
