import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = scanner.nextLine();
    System.out.println("My name is: \n" + name);

    System.out.println("Enter your age: ");
    int age = scanner.nextInt();
    System.out.println("My age is: " + age);
    scanner.nextLine();

    System.out.println("Enter your department name: ");
    String department = scanner.nextLine();
    System.out.println("My department name is: " + department+"\n");

    System.out.println("Enter your cgpa");
    float cgpa = scanner.nextFloat();
    System.out.println("My cgpa is: " + cgpa);

    scanner.close();
  }
}