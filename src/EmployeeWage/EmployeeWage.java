package EmployeeWage;

public class EmployeeWage {

    public static final int isFullTime = 1;
    public static final int isPartTime = 2;

    public static int employeeDailyWage(String company, int empRatePerHour, int numberOfWorkingDays, int maximumHoursInMonth) {
        int employeehour = 0;
        int totalworkingdays = 0;
        int Totalemployeehours = 0;
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
            //System.out.println("days : " + totalworkingdays + "employee hour:" + employeehour);
        }
        int Totalemployeewage = Totalemployeehours * empRatePerHour;
        System.out.println("Total empolyee hour:" + Totalemployeehours);
        System.out.println("Total empolyee wage:" + Totalemployeewage);
        return Totalemployeewage;
    }

    public static void main(String[] args) {
        employeeDailyWage("Wallmart", 30, 25, 200);
        employeeDailyWage("Reliance", 20, 20, 100);

    }
}