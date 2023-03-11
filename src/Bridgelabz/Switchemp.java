package Bridgelabz;

public class Switchemp {
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
        
        switch (x) {
            case 1:
            {
                System.out.println("Employee daily wage for fulltime is:"+fulltime(20, 8));
            }
            break;
            case 2:
            {
                System.out.println("Employee daily wage for absent is:"+partTime(20, 0));
            }
            default:
            {
                System.out.println("No data found for Emp");
            }
            break;
        }
    }
   
}
    

        




