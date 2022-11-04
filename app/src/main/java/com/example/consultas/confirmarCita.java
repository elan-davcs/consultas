package com.example.consultas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class confirmarCita extends AppCompatActivity implements View.OnClickListener {

    Button btningresar;
    Intent intent;
    ImageView imgcita;
    String noticita_url = "https://api.sonnymijael.com/v1/kusnt/resources/noticita.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_cita);

        // Set header color
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.actionbar));

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#557C83"));
        actionBar.setBackgroundDrawable(colorDrawable);

        imgcita = findViewById(R.id.imgcita);
        Picasso.get().load(noticita_url).into(imgcita);

        btningresar=(Button) findViewById(R.id.ingresar);
        btningresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ingresar:
                intent.setClass(this, cancelCita.class);
                startActivity(intent);
                break;

        }
    }
}