package com.inventory;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory
{
    public static void main(String []args) throws ParserConfigurationException, SAXException, IOException {
       boolean isPermissibleQuantity = false;
        List<String> isPermissibleQuantityList = new ArrayList<>();
        List<String> capacityList = new ArrayList<>();
        boolean capChecked = false;
        String cardNumber = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        System.out.flush();
        String fileName = scan.nextLine();
        File file = new File(fileName);
        String absolute = file.getAbsolutePath();


        FileOperations fileOperations =new CsvFileOperations();
     List<List<String>> records = fileOperations.readFile(file);
       System.out.println("records from input file: " + records);



      for(List<String> list1 : records){
           for(int i=0 ; i< list1.size() ; i++){
               if( i == 2 ){
                    cardNumber = list1.get(i);
               }
           }
       }


        // validate qty stgy pattern
        ValidateQuantity validate = new ValidateQuantity();
        isPermissibleQuantityList = validate.validations(records);  // invokation for strategy pattern
        if(isPermissibleQuantityList.size() > 0){ // quantity check failed
            fileOperations.writeFile("Error.txt",isPermissibleQuantityList);
        } else {
            isPermissibleQuantity = true;
            System.out.println("Permissible Quantity Checked "+isPermissibleQuantity);
        }

        // validate capacity stgy pattern
       ValidateCap validateCap = new ValidateCap();
        capacityList = validateCap.validations(records);
        if(capacityList.size() > 0){ // if cap check failed
            fileOperations.writeFile("output.txt",capacityList);
        } else {
            capChecked = true;
            System.out.println("Cap  Checked "+capChecked);
        }



        //price calculation
        if(isPermissibleQuantity && capChecked){
            System.out.println("Card Number from the input file is: "+ cardNumber);

            //validate card singleton
            SingletonCart.getInstance();
            SingletonCart.validatingCard(cardNumber);

            List<String> total = calculateTotalCost(records);

            fileOperations.writeFile("Output.csv",total);
        }


    }
    public static List<String> calculateTotalCost( List<List<String>> record){
       Cart cart = new CartImpl();
       List<String> priceList = new ArrayList<>();
       float price = 0;
       price = cart.totalCost(record);
        priceList.add("Total Price of your cart is: ");
        priceList.add(String.valueOf(price));
        return priceList;
    }
}
