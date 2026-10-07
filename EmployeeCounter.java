public class EmployeeCounter {
  String name;
  static int employeeCount;

  public EmployeeCounter(String name) {
    this.name = name;
    employeeCount++;
  }

  public static void main(String[] args) {

    EmployeeCounter emp1 = new EmployeeCounter("Anna");
    EmployeeCounter emp2 = new EmployeeCounter("Mark");
    EmployeeCounter emp3 = new EmployeeCounter("John");

    System.out.println("Employee Created: " + emp1.name);
    System.out.println("Employee Created: " + emp2.name);
    System.out.println("Employee Created: " + emp3.name);
    System.out.println(employeeCount);
  }
}
