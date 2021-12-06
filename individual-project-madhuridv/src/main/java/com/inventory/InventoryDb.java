package com.inventory;


import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class InventoryDb{

    public HashMap<String,Categories> stockDb(){
        HashMap<String,Categories> Items = new HashMap<>();
        Items.put("Milk",new Categories("Essential","6","4.72"));
        Items.put("Bread",new Categories("Essential","8","2.98"));
        Items.put("Oil",new Categories("Essential","2","8.5"));
        Items.put("Cotton",new Categories("Essential","4","11.2"));
        Items.put("Apples",new Categories("Essential","8","1"));
        Items.put("Chocolates",new Categories("Luxury","12","3"));
        Items.put("Honey",new Categories("Luxury","4","4.2"));
        Items.put("Cereal",new Categories("Luxury","6","6.34"));
        Items.put("Soap",new Categories("Luxury","5","5"));
        Items.put("Detergent",new Categories("Luxury","8","3"));
        Items.put("Paint",new Categories("Luxury","5","7"));
        Items.put("Pillow",new Categories("Misc","10","6.76"));
        Items.put("Sheets",new Categories("Misc","13","11.43"));
        Items.put("Blanket",new Categories("Misc","12","45.5"));
        Items.put("Television",new Categories("Misc","5","1100.54"));
        Items.put("Map",new Categories("Misc","2","2.92"));
        return  Items;
    }

}
