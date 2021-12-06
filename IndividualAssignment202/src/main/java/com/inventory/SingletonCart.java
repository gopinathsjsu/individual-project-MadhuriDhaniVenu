package com.inventory;

import java.util.ArrayList;

public class SingletonCart {
    private static ArrayList<String> cardList = new ArrayList<>();
    private static SingletonCart instance = null;
    private SingletonCart () {
        cardList = cardsDb();
    }
    public static SingletonCart  getInstance() {
        if(instance == null) {
        instance = new SingletonCart();
        }
    return  instance;
    }

    private ArrayList<String> cardsDb(){
        cardList.add("5023 4512 7612 9087");
        cardList.add("1234 5678 9101 4519");
//        cardList.add("0987 6543 2109 8765");
//        cardList.add("5643 0981 3729 1463");
        return cardList;
    }

    public static String  validatingCard(String cardNumber) {

        if (cardList.contains(cardNumber)) {

            for(String card: cardList){
                System.out.println("Cards in the database " + card);
            }

            return "Card Exists";
        }
        else {
            cardList.add(cardNumber);
            for(String card: cardList){
                System.out.println("Cards in the database " + card);
            }
           return "Card added";
        }
    }
}
