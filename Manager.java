public class Manager {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private double bonusBudget;

    public void giveBonus(Employee emp,double bonus)
    {
        if(bonus <= bonusBudget)
        {
            double newSalary = emp.getSalary() + bonus;
            emp.setSalary(newSalary);
            bonusBudget = bonusBudget - bonus;
            System.out.println("Bonus of " + bonus + " granted to " + emp.getName() + ". New salary: " + newSalary);
        } else {
            System.out.println("Not enough budget to give this bonus.");
        }

    }
    public Manager(int id, String firstName, String lastName, int age, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.bonusBudget = 500;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getBonusBudget() {
        return bonusBudget;
    }
    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }
    public String toString()
    {
        return "Manager ID: " + id + ", FirstName: " + firstName + ", LastName: " + lastName + ", Age: " + age + ", Salary: " + salary + ", Bonus Budget: " + bonusBudget;
    }
}
