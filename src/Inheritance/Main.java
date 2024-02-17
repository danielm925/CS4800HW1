package Inheritance;

public class Main{
    public static void main(String[] args){
        generateEmployeeInfo();
    }

    public static void generateEmployeeInfo(){
        SalariedEmployee joe = new SalariedEmployee();
        SalariedEmployee renwa = new SalariedEmployee();
        HourlyEmployee stephanie = new HourlyEmployee();
        HourlyEmployee mary = new HourlyEmployee();
        CommissionEmployee nicole = new CommissionEmployee();
        CommissionEmployee mahnaz = new CommissionEmployee();
        BaseEmployee mike = new BaseEmployee();

        joe.setFirstName("Joe");
        renwa.setFirstName("Renwa");
        stephanie.setFirstName("Stephanie");
        mary.setFirstName("Mary");
        nicole.setFirstName("Nicole");
        mahnaz.setFirstName("Mahnaz");
        mike.setFirstName("Mike");

        joe.setLastName("Jones");
        renwa.setLastName("Chanel");
        stephanie.setLastName("Smith");
        mary.setLastName("Quinn");
        nicole.setLastName("Dior");
        mahnaz.setLastName("Vaziri");
        mike.setLastName("Davenport");

        joe.setSocialSecurityNumber("111-11-1111");
        renwa.setSocialSecurityNumber("555-55-5555");
        stephanie.setSocialSecurityNumber("222-22-2222");
        mary.setSocialSecurityNumber("333-33-3333");
        nicole.setSocialSecurityNumber("444-44-4444");
        mahnaz.setSocialSecurityNumber("777-77-7777");
        mike.setSocialSecurityNumber("666-66-6666");

        joe.setWeeklySalary(2500);
        renwa.setWeeklySalary(1700);
        stephanie.setWage(25);
        stephanie.setHoursWorked(32);
        mary.setWage(19);
        mary.setHoursWorked(47);
        nicole.setCommissionRate(15);
        nicole.setGrossSalary(50000);
        mahnaz.setCommissionRate(22);
        mahnaz.setGrossSalary(40000);
        mike.setBaseSalary(95000);

        System.out.print("Salaried Employees:\n");
        System.out.print(joe.getFirstName() + " " + joe.getLastName() + " -> "
                + "Social Security: " + joe.getSocialSecurityNumber()
                + " -> Weekly Salary: $" + joe.getWeeklySalary() + "\n");
        System.out.print(renwa.getFirstName() + " " + renwa.getLastName() + " -> "
                + "Social Security: " + renwa.getSocialSecurityNumber()
                + " -> Weekly Salary: $" + renwa.getWeeklySalary() + "\n");
        System.out.print("Hourly Employees:\n");
        System.out.print(stephanie.getFirstName() + " " + stephanie.getLastName() + " -> "
                + "Social Security: " + stephanie.getSocialSecurityNumber()
                + " -> Wage: $" + stephanie.getWage()
                +  " -> Hours Worked: " + stephanie.getHoursWorked() + "\n");
        System.out.print(mary.getFirstName() + " " + mary.getLastName() + " -> "
                + "Social Security: " + mary.getSocialSecurityNumber()
                + " -> Wage: $" + mary.getWage()
                +  " -> Hours Worked: " + mary.getHoursWorked() + "\n");
        System.out.print("Commission Employees:\n");
        System.out.print(nicole.getFirstName() + " " + nicole.getLastName() + " -> "
                + "Social Security: " + nicole.getSocialSecurityNumber()
                + " -> Commission Rate: %" + nicole.getCommissionRate()
                +  " -> Gross Salary: $" + nicole.getGrossSalary() + "\n");
        System.out.print(mahnaz.getFirstName() + " " + mahnaz.getLastName() + " -> "
                + "Social Security: " + mahnaz.getSocialSecurityNumber()
                + " -> Commission Rate: %" + mahnaz.getCommissionRate()
                +  " -> Gross Salary: $" + mahnaz.getGrossSalary() + "\n");
        System.out.print("Base Employees:\n");
        System.out.print(mike.getFirstName() + " " + mike.getLastName() + " -> "
                + "Social Security: " + mike.getSocialSecurityNumber()
                + " -> Base Salary: $" + mike.getBaseSalary() + "\n");
    }
}