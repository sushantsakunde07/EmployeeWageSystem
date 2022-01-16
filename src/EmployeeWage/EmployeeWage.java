package EmployeeWage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        int FULL_TIME = 1;
        int PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int employeeHour = 0;
        int employeeWage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == FULL_TIME)
            employeeHour = 8;
        else if (empcheck == PART_TIME)
            employeeHour = 4;
        employeeWage = employeeHour * EMP_RATE_PER_HOUR;
        System.out.println("empolyee wage: " + employeeWage);
    }
}