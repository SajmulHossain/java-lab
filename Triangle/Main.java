package Triangle;

class Triangle {
    protected float base;
    protected float height;

    // Default Constructor
    public Triangle() {
        this.base = 0;
        this.height = 0;
    }

    // Parameterized Constructor
    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    // Setters
    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Getters
    public float getBase() {
        return base;
    }

    public float getHeight() {
        return height;
    }

    // Method to be overridden
    public void calculateArea() {
        System.out.println("Triangle class");
    }
}

// 2. Child Class: RightAngleTriangle (Inherits Triangle)
class RightAngleTriangle extends Triangle {

    public RightAngleTriangle() {
        super();
    }

    public RightAngleTriangle(float base, float height) {
        super(base, height);
    }

    @Override
    public void calculateArea() {
        // Area = 0.5 * base * height
        double area = 0.5 * base * height;
        System.out.println("Area of Right Angle Triangle: " + area);
    }
}

// 3. Child Class: EquilateralTriangle (Inherits Triangle)
class EquilateralTriangle extends Triangle {

    public EquilateralTriangle() {
        super();
    }

    public EquilateralTriangle(float base, float height) {
        super(base, height);
    }

    @Override
    public void calculateArea() {
        // Area = 0.5 * base * height
        double area = 0.5 * base * height;
        System.out.println("Area of Equilateral Triangle: " + area);
    }
}

// 4. Main Class for execution
public class Main {
    public static void main(String[] args) {

        // 1. Create a reference of Triangle class
        Triangle tri;

        // 2. Refer to an object of Triangle class and call calculateArea
        System.out.println("--- Base Class Object ---");
        tri = new Triangle();
        tri.calculateArea(); // Output: Triangle class
        System.out.println();

        // 3. Assign RightAngleTriangle reference to 'tri' and call calculateArea
        System.out.println("--- RightAngleTriangle Object (Polymorphism) ---");
        tri = new RightAngleTriangle(10.0f, 20.0f);
        tri.calculateArea(); // Output: Area calculation
        System.out.println();

        // 4. Assign EquilateralTriangle reference to 'tri' and call calculateArea
        System.out.println("--- EquilateralTriangle Object (Polymorphism) ---");
        // Note: For side 10, height is approx 8.66
        tri = new EquilateralTriangle(10.0f, 8.66f);
        tri.calculateArea(); // Output: Area calculation
    }
}