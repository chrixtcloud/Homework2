package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Menu> OrderArray = new ArrayList<Menu>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycle_menu);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        MenuAdapter menuAdapter = new MenuAdapter();
        menuAdapter.setData(MenuDatabase.getAllMenuItems());
        recyclerView.setAdapter(menuAdapter);

        Button myOrder = findViewById(R.id.viewOrder);
        myOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), OrderActivity.class);
                intent2.putExtra("OrderArray", OrderArray);
                startActivity(intent2);
            }
        });

        Intent intent1 = getIntent();
        int fromOrderScreen = intent1.getIntExtra("fromOrderScreen", 0);
        if (fromOrderScreen == 1) {
            OrderArray.clear();
        }
        else if (fromOrderScreen == 2) {
            OrderArray = (ArrayList<Menu>) getIntent().getSerializableExtra("OrderArray");
        }

        int itemID = intent1.getIntExtra("itemID", 0);
        if (itemID != 0) {
            Menu MenuItemObject = new Menu(itemID);
            int Quantity = intent1.getIntExtra("quantity", 0);
            MenuItemObject.setOrderQuantity(Quantity);
            OrderArray.add(MenuItemObject);
        }


    }
}
