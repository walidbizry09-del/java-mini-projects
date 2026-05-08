/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walid
 */
import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int min = 100;
        int max =999;
        int random =(int)(Math.random()* (max - min +1))+min;
        System.out.println(random);
        int ra = random%10;
        random = random/10;
        int rb=random%10;
        random=random/10;
        int rc = random%10;
        
        int guess =9;
        while(guess !=0){
        System.out.println("Enter 3 digits ");
        int sd = scan.nextInt();
        int sc = scan.nextInt();
        int sf = scan.nextInt();
        if (sd == rc && sc==rb && sf==ra){
            System.out.println("Congratulations, You won !!");
            break;
        }else{
            guess --;
            System.out.println("You can try for "+guess);
        }
        }
    }
}
