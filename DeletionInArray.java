import java.util.Scanner;

public class DeletionInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] newArr = new int[arr.length - 1];

        System.out.println("Main Array: ");
        printArray(arr);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the index number: ");
        int index = input.nextInt();

        if (index >= newArr.length) {
            System.out.println("Invalid input");
            input.close();
            return;
        }

        // System.out.println("Enter the value: ");
        // int value = input.nextInt();

            // newArr[index] = value;
        
        for(int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        for(int i = index; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }
        
        printArray(newArr);
        input.close();
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}
