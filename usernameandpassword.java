import java.util.Scanner;

public class usernameandpassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String correctUsername = "user001";
        String correctPassword = "pass001";
        
        String username = "";
        String password = "";
        
        // Prompt the user to enter username and password until they are correct
        while (!username.equals(correctUsername) || !password.equals(correctPassword)) {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            
            if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
        
        System.out.println("Happy New Year!");
        
        // Close the scanner
        scanner.close();
    }
}
