public class Company {
    private String name;
    private String address;
    private int numberOfEmployees;
    private Employee employee1;
    private Manager manager;
    //private Employee employee2;
    public Company(String name, String address, int numberOfEmployees) {
        this.name = name;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
    }
    public void hireEmployee(Employee e) {
        if(numberOfEmployees == 0) {
            employee1 = e;
            numberOfEmployees++;
        }
        else
        {
            System.out.println("Can't hire more employees.Limit reached.");
        }
        System.out.println("Employee hired: " + e);
    }

    public void fireEmployee(int id) {
        if(employee1 != null && employee1.getId() == id) {
            employee1 = null;
            numberOfEmployees--;
            System.out.println("Employee with id " + id + " fired.");
        }
        else if(numberOfEmployees == 0) {
            System.out.println("Company has no employee to fire.");
        }
    }

    public void increaseSalary(int id, double amount) {
            if(employee1 != null && employee1.getId() == id) {
                double newSalary = employee1.getSalary() + amount;
                employee1.setSalary(newSalary);
                System.out.println("Employee with id " + id + " increased salary: " + newSalary);
            }
            else
            {
                System.out.println("Can't increase salary because employee does not exist.");
            }
    }
    public Company(){
        this("Microsoft","USA,New York",5);
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    public Manager getManager() {
        return manager;
    }
    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public void listEmployees(){
        if(numberOfEmployees == 0) {
            System.out.println("Company has no employees.");
        }
        else
        {
            System.out.println("Employees in " + name + ":");
            if (employee1 != null) System.out.println(employee1);
        }

    }
    public String toString() {
        return "Company [name=" + name + ", address=" + address + ", numberOfEmployees=" + numberOfEmployees + "]";
    }
}
