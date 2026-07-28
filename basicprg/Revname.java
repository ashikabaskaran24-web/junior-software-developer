import java.util.Scanner;
class Revname {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int count=0;
        String n1 = s1.next();
        for(int i=n1.length()-1;i>=0;i--)//4-1 ;i>=0;i--
        {
            char ch = n1.charAt(i);
            {
                System.out.print(ch);
            }
        }
    } 
}
