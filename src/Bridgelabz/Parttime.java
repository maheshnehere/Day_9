package Bridgelabz;

public class Parttime {
    int emppresent = 1;
    
        int emphalfday = 0;

        public static int fulltime(int wagePerhr,int fullDayHr)
        {
            return wagePerhr*fullDayHr; 
        }
        public static int partTime(int wagePerhr,int partTimeHr)
        {
            return wagePerhr*partTimeHr;
        }
        public static void main(String[] args) {
           int x = (int)(Math.random()*2);
       
        if(x == 1 )
        {
            System.out.println("Employee daily wage for fulltime is:"+fulltime(20, 16));
        }
        else if( x == 0)
        {
            System.out.println("Employee daily wage for parttime is:"+partTime(20, 8));
        }
        else 
        {
            System.out.println("Employee is absent");
        }
    }
}
