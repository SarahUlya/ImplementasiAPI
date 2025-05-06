package com.example.implementasiapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("lookup_all_teams.php")
    Call<TeamResponse> getAllTeams(@Query("id") String idLeague);
}
