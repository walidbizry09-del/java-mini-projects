/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walid
 */
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age and your brother age: ");
        int a =scan.nextInt();
        int b = scan.nextInt();
        if (a>b){
            int c = a-b;
            System.out.println("You are "+c+" years older than your brother");
        }else if (b>a){
            int c = b-a;
            System.out.println("Your brother is "+c+" older than you");
        }else if (a==b){
            System.out.println("You are twins");
        }
        System.out.println("Created by WalidBizry on 14 april 2026");
    }
}
