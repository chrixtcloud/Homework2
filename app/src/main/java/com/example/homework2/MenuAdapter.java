package com.example.homework2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{

    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu, parent, false);
        MenuViewHolder menuViewHolder = new MenuViewHolder(view);

        return menuViewHolder;
    }

    private ArrayList<Menu> MenuItemArray;

    public void onBindViewHolder(@NonNull final MenuViewHolder holder, final int position) {

        final Context context = holder.name.getContext();
        Menu itemMenuObject = MenuItemArray.get(position);



        holder.image.setImageResource(itemMenuObject.getImage());
        holder.name.setText(itemMenuObject.getName());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(context, MenuDetailed.class);

                intent1.putExtra("itemID", position + 1);
                context.startActivity(intent1);


            }
        });
    }

    public int getItemCount()
    {
        return MenuItemArray.size();
    }

    public void setData(ArrayList<Menu> data) {
        this.MenuItemArray = data;
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public ImageView image;
        public TextView name;

        public MenuViewHolder(View Sview) {
            super(Sview);
            view = Sview;
            image = Sview.findViewById(R.id.image);
            name = Sview.findViewById(R.id.name);
        }
    }
}
