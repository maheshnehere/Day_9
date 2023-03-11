package Bridgelabz;

public class Monthlywage {
        int emppresent = 1;
    
        int emphalfday = 0;

        int absent = 2;
        public static int fulltime(int wagePerhr,int fullDayHr,int monthDays)
        {
            return wagePerhr*fullDayHr* monthDays; 
        }
        public static int partTime(int wagePerhr,int partTimeHr,int monthDays)
        {
            return wagePerhr*partTimeHr* monthDays;
        }
        public static void main(String[] args) {
           int x = (int)(Math.random()*3);
       
        if(x == 1 )
        {
            System.out.println("Employee daily wage for fulltime is:"+fulltime(20, 16,20));
        }
        else if( x == 0)
        {
            System.out.println("Employee daily wage for parttime is:"+partTime(20, 8,20));
        }
        else if (x == 2)
        {
            System.out.println("Employee is absent");
        }
    }
}
