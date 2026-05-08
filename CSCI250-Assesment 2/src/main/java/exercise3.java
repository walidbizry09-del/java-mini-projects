/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walid
 */
import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scan.nextInt();
        while(num>0){
            int digit=num%10;
            for(int i=0;i<digit;i++){
                System.out.print("*");
            }   
            System.out.println();
            num=num/10;
        }
    }
}
