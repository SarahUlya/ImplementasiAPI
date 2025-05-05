package com.example.new_api;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    Context context;
    List<Team> teams;

    public TeamAdapter(Context context, List<Team> teams){
        this.context = context;
        this.teams = teams;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        Team team = teams.get(position);
        holder.txtName.setText(team.getStrTeam());
        Glide.with(context).load(team.getStrBadge()).into(holder.imgLogo);
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }

    static class TeamViewHolder extends RecyclerView.ViewHolder{
        ImageView imgLogo;
        TextView txtName;

        public TeamViewHolder(View itemView){
            super(itemView);
            imgLogo = itemView.findViewById(R.id.imgLogo);
            txtName = itemView.findViewById(R.id.txtName);

        }
    }
}
