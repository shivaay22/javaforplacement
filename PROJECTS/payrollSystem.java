import java.util.ArrayList;

abstract class Employee
{
    private String name;
    private int id;

    Employee(String name,int id)
    {
        this.name = name;
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public int getID()
    {
        return id;
    }

    public abstract double calculateSalary();

    public String toString()
    {
        return "Employee [name="+name+",id = " + id + ", Slary =" + calculateSalary()+"]";
    }
}
class FullTimeEmployyee extends Employee
{
    private double monthlySalry;

    public FullTimeEmployyee(String name,int id,double monthlySalry)
    {
        super(name, id);
        this.monthlySalry = monthlySalry;
    }
    public double calculateSalary()
    {
        return monthlySalry;
    }
}
class PartTimeEmployee extends Employee
{
    private int hourWorked;
    private double hourlyRate;
    PartTimeEmployee(String name,int id,int hourWorked,int hourlyRate)
    {
        super(name, id);
        this.hourWorked = hourWorked;
        this.hourlyRate = hourlyRate;
    }
    public double calculateSalary()
    {
        return hourWorked * hourlyRate;
    }
}
class payrollSystum
{
    private ArrayList<Employee> employeeList;
    // ArrayList<Integer> a1 = new ArrayList<>();
    public payrollSystum()
    {
        employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }

    public void removeEmployee(int id)
    {
        Employee employeToremove = null;
        for(Employee employee : employeeList)
        {
            if(employee.getID() == id)
            {
                employeToremove = employee;
                break;
            }
        }
        if(employeToremove != null)
        {
            employeeList.remove(employeToremove);
        }
        System.out.println("EmployeToRemove: " + employeToremove);
    }
    public void displayEmployyee()
    {
        for(Employee employee : employeeList)
        {
            System.out.println(employee);
        }
    }
}
public class payrollSystem {
    public static void main(String[] args) {
        payrollSystum p1 = new payrollSystum();
        FullTimeEmployyee emp1 = new FullTimeEmployyee("DAVID", 20, 200);
        PartTimeEmployee emp2 = new PartTimeEmployee("Alexnder", 22, 8, 500);


        p1.addEmployee(emp1);
        p1.addEmployee(emp2);

        System.out.println("Employee details: ");
        p1.displayEmployyee();
        // System.out.println("Removing Employee: ");
        // p1.removeEmployee(22);
        // System.out.println("Remianing Employee: ");
        // p1.displayEmployyee();

    }
}
