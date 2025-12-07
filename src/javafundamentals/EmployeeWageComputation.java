package javafundamentals;

public class EmployeeWageComputation {
    public static void main(String[] args)
    {
        //constants
        int WagePerHour = 20;
        int FullDayHours = 8;
        int PartTimeHours = 8;
        int MaxWorkingDays = 20;
        int MaxTotalHours = 100;

        final int Absent = 0;
        final int FullTime = 1;
        final int PartTime = 2;

        //variable to track total working hours, total days and total wage
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while(totalHours < MaxTotalHours && totalDays < MaxWorkingDays)
        {
            totalDays++;

            int empType = (int) (Math.random() * 3);
            int workingHours;

            switch (empType)
            {
                case FullTime:
                    workingHours = FullDayHours;
                    break;
                case PartTime:
                    workingHours = PartTimeHours;
                    break;
                default:
                    workingHours = 0;
                    break;
            }

            totalHours += workingHours;
            totalWage += workingHours * WagePerHour;


        }

        System.out.println("Total Days = " + totalDays);
        System.out.println("Total Hours = " + totalHours);
        System.out.println("Total Wage = " + totalWage);
    }
}
