package com.example.recyclesnames;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NamesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName;

    public NamesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.name);
    }

    public void bind(String name) {
        tvName.setText(name);
    }
}
