package bookofemp;

public class Store {
    private Employee[] employeeCorp = new Employee[10];
    public Store() {
        employeeCorp[0] = new Employee("Иван", "Иванов", "Иванович", 5, 100003);
        employeeCorp[1] = new Employee("Игорь", "Игорев", "Игоревич", 1, 61300);
        employeeCorp[2] = new Employee("Петр", "Петров", "Петрович", 2, 110000);
        employeeCorp[3] = new Employee("Николай", "Николаев", "Николаевич", 2, 489310);
        employeeCorp[4] = new Employee("Иванyчес", "Иванов", "Иванович", 4, 80000);
        employeeCorp[5] = new Employee("Игорек", "Игорев", "Игоревич", 3, 65000);
        employeeCorp[6] = new Employee("Петруша", "Петров", "Петрович", 2, 95000);
        employeeCorp[7] = new Employee("Никоглай", "Никоглаев", "Никоглаевич", 1, 75000);
        employeeCorp[8] = new Employee("Петрушес", "Петровчус", "Петрович", 2, 94000);
        employeeCorp[9] = new Employee("Никола", "Нидворов", "Николаевич", 3, 72000);
    }
    public void printAllEmp() {
        for (Employee employee : employeeCorp) {
            System.out.println(employee);
        }
    }
    public double calculateAllSal() {
        double salaries = 0;
        for (Employee employee : employeeCorp) {
            salaries += employee.getSalary();
        }
        return salaries;
    }
    public Employee calculateMinEmp() {
        Employee calculateMinEmp = employeeCorp[0];
        for (Employee employee : employeeCorp) {
            if (employee.getSalary() < calculateMinEmp.getSalary()) {
                calculateMinEmp = employee;
            }
        }
        return calculateMinEmp;
    }
    public Employee calculateMaxEmp() {
        Employee calculateMaxEmp = employeeCorp[0];
        for (Employee employee : employeeCorp) {
            if (employee.getSalary() > calculateMaxEmp.getSalary()) {
                calculateMaxEmp = employee;
            }
        }
        return calculateMaxEmp;
    }
    public double calculateMediumSal() {
        double allSal = calculateAllSal();
        return  allSal / employeeCorp.length;
    }
    public void  printFullName() {
        for (Employee employee : employeeCorp) {
            System.out.println(employee.printFullName());
        }
    }
}

