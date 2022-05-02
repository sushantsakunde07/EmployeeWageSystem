package EmployeeWage;

public class EmployeeWage {

    public static final int isFullTime = 1;
    public static final int isPartTime = 2;
    public static final int empRatePerHour = 20;
    public static final int numberOfWorkingDays = 20;

    public static final int maximumHoursInMonth = 100;

    public static int employeeDailyWage() {
        int employeehour = 0;
        int Totalemployeehours = 0, totalworkingdays = 0;
        while (Totalemployeehours <= maximumHoursInMonth && totalworkingdays < numberOfWorkingDays) {
            totalworkingdays++;
            double empcheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empcheck) {
                case isFullTime:
                    employeehour = 8;
                    break;
                case isPartTime:
                    employeehour = 4;
                    break;
                default:
                    employeehour = 0;
            }
            Totalemployeehours += employeehour;
            System.out.println("days : " + totalworkingdays + "employee hour:" + employeehour);
        }
        int Totalemployeewage = Totalemployeehours * empRatePerHour;
        System.out.println("Total empolyee HOUR:" + Totalemployeehours);
        System.out.println("Total empolyee wage:" + Totalemployeewage);
        return isFullTime;
    }

    public static void main(String[] args) {
        employeeDailyWage();
    }
}
