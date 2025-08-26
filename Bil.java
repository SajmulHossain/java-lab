import java.util.Scanner;

public class Bil {

   public static void main (String[] args){
     Scanner scanner = new Scanner(System.in);

    // int unit = scanner.nextInt();

    int bill = 0;

//  if(unit <= 70) {
//         bill += unit * 0.5;
//     } else if(unit > 70 && unit <= 130) {
//         bill += 70 * 0.5;
//         bill += 60 * 0.75;
//     } else if(unit > 130 && unit <= 150) {
//         bill += 70 * 0.5;
//         bill += 60 * 0.75;
//         bill += 20 * 1.20;
//     }

    System.out.println(bill);

    scanner.close();
   }
}