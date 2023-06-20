package bookofemp;

import java.util.Arrays;

public class Employee {
    private String name;
    private String surname;
    private String midname;
    private int otdel;
    private double salary;
    public static int idCount = 1; // id
    private int id;
    public  Employee(String name, String surname, String midname, int otdel, double  salary) {
        this.name = name;
        this.surname = surname;
        this.midname = midname;
        this.otdel = otdel;
        this.salary = salary;
        this.id = idCount++;
        }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getMidname() {
        return midname;
    }
    public int getOtdel() {
        return otdel;
    }
    public double getSalary() {
        return salary;
    }
    public int getid() {
        return id;
    }
    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", midname='" + midname + '\'' +
                ", otdel=" + otdel +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
    public String printFullName() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", midname='" + midname + '\'' +
                '}';
    }
}

