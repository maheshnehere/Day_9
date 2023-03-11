package Bridgelabz;

public class Dailywage {
    int emppresent = 1;

    int empabsent = 0;
    
    public static int presentWage(int wagePerhr,int fullDayHr)
    {
        return wagePerhr*fullDayHr; 
    }
    public static int absentWage(int wagePerhr,int noworkhrs)
    {
        return wagePerhr*noworkhrs;
    }
    public static void main(String[] args) {
       int x = (int)(Math.random()*2);
   
    if(x == 1 )
    {
        System.out.println("Employee daily wage for fulltime is:"+presentWage(20, 8));
    }
    else if( x == 0)
    {
        System.out.println("Employee daily wage for absent is:"+absentWage(20, 0));
    }
    else{
        System.out.println("No data found for Emp");
    }
}
    
}
