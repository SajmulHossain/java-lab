package Triangle;

class Triangle {
    protected float base;
    protected float height;

    public Triangle() {
        this.base = 0;
        this.height = 0;
    }

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public float getHeight() {
        return height;
    }

    public void calculateArea() {
        System.out.println("Triangle class");
    }
}

class RightAngleTriangle extends Triangle {
    public RightAngleTriangle() {
        super();
    }

    public RightAngleTriangle(float base, float height) {
        super(base, height);
    }

    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Right Angle Triangle: " + area);
    }
}

class EquilateralTriangle extends Triangle {
    public EquilateralTriangle() {
        super();
    }

    public EquilateralTriangle(float base, float height) {
        super(base, height);
    }

    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Equilateral Triangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle tri;
        System.out.println("--- Base Class Object ---");
        tri = new Triangle();
        tri.calculateArea();
        System.out.println();
        System.out.println("--- RightAngleTriangle Object (Polymorphism) ---");
        tri = new RightAngleTriangle(10.0f, 20.0f);
        tri.calculateArea();
        System.out.println();

        System.out.println("--- EquilateralTriangle Object (Polymorphism) ---");
        tri = new EquilateralTriangle(10.0f, 8.66f);
        tri.calculateArea();
    }
}