package Bridgelabz;
import java.util.*;
public class Timeorday {
    Random random = new Random();
    void daysOrWorkingHOurs() {
        int Fullday = 0;
        int halfDay = 1;
        int empHour;
        int TotalDays = 0;
        int totalEmpHour = 0;
        int SalaryPerHr = 20;
        int empWage = 0;
        int TotalWorkingDays = 20; // Maximum working days in a month.
        int TotalWorkingHours = 100; // Maximum working hours in a month

        while (totalEmpHour < TotalWorkingHours && TotalDays < TotalWorkingDays) {
            TotalDays++;
            int attendance = random.nextInt(3);

            if (attendance == Fullday) {
                empHour = 8; // Fullday job.

            } else if (attendance == halfDay) {
                empHour = 4; // halfDay job.

            } else {
                empHour = 0; // employee is absent.

            }

            totalEmpHour += empHour;
        }
        System.out.println("Total Working Days = " + TotalDays + " && Total Working Hours = " + totalEmpHour);

        empWage = totalEmpHour * SalaryPerHr;

        System.out.println("Total Employee Wage is   = " + empWage);
    }
    public static void main(String[] args) {;
        Timeorday runner = new Timeorday();
        runner.daysOrWorkingHOurs();
    }
}

