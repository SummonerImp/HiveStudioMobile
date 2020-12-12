package com.example.projetotcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.projetotcc.models.Fotografo;

public class Perfil_Fotografo extends AppCompatActivity {
    Button btnSolicitar;
    TextView txtNome, txtNota, txtXp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil__fotografo);
        getSupportActionBar().hide();
        getWindow().setNavigationBarColor(getResources().getColor(R.color.bistre));
        getWindow().setStatusBarColor(getResources().getColor(R.color.bistre));
        btnSolicitar = findViewById(R.id.btnSolicitar);
        txtNome = findViewById(R.id.txtNome);
        txtNota = findViewById(R.id.txtNota);
        txtXp = findViewById(R.id.txtXp);
        Intent it = getIntent();
        Fotografo ft = (Fotografo)it.getSerializableExtra("objFot");
        txtNome.setText(ft.getNome());
        txtNota.setText(String.valueOf(ft.getNota()));
        txtXp.setText(String.valueOf(ft.getTempoXp()));
        btnSolicitar.setOnClickListener(v -> {
            Intent itt = new Intent(this, ContFot.class);
            itt.putExtra("ftCpf", ft.getFotografoCpf());
            Log.i("StringTeste", String.valueOf(ft.getFotografoCpf()));
            startActivity(itt);
        });

    }
}