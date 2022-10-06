public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
     public void printEmployee(String name, int salary, int workHours, int hireYear){
         System.out.println("Employee's name : " + name);
         System.out.println("Employee's salary : " + salary);
         System.out.println("Employee's weekly working hours : " + workHours);
         System.out.println("Employee's year of employment : " + hireYear);
     }
    public int tax(int salary){
        int tax;
        if(salary < 1000){
            tax = 0;
        }
        else{
            tax = (salary * 3)/100;
        }
        return tax;
    }

    public int bonus(int workHours){
        int bonus = 0;
        final int bonusPay = 30;
        if(workHours > 40){
            int bonusHour = workHours - 40;
            bonus = bonusHour * bonusPay;
        }
        return bonus;
    }


    public int raiseSalary(int hireYear, int salary){
        int currYear = 2021;
        int workedYears = currYear - hireYear;
        int raise;
        if(workedYears < 10){
            raise = (salary * 5)/100;
        }
        else if(workedYears > 9 && workedYears < 20){
            raise = (salary * 10)/100;
        }
        else{
            raise = (salary * 15)/100;
        }
        return raise;
    }

    public void toString(String name, int salary, int workHours, int hireYear, int tax, int bonus, int raise){
        int netSalary = salary - tax + bonus;           //tax ve bonusla net salary
        int totalSalary = netSalary + raise;            // net salary ve raise toplamı

        System.out.println("Employee's name : " + name);
        System.out.println("Employee's salary : " + salary);
        System.out.println("Employee's weekly working hours : " + workHours);
        System.out.println("Employee's year of employment : " + hireYear);
        System.out.println("Employee's tax amount of salary : " + tax);
        System.out.println("Employee's bonus pay : " + bonus);
        System.out.println("Employee's raise : " + raise);
        System.out.println("Employee's salary including tax and bonus : " + netSalary);
        System.out.println("Employee's net salary: " + totalSalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}

