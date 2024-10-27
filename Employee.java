public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public Employee(){
        this(10,"George",1975.50,"IT");
    }
    public String toString(){
        return "ID: " + this.id + " Name: " + this.name + " Salary: " + this.salary + " Department: " + this.department;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setDepartment(String department){
        this.department = department;
    }

}
