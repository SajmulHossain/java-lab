public class oopclass {
    public static class Car {
        String make;
        String model;
        int year;
        String color;

        public Car() {
            System.out.println("Default constructor called");
            make = "Unknow";
            model = "Generic";
            year = 0;
            color = "Undefined";
        }

        public Car(String mk, String mdl, int yr, String clr) {
            System.out.println("Parameterized constructor called");
            make = mk;
            model = mdl;
            year = yr;
            color = clr;
        }

        public void displayCarInfo() {
            System.out.println("Make " + make);
            System.out.println("Model " + model);
            System.out.println("Year " + year);
            System.out.println("Color " + color);
        }

        public void startEngine() {
            System.out.println("The " + color + " " + make + " " + model + " " + "'s engine is starting");
        }

        // ~Car() {
        //     System.out.println("Destrctor is called");
        // }
    }

    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println("\n--- Car 1 information (using default constructor) ---");
        car1.displayCarInfo();
        car1.startEngine();

        Car car2 = new Car("Honda", "Civic", 2024, "Red");

        System.out.println("\n--- Car 2 information (using parameterized constructor)---");
        car2.displayCarInfo();
        car2.startEngine();

        Car car3 = new Car("Toyota", "Harrier", 2013, "Black");

        System.out.println("\n--- Car 3 information (using parameterized constructor)---");
        car3.displayCarInfo();
        car3.startEngine();

        car3.color = "Blue";
        car3.model = "2025";

        System.out.println("\n--- Car 3 information (after direct assignment)---");
        car3.displayCarInfo();
        car3.startEngine();

        Car car4 = new Car();
        System.out.println("\n--- Car 4 information (using default constructor)---");
        car4.displayCarInfo();

        car4.make = "BMW";
        car4.make = "X5";
        car4.year = 2026;
        car4.color = "White";

        System.out.println("\n--- Car 4 information (after direct assignment)---");

        car4.displayCarInfo();
        car4.startEngine();
    }
}
