import java.util.Scanner;

public class Login {

    Scanner sc = new Scanner(System.in);

    public int login() {

        System.out.println("\n===== LOGIN =====");

        System.out.println("1. Admin");

        System.out.println("2. Student");

        System.out.print("Choose Login : ");

        int choice = sc.nextInt();

        sc.nextLine();

        System.out.print("Username : ");

        String username = sc.nextLine();

        System.out.print("Password : ");

        String password = sc.nextLine();

        if(choice==1){

            if(username.equals("admin") && password.equals("admin123")){

                return 1;

            }

        }

        else{

            if(username.equals("student") && password.equals("student123")){

                return 2;

            }

        }

        return 0;

    }

}
