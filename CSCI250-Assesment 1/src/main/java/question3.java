/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age and required class(1 or 2): ");
        int age = scan.nextInt();
        int clasop = scan.nextInt();
        int basicrate = 500;
        if (clasop != 1 && clasop != 2){
            System.out.println("Inssurance class should be 1 or 2");
            return;
        }
        if (age < 18 && clasop == 1){
            System.out.println("Your Inssurance cost for this year is "+ (basicrate-(basicrate*0.15))+" USD");
        }
        else if(age < 18 && clasop == 2){
            System.out.println("Your Inssurance cost for this year is " + (basicrate-(basicrate*0.20))+" USD");
        }
        else if(age >= 18 && age <=35 && clasop ==2){
            System.out.println("Your Inssurance cost for this year is " + basicrate +" USD");
        }
        else if(age >= 18 && age <= 35 && clasop ==1){
            System.out.println("Your Inssurance cost of this year is "+ (basicrate+(basicrate*0.05))+" USD");
        }
        else if(age >= 36 && age <= 64 && clasop ==1){
            System.out.println("Your Inssurance cost for this year is "+ (basicrate+(basicrate*0.6))+" USD");
        }
        else if (age >= 36 && age <= 64 &&clasop ==2){
            System.out.println("Your Inssurance cost for this year is "+  (basicrate+(basicrate*0.5))+" USD");
        }
        else if (age>64 && clasop ==2){
            System.out.println("Your Innsurance cost for this year is "+ (basicrate+(basicrate*1))+" USD");
        }
        else if (age>64 && clasop ==1){
            System.out.println("Your Inssurance cost for this year is "+ (basicrate+(basicrate*1.1))+" USD");
        }
        }
}
