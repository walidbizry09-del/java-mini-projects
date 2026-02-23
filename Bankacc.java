import java.util.Scanner;
class Bankacc{
    private int accountNo;
    private String name;
    private float ammount;
    public Bankacc(int accountNo, String name, float amount){
        this.accountNo = accountNo;
        this.name = name;
        this.ammount = amount;
    }
    public void deposit(float amount){
        this.ammount = this.ammount + amount;
        System.out.println(amount + " Deposited");
    }
    public void withdraw(float amount){
        if(ammount < amount){
            System.out.println("Insufficient Balance");
        } else {
            this.ammount = this.ammount - amount;
            System.out.println(amount + " Withdrawn");
        }
        }
        public void checkBalance(){
            System.out.println("Balance is:"+ this.ammount);
        }
        boolean checkLogIn(String name, int password){
            
            if (this.name.equals(name) && this.accountNo == password){
            System.out.println("LoggedIn successfully.");
            return true;
            
            }else{
            System.out.println("Incorrect gmail or password.");
              return false;
            }
                
        }
            public static void main(String[]args){
                Scanner scan = new Scanner(System.in);
                while(true){
                System.out.println("Enter your name:");
                String name = scan.next();
                if (!name.matches("[a-zA-Z]+")){
                    System.out.println("Your name must contain letters only.");
                    continue;
                }
            
                
            
            
                 
                System.out.println("Enter a password for your account.");
                int password;
                while(true){
                if(!scan.hasNextInt()){
                   System.out.println("Your password should be only numbers.");
                   System.out.println("Enter a password containing only numbers.");
                    scan.next();
                    continue;
                     } password = scan.nextInt();
                     break;

                    }
                
                System.out.println("Enter the first ammount you want to deposit on your account.");
                float amount;
                while(true){
                    if(!scan.hasNextDouble()){
                        System.out.println("Enter a valid amount:");
                        scan.next();
                        continue;
                    }amount = scan.nextFloat();
                    break;
                }
            
                
                Bankacc bank = new Bankacc(password,name,amount);
                System.out.println("Now you have to log in to your account.");
            
                while(true){
                boolean loggedin = false;
                    
                
                while(!loggedin){
                System.out.println("enter your name: ");
                String name1 = scan.next();
                if (!name1.matches("[a-zA-Z]+")){
                    System.out.println("Your name must contain letters only.");
                    continue;
                }System.out.println("Enter your password.");
                if (!scan.hasNextInt()){
                      System.out.println("Enter a valid password.");
                      scan.next();
                      continue;
                }int password1 =scan.nextInt();
                loggedin = bank.checkLogIn(name1, password1);
                break;
                }
            
            
            if(loggedin){
            while(true){
              while(true){
                System.out.println("Choose an operation.");
                System.out.println("1- Deposit money");
                System.out.println("2- Withdraw money");
                System.out.println("3- Check balance");
                int choice = 0;
                
                    
                try{
                 choice = scan.nextInt();
                } catch (Exception e){
                    System.out.println("Please enter a valid option.");
                    scan.nextLine();
                    continue;
                }
                if (choice==1){
                    System.out.println("Enter the ammount of money you want to add:");
                    float depamm = scan.nextFloat();
                    bank.deposit(depamm);
                    break;
                }else if (choice == 2){
                    System.out.println("Enter the ammount of money you want to withdraw.");
                    float withdamm= scan.nextFloat();
                    bank.withdraw(withdamm);
                    break;
                }else if( choice ==3){
                    bank.checkBalance();
                    break;
                }
            }
        
                    
                
                    System.out.println("Do you want to make another operation or exit atm.");
                    System.out.println("1- another operation");
                    System.out.println("2- Exit");
                    int choice1;
                        if (!scan.hasNextInt()){
                           System.out.println("Enter a valid operation");
                           scan.next();
                        }choice1 = scan.nextInt();
                        if(choice1 ==1){
                            continue;
                        }
                        else if(choice1 ==2){
                            System.out.println("GoodBye");
                            break;
                        }else {
                            System.out.println("Enter a valid operation.");
                        }
                    
                    }break;
            }
                    
                }break;
            }
        }
    }
    

                
            
        
            
                
            
        
                        
                    
                    

            
        
        
    