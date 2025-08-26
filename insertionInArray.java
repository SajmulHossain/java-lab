import java.util.Scanner;

public class insertionInArray {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i]= arr[i];
        }

        System.out.println("Main Array :");
        for (int i : arr) {
            System.out.print(i + "\t");
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the index number where you to insert");
        int index = input.nextInt();
        
        if(index > arr.length) {
            System.out.println("Invalid input");
            input.close();
            return;
        }
        
        System.out.println("Enter the value: ");
        int value = input.nextInt();

        newArr[index] = value;
        
        for(int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        for (int num : newArr) {
            System.out.print(num + "\t");
        }

        
        input.close();
    }
}
