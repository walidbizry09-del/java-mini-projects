import java.util.ArrayList;
import java.util.Scanner;
 class Book{
     String name;
    boolean available;
    String classification;
    public Book(String name, String classification){
        this.name = name;
        this.available = true;
        this.classification = classification;
    
    }

}
    
     class Library{
     ArrayList<Book> books = new ArrayList<>();

    public void addBooks(String name, String classification){
        Book b = new Book(name, classification);
        books.add(b);
    }

    public boolean borrowBook(String name){
        for (Book b : books){
        if(b.name.equalsIgnoreCase(name)){
            if(b.available){
                b.available = false;
                return true;
            }
                return false;
            
        } 
        } return false;
}
public boolean isBookExist(String name){
      for(Book b : books){
        if(b.name.equalsIgnoreCase(name)){
            return true;
        }
      }
      return false;
    }
    public void showAvailableBook(){
        boolean found = false;
        for (Book b : books){
        if(b.available){
            System.out.println("The books that are available are: Name: "+b.name +"  Classification: "+ b.classification);
            found = true;
        }
    } if(!found){
        System.out.println("No available books at the moment.");
    }
}

}
public class BOOK1{
    public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    Library library = new Library();
 while(true){
    System.out.println("This program is a Library of Books where you can insert your book or borrow a book.");
    System.out.println("Choose an operation");
    System.out.println("1- Add book;");
    System.out.println("2- Borrow book");
    System.out.println("3- Show available Books");
    System.out.println("4- Exit");
    int choice;
    if(!scan.hasNextInt()){
        System.out.println("Enter a valid choice from 1 to 3");
        scan.nextLine();
        continue;
    }else {
        choice = scan.nextInt();
    }
    scan.nextLine();
    if (choice ==1){
        System.out.println("Enter the name of Book you want to add:");
        String name = scan.nextLine();
        System.out.println("Classify this book in some words");
        String classification = scan.nextLine();
        library.addBooks(name, classification);
       System.out.println("Book has been added succesfully");
    }
    else if (choice ==2){
        System.out.println("Enter the name of book you want to borrow");
        String name = scan.nextLine();
        if(!library.isBookExist(name)){
          System.out.println(("Book has not been found"));
        }
        else if(library.borrowBook(name)){
            System.out.println("Book  been borrowed successfully");
        }
        else{
            System.out.println("Book is already borrowed");
        }
    }
    else if(choice == 3){
        library.showAvailableBook();
    }
    else if(choice == 4){
        System.out.println("Goodbye");
        break;
    }
    else {
        System.out.println("Invailed choice");
    }
 }
}

}


    



