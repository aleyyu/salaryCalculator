public class Test{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aleyna Yıldız", 20000, 45, 2010);
        Employee emp2 = new Employee("Efe Yıldız", 10000, 40, 2018);

        String name1 = emp1.getName();
        int salary1 = emp1.getSalary();
        int hireYear1 = emp1.getHireYear();
        int workHours1 = emp1.getWorkHours();
        int tax1 = emp1.tax(salary1);
        int bonus1 = emp1.bonus(workHours1);
        int raise1 = emp1.raiseSalary(hireYear1, salary1);
        emp1.toString(name1, salary1, workHours1, hireYear1, tax1, bonus1, raise1);

        System.out.println("******************************************************************");

        String name2 = emp2.getName();
        int salary2 = emp2.getSalary();
        int hireYear2 = emp2.getHireYear();
        int workHours2 = emp2.getWorkHours();
        int tax2 = emp2.tax(salary2);
        int bonus2 = emp2.bonus(workHours2);
        int raise2 = emp2.raiseSalary(hireYear2, salary2);
        emp2.toString(name2, salary2, workHours2, hireYear2, tax2, bonus2, raise2);
    }
}