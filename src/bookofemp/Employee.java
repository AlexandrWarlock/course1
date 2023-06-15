package bookofemp;

import java.util.Arrays;

public class Employee {
    private String fullName;
    private int otdel;
    private int salary;
    public static int idCount = 1; // id
    private int id;
    public  Employee(String fullName, int otdel, int salary) {
        this.fullName = fullName;
        this.otdel = otdel;
        this.salary = salary;
        this.id = idCount;
        idCount++;
        }
    private Employee[] employees;
    public Employee() {
        int[] employees = new int[10];

    }
    public String fullName() {
        return fullName;
    }
    public  int getSalary() {
        return salary;
    }
    public void getOtdel(int otdel) {
        this.otdel =otdel;
    }
    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + " Отдел:" + otdel + " Зарплата: "+ salary +  " id: " + id;
    }
}

