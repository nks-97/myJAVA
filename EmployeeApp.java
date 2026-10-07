public class EmployeeApp {
  public static void main(String[] args) {
    Employee emp1 = new Employee("niko", "it Dept", 29);
    Employee emp2 = new Employee("rodolf", "HR", 32);

    System.out.println(emp1.name);
    System.out.println(emp1.department);
    System.out.println(emp1.age);


    System.out.println(emp2.name);
    System.out.println(emp2.department);
    System.out.println(emp2.age);
    
  }
}
