package com.inventory;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 public class ValidateCap implements ValidatorInterface {
     @Override
     public List<String> validations(List<List<String>> records) {
         List<String> capCount = new ArrayList<>();
         HashMap<String,Integer> map = new HashMap<>();
         int essentialCount = 0;
         int luxuryCount = 0;
         int miscCount = 0;

         InventoryDb categoryList = new InventoryDb();
         HashMap<String, Categories> categories = categoryList.stockDb();

         for(List<String> rec : records) {
             {
                 String Key = rec.get(0);

                 for (Map.Entry entry : categories.entrySet()) {
                     if (Key.equals(entry.getKey())) {


                         Categories values = (Categories) entry.getValue();
                         if(values.getCategoryType().equals("Essential")){
                             essentialCount = essentialCount + Integer.parseInt(rec.get(1));
                         } else if(values.getCategoryType().equals("Luxury")){
                             luxuryCount = luxuryCount + Integer.parseInt(rec.get(1));
                         } else if(values.getCategoryType().equals("Misc")){
                             miscCount = miscCount + Integer.parseInt(rec.get(1));
                         }
                     }
                 }
             }
         }

         System.out.println("essentialCount: " + essentialCount + " " + "luxuryCount: " +luxuryCount + " " +"miscCount: " + miscCount);
//         if(essentialCount <=5 && luxuryCount <= 3 && miscCount <= 6){
//             return capCount;
//         }
         if(essentialCount >= 6 ){
             capCount.add("Cap on Essential is");
             capCount.add(" " + String.valueOf(essentialCount));
             capCount.add(". Please check the capacity");
         }

         if(luxuryCount >= 4){
             capCount.add("Cap on Luxury is");
             capCount.add(" "+String.valueOf(luxuryCount));
             capCount.add(". Please check the capacity");
         }
         if(miscCount >= 7){
             capCount.add("Cap on Misc is");
             capCount.add(" "+ String.valueOf(miscCount));
             capCount.add(". Please check the capacity");
         }
         return capCount;
     }
     }



