package com.example.new_api;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SpanishMenu extends AppCompatActivity {
    RecyclerView recyclerView;
    TeamAdapter adapter;
    List<Team> teamList = new ArrayList<>();
    String leagueName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        leagueName = getIntent().getStringExtra("LEAGUE_NAME");
        recyclerView = findViewById(R.id.rvTeam);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadTeams(leagueName);

    }

    private void loadTeams(String leagueId) {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        apiService.getTeamsBySportAndCountry(leagueId).enqueue(new Callback<TeamResponse>() {
            @Override
            public void onResponse(Call<TeamResponse> call, Response<TeamResponse> response) {
                if(response.isSuccessful() && response.body() !=null ){
                    List<Team> teams = response.body().getTeams();
                    adapter = new TeamAdapter(SpanishMenu.this, teams);
                    recyclerView.setAdapter(adapter);
                } else{
                    Toast.makeText(SpanishMenu.this, "Failed to get data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<TeamResponse> call, Throwable t) {
                Toast.makeText(SpanishMenu.this, "Network error", Toast.LENGTH_SHORT).show();
                Log.e("RETROFIT_EROR", "On_Failure : ", t);
            }
        });
    }
}
