package com.example.listrecycleview;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRecycleView extends RecyclerView.Adapter<AdapterRecycleView.ViewHolder>{

    private String[] SubjectValues;
    private Context context;

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        ViewHolder(View v) {
            super(v);

            textView = v.findViewById(R.id.textItem);
        }

    }

    @NonNull
    @Override
    public AdapterRecycleView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecycleView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
