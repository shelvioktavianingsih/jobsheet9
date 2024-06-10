package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnProfil, btnProfilstmik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnProfil = (Button) findViewById(R.id.btnProfil);
        btnProfilstmik = (Button) findViewById(R.id.btnProfilstmik);

        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaActivityDua = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(BukaActivityDua);
            }
        });

        btnProfilstmik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BukaTiga();
            }
        });
    }

    public void BukaTiga(){
        Intent BukaActivityTiga = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(BukaActivityTiga);
    }
}