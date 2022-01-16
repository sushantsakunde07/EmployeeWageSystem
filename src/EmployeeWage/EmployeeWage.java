package EmployeeWage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int employeeHour = 0;
        int employeeWage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME)
            employeeHour = 8;
        else
            employeeHour = 0;
        employeeWage = employeeHour * EMP_RATE_PER_HOUR;
        System.out.println("empolyee wage:" + employeeWage);
    }
}