public class Main {

    public static void main(String[] args) {

        Login login = new Login();
        Menu menu = new Menu();

        while (true) {

            int role = login.login();

            if (role == 1) {
                System.out.println("\nAdmin Login Successful");
                menu.adminMenu();
            }

            else if (role == 2) {
                System.out.println("\nStudent Login Successful");
                menu.studentMenu();
            }

            else {
                System.out.println("\nInvalid Credentials");
            }
        }
    }
}
