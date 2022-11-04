package com.example.consultas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class agendarCita extends AppCompatActivity implements View.OnClickListener {

    Button btnConfirmar;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar_cita);

        btnConfirmar= findViewById(R.id.btnConfirmar);
        btnConfirmar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnConfirmar:
                intent.setClass(agendarCita.this, confirmarCita.class);//error pendiente
                startActivity(intent);
                break;
        }
    }
}