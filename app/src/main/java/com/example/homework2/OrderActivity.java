package com.example.homework2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    private ArrayList<Menu> OrderArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        RecyclerView recyclerView = findViewById(R.id.recycle_order);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        OrderAdapter orderAdapter = new OrderAdapter();

        OrderArray = (ArrayList<Menu>) getIntent().getSerializableExtra("OrderArray");

        orderAdapter.setData(OrderArray);

        recyclerView.setAdapter(orderAdapter);

        ConstraintLayout activity_order_footer = findViewById(R.id.orderValue);

        TextView totalText = activity_order_footer.findViewById(R.id.total);
        String totalCost = "Total: $" + Double.toString(orderAdapter.getOrderTotal()) + "0";
        totalText.setText(totalCost);

        ConstraintLayout activity_order_header = findViewById(R.id.orderHeader);

        ImageView returnToMenuButton = activity_order_header.findViewById(R.id.returnToMenuButton);


        returnToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);

                intent1.putExtra("returnFromOrders", 2);
                intent1.putExtra("OrderArray", OrderArray);

                OrderAdapter.setOrderTotal(0);
                startActivity(intent1);
            }
        });

    }

}
