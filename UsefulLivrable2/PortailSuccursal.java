package com.example.novigrad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PortailSuccursal extends AppCompatActivity {

    private Button voirservices, choisirservices,supprimerservices, voirdemandes, definirhoraires;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portail_succursal);

        voirservices = (Button)findViewById(R.id.btnVoirServices);
        choisirservices =(Button)findViewById(R.id.btnChoisirServices);
        supprimerservices = (Button)findViewById(R.id.btnSuprimerServicesSuccursale);
        voirdemandes =(Button)findViewById(R.id.btnVoirDemandes);
        definirhoraires = (Button)findViewById(R.id.btnHoraires);

        voirservices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        choisirservices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        supprimerservices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SupprimerServiceSuccursale.class);
                startActivity(intent);



            }
        });

        voirdemandes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplicationContext(),VoirDemandes.class);
                startActivity(intent);

            }
        });

        definirhoraires.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}