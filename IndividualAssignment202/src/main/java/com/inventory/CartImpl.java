package com.inventory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartImpl implements Cart{
    @Override
    public float totalCost(List<List<String>> record) {
        float sum = 0;
        InventoryDb catgegoryList = new InventoryDb();
        HashMap<String, Categories> categories = catgegoryList.stockDb();
        for(List<String> rec : record){
            String key = rec.get(0);
            for (Map.Entry entry : categories.entrySet()) {
                if (key.equals(entry.getKey())) {
                    Categories values = (Categories)entry.getValue();


                 float pricePerQty =Float.valueOf(rec.get(1)) * Float.valueOf(values.getPrice()) ;
                  //  System.out.println("pricePerQty" + pricePerQty);
                  sum = sum + Float.valueOf(rec.get(1)) * Float.valueOf(values.getPrice());
                }
            }
        }
       System.out.println("Total price of the cart is: " + sum);
        return sum;
    }
}
