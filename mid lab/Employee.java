public class Employee {
    int employee_id;
    String employee_name;
    float salary;
    String department;

    Employee() {
        employee_id =0;
        employee_name="not provider";
        salary=0;
        department= "not provider";
    }

    Employee(int employee_id, String employee_name, float salary, String department) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.salary = salary;
        this.department = department;
    }

    void displayDetails () {
        System.out.println("Employee " + employee_id + " details");
        System.out.println("Name: '"+ employee_name + "'.\n Works in department of '" + department + "'.\n His salary is: '" + salary+"'");
        System.out.println();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee(2, "Sakib", 40000, "IT");
        Employee employee3 = new Employee();

        employee3.employee_id = 3;
        employee3.employee_name = "Rakib";
        employee3.department = "Finance";
        employee3.salary = 60000;

        employee1.displayDetails();
        employee2.displayDetails();
        employee3.displayDetails();
    }
}