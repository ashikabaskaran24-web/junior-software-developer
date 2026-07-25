 import java.util.Scanner;
public class Taskmonth {
    public static void main(String args[])
    {
       Scanner s1=new Scanner(System.in);
       int year=s1.nextInt();
       System.out.println("1.jan,2.feb,3.mar,4.apr,5.may,6.jun,7.jly,8.aug,9.sep,10.oct,11.nov,12.dec");
       String a=s1.next();
       switch (a) {
        case "jan":
            System.out.println("31 days" );
            break;
        case "feb":
            if(year%4==0)
            System.out.println("28 days" );
            else
            System.out.println("29 days" );
            break;
        case "mar":
            System.out.println("31 days" );
            break;
        case "apr":
            System.out.println("30 days" );
            break;
        case "may":
            System.out.println("31 days" );
            break;
        case "jun":
            System.out.println("30 days" );
            break;
        case "jly":
            System.out.println("31 days" );
            break;
        case "aug":
            System.out.println("30 days" );
            break;
        case "sep":
            System.out.println("31 days" );
            break;
        case "oct":
            System.out.println("30 days" );
            break;
        case "nov":
            System.out.println("30 days" );
            break;
        case "dec":
            System.out.println("31 days" );
            break;
        default:
            System.out.println("invalid choice" );
            break;
       }

    }  
}
