
import java.util.Scanner;

public class Demo007 {
    public static void main(String[] args) {
        String name;
        int age;
        long phno;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Name:");
        name = scanner.nextLine();
        System.out.println("Your age:");
        age = scanner.nextInt();
        System.out.println("Your phno:");
        phno = scanner.nextLong();
        System.out.println("hello " + name + " ,your age is " + age + " ,your phone no is " + phno);
    }
}
