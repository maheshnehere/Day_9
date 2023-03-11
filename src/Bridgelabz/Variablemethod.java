package Bridgelabz;
import java.util.*;
public class Variablemethod {
    Random random = new Random();
    int fullTime = 0;
    int partTime = 1;
    int empHour;
    int totalWorkingDays = 0;
    int totalEmpHour = 0;
    int wagePerHr = 20;
    int empWage = 0;
    int maxWorkingDays = 20; // Maximum working days in a month.
    int maxWorkingHours = 100; // Maximum working hours in a month

    void classVariables() {


        while (totalEmpHour < maxWorkingHours && totalWorkingDays < maxWorkingDays) {
            totalWorkingDays++;
            int attendance = random.nextInt(3);

            if (attendance == fullTime) {
                empHour = 8; // fullTime job.

            } else if (attendance == partTime) {
                empHour = 4; // partTime job.

            } else {
                empHour = 0; // employee is absent.

            }

            totalEmpHour += empHour;
        }
        System.out.println("Total Working Days = " + totalWorkingDays + " && Total Working Hours = " + totalEmpHour);

        empWage = totalEmpHour * wagePerHr;

        System.out.println("Total Employee Wage is   = " + empWage);
    }
    public static void main(String[] args) {;
        Variablemethod runner = new Variablemethod();
        runner.classVariables();
    }
}