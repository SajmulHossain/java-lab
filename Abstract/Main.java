package Abstract;
abstract class Person {
    // Private fields (Encapsulation)
    private String name;
    private int age;

    // Protected fields (Accessible by subclasses)
    protected String phoneNo;
    protected String email;
    protected boolean occupation;

    // Default Constructor
    public Person() {
    }

    // Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // Abstract Methods (Must be implemented by child classes)
    abstract boolean hasOccupation();

    abstract public void display();
}

// 2. Concrete Child Class: Student
class Student extends Person {
    private String id;
    private double cgpa;

    public Student() {
        // Typically, a student does not have a formal occupation in this context
        this.occupation = false;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getID() {
        return id;
    }

    public double getCGPA() {
        return cgpa;
    }

    // Implementation of abstract method hasOccupation
    @Override
    boolean hasOccupation() {
        return false;
    }

    // Implementation of abstract method display
    @Override
    public void display() {
        System.out.println("=== Student Profile ===");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getID());
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Phone: " + getPhoneNo());
        System.out.println("Email: " + getEmail());
        // Convert boolean to a readable String
        System.out.println("Has Occupation: " + (hasOccupation() ? "Yes" : "No"));
        System.out.println(); // Empty line for better formatting
    }
}

// 3. Concrete Child Class: Employee
class Employee extends Person {
    private String id;
    private int salary;

    public Employee() {
        // An employee definitely has an occupation
        this.occupation = true;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getID() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    // Implementation of abstract method hasOccupation
    @Override
    boolean hasOccupation() {
        return true;
    }

    // Implementation of abstract method display
    @Override
    public void display() {
        System.out.println("=== Employee Profile ===");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getID());
        System.out.println("Salary: " + getSalary());
        System.out.println("Phone: " + getPhoneNo());
        System.out.println("Email: " + getEmail());
        System.out.println("Has Occupation: " + (hasOccupation() ? "Yes" : "No"));
        System.out.println();
    }
}

// 4. Main Class to Run the Program
public class Main {
    public static void main(String[] args) {

        // Creating and populating a Student object
        Student s1 = new Student();
        s1.setName("Alice Student");
        s1.setAge(21);
        s1.setPhoneNo("555-0199");
        s1.setEmail("alice@uni.edu");
        s1.setID("S-101");
        s1.setCGPA(3.85);

        // Creating and populating an Employee object
        Employee e1 = new Employee();
        e1.setName("Bob Worker");
        e1.setAge(35);
        e1.setPhoneNo("555-0200");
        e1.setEmail("bob@work.com");
        e1.setID("E-505");
        e1.setSalary(50000);

        // Displaying the details
        s1.display();
        e1.display();
    }
}