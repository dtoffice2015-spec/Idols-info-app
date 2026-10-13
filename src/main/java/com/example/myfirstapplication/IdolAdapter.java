package com.example.myfirstapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class IdolAdapter extends RecyclerView.Adapter<IdolAdapter.ViewHolder> {

    private Context context;
    private List<IdolModel> idolList;

    public IdolAdapter(Context context, List<IdolModel> idolList) {
        this.context = context;
        this.idolList = idolList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_idol_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        IdolModel idol = idolList.get(position);
        holder.tvName.setText(idol.getName());
        holder.tvRole.setText(idol.getShortRole());
        holder.imgIcon.setImageResource(idol.getImageResId());

        // Card Click Listener -> Detail Screen
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name", idol.getName());
                intent.putExtra("info", idol.getFullInfo());
                intent.putExtra("imageRes", idol.getImageResId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return idolList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView tvName, tvRole;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            tvName = itemView.findViewById(R.id.tvName);
            tvRole = itemView.findViewById(R.id.tvRole);
        }
    }
}
