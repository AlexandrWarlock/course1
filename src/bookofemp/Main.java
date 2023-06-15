package bookofemp;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeCorp = new Employee[10];
        employeeCorp[0] = new Employee("Иван Иванов Иванович", 5, 10000);
        employeeCorp[1] = new Employee("Игорь Игорев Игоревич", 1, 60000);
        employeeCorp[2] = new Employee("Петр Петров Петрович", 2, 90000);
        employeeCorp[3] = new Employee("Николай Николаев Николаевич", 2, 70000);
        employeeCorp[4] = new Employee("Иванyчес Иванов Иванович", 4, 80000);
        employeeCorp[5] = new Employee("Игорьдон Игорев Игоревич", 3, 65000);
        employeeCorp[6] = new Employee("Петруша Петров Петрович", 2, 95000);
        employeeCorp[7] = new Employee("Никоглай Никоглаев Никоглаевич", 1, 75000);
        employeeCorp[8] = new Employee("Петрушес Петровчус Петрович", 2, 94000);
        employeeCorp[9] = new Employee("Никола Нидворов Николаевич", 3, 72000);
        printListAllEmployee(employeeCorp);
        calculateAllSalary(employeeCorp);
        calculateEmployeeMinSalary(employeeCorp);
        calculateEmployeeMaxSalary(employeeCorp);
        calculateMediumSalary(employeeCorp);
    }
    public static void printListAllEmployee(Employee[] employees) {
        System.out.println("Книга сотрудников");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
    public static int calculateAllSalary(Employee[] employees){
        System.out.println("Зарплата всех сотрудников:");
        int allSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            allSalary = allSalary + employees[i].getSalary();
        }
        System.out.println(allSalary + " рублей.");
        return allSalary;
    }
    public static int calculateEmployeeMinSalary(Employee[] employees) {
        System.out.println("Минимальная зарплата: ");
        int minSalary = employees[0].getSalary();
        int minSalIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary){
                minSalary = employees[i].getSalary();
                minSalIndex = i;
            }
        }
        System.out.println(minSalary + " рублей. Сотрудник - " + employees[minSalIndex].fullName());
        return minSalary;
    }
    public static int calculateEmployeeMaxSalary(Employee[] employees) {
        System.out.println("Максимальная зарплата: ");
        int maxSalary = employees[0].getSalary();
        int maxSalIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary){
                maxSalary = employees[i].getSalary();
                maxSalIndex = i;
            }
        }
        System.out.println(maxSalary + " рублей. Сотрудник - " + employees[maxSalIndex].fullName());
        return maxSalary;
    }
    public static int calculateMediumSalary(Employee[] employees){
        System.out.println("Средняя зарплата всех сотрудников по офису:");
        int allSalary = 0;
        int medSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            allSalary = allSalary + employees[i].getSalary();
        }
        medSalary = allSalary / employees.length;

        System.out.println(medSalary + " рублей.");
        return medSalary;
    }

}