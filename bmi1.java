import java.util.Scanner;
public class bmi1{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("This program is made to calculate your Bmi");
        System.out.println("Enter your weight in kg:");
        double height = 0;
        double weight = 0;
        double bmi = 0;
        while (true){
            if (!scan.hasNextDouble() ){
                System.out.println("Enter a valid weight in kg:");
                scan.next();
                continue;
            }
     weight = scan.nextDouble();
    if (weight <= 0 || weight >500){
        System.out.println("Enter a valid weight in kg");
        continue;
    }
        break;        
        }
        System.out.println("Enter your height in meters:");
        while (true){
            if (!scan.hasNextDouble()){
                System.out.println("Enter a valid height in meters:");
                scan.next();
                continue;
            }
             height = scan.nextDouble();
            if (height <=0 || height > 3){
                System.out.println("Enter a valid height in meters:");
                continue;
            }
            break;
        }
         bmi = weight / (height * height);
        System.out.println("Your bmi is:" + bmi);
        if (bmi>=30){
            System.out.println("You are obese");
        
        }
    else if (bmi>=25){
        System.out.println("You are overweight");
    }
    else if (bmi>=18.5){
        System.out.println("You have a normal weight");
    }
    else {
        System.out.println("You are underweight");
    }
        

    }
}
