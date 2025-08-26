public class Array {
    public static void main(String[] args) {
        int[] numbers ={10,20,30,40,50};
        System.out.println("Interger array numbers");
        printArray(numbers);

        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        System.out.println("String array names");
        printArray(names);

        System.out.println("Accessing Elements");
        System.out.println("First Element of 'numbers' " + numbers[0]);
        System.out.println("Secode Element of 'numbers' " + numbers[1]);
        
        System.out.println("Array Length");
        System.out.println("Array Length of numbers: " + numbers.length);
        System.out.println("Array Length of names: " + names.length);

        System.out.println("Iterating through 'numbers' using for loop");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        System.out.println("Iterating through 'names' using enhanced for loop");
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Print 2D array 'matrix'");
        print2DArray(matrix);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void printArray(String[] arr) {
        for (String num : arr) {
            System.out.println(num);
        }
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.err.print(arr[i][j] + "\t");
            }
            System.err.println();
        }
    }
}
