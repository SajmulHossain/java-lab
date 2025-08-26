import java.util.Scanner;

public class ConditionAndLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int age = 20;
    
    if(age >= 18) {
      System.out.println("You are eligible to vote");
    } else {
      System.out.println("Your are not eligible for vote");
    }

int number = -1;

if(number > 0) {
  System.out.println("The number is positive");
} else if(number < 0) {
  System.out.println("The number is negetive");
} else {
  System.out.println("The number is Zero");
}

String day= "Monday";

switch(day) {
  case "Monday" : 
  System.out.println("It's the start of the week");
  break;

  case "Friday":
  System.out.println("It's almost weekend");
  break;

  default: 
  System.out.println("Int's another day"); 
}

System.out.println("\n--- Demonstrating different kinds of loop ");

// 1: fooor loop
System.out.println("\n Using for loop");

for(int i = 0; i <5; i ++) {
  System.out.println("Iteration: " + i);
}

// while loop
System.out.println("\n Using while loop");

int count = 0;

while(count< 3) {
  System.out.println("Count: " + count);
  count++;
}

int j = 0;

do {
  System.out.println("J is:" + j);
  j++;
} while(j < 2);

System.out.println("\n Using enhance for loop (for-each)");

int[] numbers = {10,20,30,40,50};

for(int num: numbers) {
  System.out.println("Number: " + num);
}

    scanner.close();
  }
}