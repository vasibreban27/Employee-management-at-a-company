public class TestCompany {
    public static void main(String[] args) {
        Company company = new Company("TechDevelopment","145 Main Road",0);
        Employee emp = new Employee(1,"George",3000,"Engineer");
        Employee emp2 = new Employee(2,"John",5000,"Developer");
        Manager manager = new Manager(100,"Jeff","Bezos",55,100000);
        company.setManager(manager);

        company.hireEmployee(emp);
        company.listEmployees();
        company.fireEmployee(1);
        company.listEmployees();
        company.hireEmployee(emp2);
        company.increaseSalary(2,700);
        manager.giveBonus(emp2,300);
        company.listEmployees();

    }
}
