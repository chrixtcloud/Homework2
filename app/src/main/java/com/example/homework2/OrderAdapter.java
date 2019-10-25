package com.example.homework2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private ArrayList<Menu> OrderArray;

    public static void setOrderTotal(double orderTotal) {
        OrderAdapter.orderTotal = orderTotal;
    }

    public static double orderTotal = 0;

    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order, parent, false);
        OrderViewHolder orderViewHolder = new OrderViewHolder(view);
        return orderViewHolder;
    }

    public void onBindViewHolder(@NonNull final OrderViewHolder holder, final int position) {
        Menu itemMenuObject = OrderArray.get(position);
        final Context context = holder.itemMenuName3.getContext();


        holder.itemMenuImage3.setImageResource(itemMenuObject.getImage());
        holder.itemMenuName3.setText(itemMenuObject.getName());

    }

    public int getItemCount() {
        return OrderArray.size();
    }

    public void setData(ArrayList<Menu> data) {
        this.OrderArray = data;
    }

    public double getOrderTotal() {

        for (int i = 0; i < OrderArray.size(); i++) {
            Menu itemMenuObject = OrderArray.get(i);
            orderTotal += (itemMenuObject.getOrderQuantity() * itemMenuObject.getPrice());
        }
        return orderTotal;
    }

    public static class OrderViewHolder extends RecyclerView.ViewHolder {

        public View view;
        public ImageView itemMenuImage3;
        public TextView itemMenuName3;

        public OrderViewHolder(View Sview) {

            super(Sview);
            view = Sview;
            itemMenuImage3 = Sview.findViewById(R.id.image3);
            itemMenuName3 = Sview.findViewById(R.id.name3);

        }
    }


}
