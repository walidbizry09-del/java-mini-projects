/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walid
 */
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the celestial body:");
        String name = scan.next();
        System.out.println("Enter the mass and the radius of the celestial body:");
        double mass = scan.nextDouble();
        double radius = scan.nextDouble();
        double velocity = Math.sqrt((13.347 * Math.pow(10, 13)*mass)/radius);
        long integerPart = (long)velocity;
        long decimalPart =(long) (velocity*1000)%1000;
        System.out.println("The escaped velocity of "+name+" is "+integerPart +"."+decimalPart);
        System.out.println("Created by Walid bizry on 14 april 2026");
    }
}
