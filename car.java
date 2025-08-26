public class car {
    public static class Car {
        private String brand;
        private int top_speed;
        private float milage;
        private String model;

        public Car(String brand, int top_speed, float milage, String model) {
            this.brand = brand;
            this.top_speed = top_speed;
            this.milage = milage;
            this.model = model;
        }

        public float getMilage() {
            return milage;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getTop_speed() {
            return top_speed;
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 100, 20, "Allion");
        System.out.println("Brand name is: " + car1.getBrand());
    }
}
