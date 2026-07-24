import java.util.Scanner;

public class Switch2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("a.add b.sub c.mul d.div e.remainder Enter your choice:");
        char c=s.next().charAt(0);
        int a = s.nextInt();
        int b = s.nextInt();
        switch (c) {
            case 'a':
                System.out.println("add:"+(a+b));
                break;

            case 'b':
                System.out.println("sub:"+(a-b));
                break;

            case 'c':
                System.out.println("mul:"+(a*b));
                break;
            case 'd':
                System.out.println("div:"+(a/b));
                break;
            case 'e':
                System.out.println("rem:"+(a%b));
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}




