/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walid
 */
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nv=0;  //number of input times
        double sum =0; // sum of input numbers
        int value =0;  //inputed value
        double max=0; //highest number
        double average =0;
        while(value!=-1){
             System.out.println("Enter a value (-1 to end the program): ");
            value = scan.nextInt();
            if(value ==-1){
              break;
            }
            if(value>max){
                max = value;
            }
            sum = sum+value;
            nv++;
            average = sum/nv;
            
        }
        System.out.println("You entered "+nv+"\nTheir sum is "+sum+"\nTheir average is "+average+"\nThe highest number is "+max);
    }
}
