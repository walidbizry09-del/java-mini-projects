import java.util.ArrayList;
import java.util.Scanner;
 class Car{
    String carname;
    boolean available;
    public Car(String name){
this.carname = name;
this.available = true;
    }
}

class carRental{
    ArrayList<Car> cars = new ArrayList<>();
    void addCar(Car car){
        cars.add(car);
    }
    void carRent(Car car){
        if (car.available){
           car.available = false;
           System.out.println("Car has been rented successfully");
        } else{
            System.out.println("Car has not been found");
        }
    }
    boolean isCarAvailable(Car car){
        for (Car c : cars){
            if(c == car){
                if(c.available){
                    return true;
                }else{
                    System.out.println("Car is not available");
                    return false;
                }
            }
        }
        System.out.println("Car is not found");
        return false;
    }
}
public class CarApp{
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    carRental rental = new carRental();
    Car car1 = new Car("BMW");
    Car car2 = new Car ("Mercedes");
    Car car3 = new Car("Honda");
    rental.addCar(car1);
    rental.addCar(car2);
    rental.addCar(car3);
    System.out.println("Welcome to Rental Car");
    System.out.println("1- BMW");
    System.out.println("2-Mercedes");
    System.out.println("3- Honda");
    int option;
    while (true){
        System.out.println("Enter an option: ");
    if (scan.hasNextInt()){
        option = scan.nextInt();
        
    }else {
        System.out.println("Enter a valid option");
          scan.nextLine();
          continue;
    }

        if(option == 1){
        if(rental.isCarAvailable(car1)){
            rental.carRent(car1);
            break;
        }
    } else if (option == 2){
        if(rental.isCarAvailable(car2)){
            rental.carRent(car2);
            break;
        }
    }else if (option == 3){
        if(rental.isCarAvailable(car3)){
            rental.carRent(car3);
            break;
        }
    }else {
        System.out.println("invailed option, enter an option from 1 to 3");
        scan.nextLine();
        continue;
    }

}
}
}

