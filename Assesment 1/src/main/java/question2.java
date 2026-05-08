/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 System.out.print("Enter the type of glasses you like to buy: ");
 String type = scan.next();
 if(!type.equalsIgnoreCase("p") && !type.equalsIgnoreCase("n")){
     System.out.println("Invalid Type of glass");
     return;
 }
        System.out.println("Enter the coating code:");
        int code = scan.nextInt();
        if (code != 1 && code !=0){
            System.out.println("Invalid coating type code");
            return;
        }
 if (type.equalsIgnoreCase("p") && code == 0){
     System.out.print("The total cost is $"+(40+12.5));
 }else if(type.equalsIgnoreCase("p") && code ==1){
     System.out.print("The total cost is $"+(40+9.99));
 }else if (type.equalsIgnoreCase("n") && code ==0 || code ==1){
     System.out.print("The total cost is $"+25.0);
 }
     }
}
