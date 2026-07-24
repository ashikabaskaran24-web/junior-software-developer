import java.util.Scanner;
class onesimple{
    public static void main(String args[]) {
        Scanner s1=new Scanner(System.in);
        int n1=s1.nextInt();
        int n2=s1.nextInt();
        if(n1>=n2)
        {
            System.out.println("n1 is big");
        }
        else{
            System.out.println("n2 is big");
        }
    }
}

