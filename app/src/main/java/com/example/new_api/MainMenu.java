package com.example.new_api;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainMenu extends AppCompatActivity {

    Button btnPremiere;
    Button btnSpain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        btnPremiere = (Button) findViewById(R.id.btnPremier);
        btnSpain = (Button) findViewById(R.id.btnSpanish);

        btnPremiere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent premiereIntent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(premiereIntent);
            }
        });

        btnSpain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spainIntent = new Intent(MainMenu.this, SpanishActivity.class);
                startActivity(spainIntent);
            }
        });

    }
}