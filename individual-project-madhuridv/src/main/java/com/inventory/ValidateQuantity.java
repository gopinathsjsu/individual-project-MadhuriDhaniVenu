package com.inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 public class ValidateQuantity implements ValidatorInterface {
     @Override
     public  List<String> validations(List<List<String>> records) {
         String categoryItem = null;
         String quantity = null;
         List<String> itemList = new ArrayList<>();

         boolean isPermissible = false;
        // HashMap<String,List<String>> isPermissible = new HashMap<>();
         for (List<String> list1 : records) {

             for (int i = 0; i < list1.size(); i++) {
                 if (i == 0) {
                     categoryItem = list1.get(i);
                 }
                 if (i == 1) {
                     quantity = list1.get(i);
                 }
             }
             isPermissible = validateQty(categoryItem,quantity);
            // isPermissible = validateQty(categoryItem,quantity);
            if(!isPermissible){
                itemList.add("Please Correct quantities for the input: ");
                itemList.add(categoryItem);
                itemList.add(quantity);
            }

         }
        // System.out.println("isPermissible in validate qty"+isPermissible);

         return itemList;
        //return isPermissible;
     }

     public static boolean validateQty(String categoryItem,String quantity){
         //  System.out.println("categoryItem " + " " + categoryItem);
         HashMap<String,List<String>> Item = new HashMap<>();
         List<String> itemList = new ArrayList<>();
         InventoryDb catgegoryList = new InventoryDb();
         HashMap<String, Categories> categories = catgegoryList.stockDb();
         for(Map.Entry entry : categories.entrySet()){
             String Key = (String) entry.getKey();

             if(Key.equals(categoryItem)){
                 Categories value = (Categories) entry.getValue();
                 String qty = value.getQuantity();
                 //System.out.println("qty" + " " + qty);
                 if(Integer.parseInt(quantity)<=Integer.parseInt(qty)){
                     return true;
                 }
             }

         }
         return false;
     }
 }



