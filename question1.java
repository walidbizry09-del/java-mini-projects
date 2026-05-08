/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter type of item bought and the quantity :");
        String type = scan.next();
        if(!type.equalsIgnoreCase("A") && !type.equalsIgnoreCase("B") && !type.equalsIgnoreCase("C")){
            System.out.println("Invalid Input");
            return;
        }
        int quantity = scan.nextInt();
        int price = 0;
        if (type.equalsIgnoreCase("A")) 
            price = 3000;
        else if (type.equalsIgnoreCase("B"))
            price = 4000;
        else if (type.equalsIgnoreCase("C"))
            price = 5000;
        if (quantity > 5){
                System.out.println("You exceeded the limit.You will be charged double the price. \n Enter y to accept and continue or n to reduce the quantity to 5.");
        String choice = scan.next();
     
        if (choice.equalsIgnoreCase("Y"))
            price = price * 2;
        else if(choice.equalsIgnoreCase("n"))
            quantity = 5;
        }
        
        double totalammount = quantity * price;
        System.out.println("Yout total is "+ totalammount+"LL.");
    }
    
}
