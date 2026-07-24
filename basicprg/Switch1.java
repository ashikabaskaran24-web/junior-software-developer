/*syntax
~~~~~~
switch(expression)
{
    case 1:
      stmt;
      break;
    case 2:
      stmt;
      break;
    case 3:
     break;
     break;
    default:
      default stmt;
}
ex:
int k=1;
switch(k)
{
    
}*/
import java.util.Scanner;

public class Switch1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1.add 2.sub 3.mul 4.div 5.remainder Enter your choice:");
        int c=s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        switch (c) {
            case 1:
                System.out.println("add:"+(a+b));
                break;

            case 2:
                System.out.println("sub:"+(a-b));
                break;

            case 3:
                System.out.println("mul:"+(a*b));
                break;
            case 4:
                System.out.println("div:"+(a/b));
                break;
            case 5:
                System.out.println("rem:"+(a%b));
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}



