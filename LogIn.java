import java.util.Scanner;
class LogIn{
    private String gmail;
    private String password;
    public LogIn(String gmail, String password){
        this.gmail=gmail;
        this.password=password;
    }

    boolean LogInCheckgmail(String gmail, String password){
       return this.gmail.equals(gmail) && this.password.equals(password);
    }

    public class LOGIN{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            while (true){
            System.out.println("Enter a new gmail: ");
            String newgmail = scan.nextLine();
            if(newgmail.isBlank()){
                System.out.println("Enter a valid gmail.");
                continue;
            }
            System.out.println("Enter a new password: ");
            String newpassword = scan.nextLine();
            if(newpassword.isBlank()){
                System.out.println("Enter a valid password.");
                continue;
            }
            LogIn user = new LogIn(newgmail, newpassword);
            System.out.println("Account created successfully ");
            System.out.println("Enter your gmail:");
            String gmail = scan.nextLine();
            if(gmail.isBlank()){
                System.out.println("Enter a valid gmail");
                continue;
            }
            System.out.println("Enter your password:");
            String password = scan.nextLine();
            if(password.isBlank()){
                System.out.println("Enter a valid passowrd");
                continue;
            }
                
                if(user.LogInCheckgmail(gmail, password)){
              System.out.println("LoggedIn succesfully");
              break;
            }else{
                System.out.println("invailed gmail or password");
                System.out.println("Enter a valid gmail and password.");
                continue;
            }
        }
        }
    }
}
