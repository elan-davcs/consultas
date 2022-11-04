package com.example.consultas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class cancelCita extends AppCompatActivity {

    ImageView imgcitacancel;
    String citacancel_url = "https://api.sonnymijael.com/v1/kusnt/resources/noticitacancel.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel_cita);

        // Set header color
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.actionbar));

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#557C83"));
        actionBar.setBackgroundDrawable(colorDrawable);

        imgcitacancel = findViewById(R.id.imgcitacancel);
        Picasso.get().load(citacancel_url).into(imgcitacancel);
    }
}