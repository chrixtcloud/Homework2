package com.example.homework2;

import java.io.Serializable;

public class Menu implements Serializable {

    private String name;
    private double price;
    private String description;
    private int itemID;
    private int image;
    private int OrderQuantity;

    public Menu(int itemID) {

        this.itemID = MenuDatabase.getItemByID(itemID).getItemID();
        this.name = MenuDatabase.getItemByID(itemID).getName();
        this.price = MenuDatabase.getItemByID(itemID).getPrice();
        this.description = MenuDatabase.getItemByID(itemID).getDescription();
        this.OrderQuantity = MenuDatabase.getItemByID(itemID).getOrderQuantity();
        this.image = MenuDatabase.getItemByID(itemID).getImage();

    }

    public Menu(int itemID, String name, double price, String description, int OrderQuantity, int image) {

        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.OrderQuantity = OrderQuantity;
        this.image = image;

    }

    public int getItemID() {
        return itemID;
    }


    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


    public String getDescription() {
        return description;
    }


    public int getOrderQuantity() {
        return OrderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        OrderQuantity = orderQuantity;
    }



}
