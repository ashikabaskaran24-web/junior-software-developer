import java.util.Scanner;
class Found {
        public static void main(String args[])
    {
    Scanner s1=new Scanner(System.in);
    System.out.print("name:");
    String n1=s1.next();
    System.out.print("character:");
    char ch = s1.next().charAt(0);
    for(int i=0;i<n1.length();i++)
    {
        char c=n1.charAt(i);//just copying the n1 string into char because of we need to check by each char
        if(ch==c)
        {
            System.out.println(c);
            System.out.println("found at the index of " +i);
            break;
        }
        else
        {
            System.out.println(ch+" is not found ");
            break;
        }
    }
   }
}

