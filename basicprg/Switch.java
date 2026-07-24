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

public class Switch{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number (1 to 3):");
        int n = s.nextInt();

        switch (n) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid number");
        }
    }
}



