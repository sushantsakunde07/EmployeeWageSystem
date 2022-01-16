package EmployeeWage;

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        int employeeHour = 0;
        int employeeWage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empcheck) {
            case FULL_TIME:
                employeeHour = 8;
                break;
            case PART_TIME:
                employeeHour = 4;
                break;
            default:
                employeeHour = 0;
        }
        employeeWage = employeeHour * EMP_RATE_PER_HOUR;
        System.out.println("empolyee wage:" + employeeWage);
    }
}