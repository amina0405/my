package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemBinding;

import java.util.ArrayList;

public class MainLandAdapter extends RecyclerView.Adapter<MainLandAdapter.MainlandHolder> {
    private ArrayList<Mainlands> mainlands = new ArrayList<>();
    private Context context;
    private OnltemClick itemClick;
    private ArrayList<Mainlands> countries;

    public MainLandAdapter(Context context) {
        this.context = context;
    }

    public void setMainlands(ArrayList<Mainlands> mainlands) {
        this.mainlands = mainlands;
        notifyDataSetChanged();
    }

    public void setItemClick(OnltemClick itemClick) {
        this.itemClick = itemClick;
    }

    public void setCountries(ArrayList<Mainlands> countries) {
        this.countries = countries;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MainlandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainlandHolder(ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainlandHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(mainlands.get(position), context);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemClick.onItemClick(mainlands.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mainlands.size();
    }

    class MainlandHolder extends RecyclerView.ViewHolder {
        private final ItemBinding binding;

        public MainlandHolder(ItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Mainlands mainlands, Context context) {
            binding.tetxview.setText(mainlands.getName());
            binding.textView.setText(mainlands.getCapital());
            binding.imageView.setImageResource(mainlands.getImage());
        }
    }
}