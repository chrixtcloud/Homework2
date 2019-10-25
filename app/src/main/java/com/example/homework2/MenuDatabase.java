package com.example.homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuDatabase {

    public static Menu getItemByID(int itemID) {return MenuItems.get(itemID);
    }

    public static ArrayList<Menu> getAllMenuItems() {
        return new ArrayList<Menu>((List) Arrays.asList(MenuItems.values().toArray()));
    }

    private static final HashMap<Integer, Menu> MenuItems = new HashMap<>();

    static {

        MenuItems.put(1, new Menu(
                1,
                "Pancakes",
                15.00,
                "Maple Syrup soaked pancakes with a dash of lemon zest.",
                0,
                R.drawable.pancakes
        ));

        MenuItems.put(2, new Menu(
                2,
                "Cookies",
                15.00,
                "Freshly baked cookies infused with truffle oil",
                0,
                R.drawable.cookies
        ));

        MenuItems.put(3, new Menu(
                3,
                "Creme Tart",
                15.00,
                "Free range egg based creme tart",
                0,
                R.drawable.creme
        ));


        MenuItems.put(4, new Menu(
                4,
                "Raspberry Tart",
                15.00,
                "Minimum wage picked raspberry tart",
                0,
                R.drawable.tart
        ));

        MenuItems.put(5, new Menu(
                5,
                "Chocolate Horn",
                15.00,
                "Warm gooey chocolated filled rhino horn crossiant",
                0,
                R.drawable.horn
        ));

        MenuItems.put(6, new Menu(
                6,
                "Boba",
                15.00,
                "Not your average Chatime or Gongcha Boba",
                0,
                R.drawable.boba
        ));

        MenuItems.put(7, new Menu(
                7,
                "Chocolate Bar",
                15.00,
                "Better than Cadbury I assure you",
                0,
                R.drawable.chocolate
        ));

        MenuItems.put(8, new Menu(
                8,
                "Vanilla Roll",
                15.00,
                "Straight from the asian bakery store",
                0,
                R.drawable.vanilla
        ));

        MenuItems.put(9, new Menu(
                9,
                "Strawberry Roll",
                15.00,
                "Straight from the asian bakery store ",
                0,
                R.drawable.strawberry
        ));

        MenuItems.put(10, new Menu(
                10,
                "Cake",
                15.00,
                "350g rump steak cooked to your liking",
                0,
                R.drawable.cake
        ));

        MenuItems.put(11, new Menu(
                11,
                "Sweet Box",
                15.00,
                "Assortment of yours truly",
                0,
                R.drawable.box
        ));


        MenuItems.put(12, new Menu(
                12,
                "Breakfast Bundle",
                15.00,
                "Honestly its a midnight snack",
                0,
                R.drawable.milkpng
        ));

        MenuItems.put(13, new Menu(
                13,
                "Milkshake",
                15.00,
                "The milkshake bring bring all the boys to the yard tbh ",
                0,
                R.drawable.milkshake
        ));

        MenuItems.put(14, new Menu(
                14,
                "Egg Pudding",
                15.00,
                "More free range egg based pudding",
                0,
                R.drawable.pudding
        ));

        MenuItems.put(15, new Menu(
                15,
                "Valentines Treat",
                15.00,
                "If you had a girlfriend",
                0,
                R.drawable.valentines
        ));
    }
    }
