import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Consume the newline left-over
        scanner.nextLine();
        
        // Prompt the user to enter their phone number
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        
        // Display the entered information
        System.out.println("\n--- Person Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        
        // Close the scanner
        scanner.close();
    }
}
