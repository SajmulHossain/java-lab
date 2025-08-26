// import java.util.Scanner;

public class arrayModification {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Main array");
        printArray(arr);

        // Scanner input = new Scanner(System.in);

        System.out.println("Enter the index number");
        
    }

        public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}
