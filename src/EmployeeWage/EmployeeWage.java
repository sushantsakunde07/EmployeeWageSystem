package EmployeeWage;

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 20;
    public static final int MAXIMUM_HOURS_IN_MONTH = 100;

    public static void main(String[] args) {
        int employeeHour = 0;
        int totalEmployeeHours = 0;
        int totalWorkingDays = 0;
        while (totalEmployeeHours <= MAXIMUM_HOURS_IN_MONTH && totalWorkingDays < NUMBER_OF_WORKING_DAYS) {
            totalWorkingDays++;
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
            totalEmployeeHours += employeeHour;
            System.out.println("day :" + totalWorkingDays + " employee hour:" + employeeHour);
        }
        int Totalemployeewage = totalEmployeeHours * EMP_RATE_PER_HOUR;
        System.out.println("Total empolyee wage:" + Totalemployeewage);
        System.out.println("Total empolyee hour:" + totalEmployeeHours);
        System.out.println("Total empolyee working days:" + totalWorkingDays);

    }
}