package EmployeeWage;

public class EmployeeWage {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;
    private final String company;
    private final int maximumHoursInMonth;
    private final int numberOfWorkingDays;
    private final int empRatePerHour;
    private int totalEmployeeWage;


    public EmployeeWage(String company, int empRatePerHour, int numberOfWorkingDays, int maximumHoursInMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.maximumHoursInMonth = maximumHoursInMonth;
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    public void emplyeeDailyWage() {
        int employeehour = 0;
        int totalworkingdays = 0;
        int totalEmployeeHours = 0;
        while (totalEmployeeHours < maximumHoursInMonth && totalworkingdays < numberOfWorkingDays) {
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
            if (totalEmployeeHours + employeehour <= maximumHoursInMonth) {
                totalEmployeeHours += employeehour;
            }
            //System.out.println("days : " + totalworkingdays + "employee hour:" + employeehour);
        }
        totalEmployeeWage = totalEmployeeHours * empRatePerHour;
    }
    @Override
    public String toString() {
        return "\n Total Employee Wage for " + company + " is: " + totalEmployeeWage ;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation");
        EmployeeWage wallmart = new EmployeeWage("Wallmart", 30, 65, 200);
        wallmart.emplyeeDailyWage();
        System.out.println(wallmart);
        EmployeeWage reliance = new EmployeeWage("Reliance", 20, 20, 100);
        reliance.emplyeeDailyWage();
        System.out.println(reliance);
    }
}

