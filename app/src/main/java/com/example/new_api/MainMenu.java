package com.example.new_api;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {
    Button btnPremier, btnSpanish;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnPremier = findViewById(R.id.btnPremier);
        btnSpanish = findViewById(R.id.btnSpanish);

        btnPremier.setOnClickListener(v ->openMainActivity("4328"));
        btnSpanish.setOnClickListener(v ->openMainActivity("4335"));
    }

    private void openMainActivity(String leagueName) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("LEAGUE_ID", "Spanish La Liga");
        startActivity(intent);
    }


}
