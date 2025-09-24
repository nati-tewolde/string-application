package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "apples";
        double itemPrice = 7.10;
        int quantity = 3;
        double totalPrice = itemPrice * quantity; //Instructions implied incorporating total cost/price

        System.out.println("You bought " + quantity + " " + itemName + " for $" + totalPrice);


    }
}
