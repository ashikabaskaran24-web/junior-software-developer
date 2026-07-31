import java.util.Scanner;
class White{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter your text:");
        String n1=s1.nextLine();
        int len=n1.length();//ashika =6
        String res=" ";
        for(int i=0;i<len-1;i++)//4
        {
             char c1=n1.charAt(i);
             char c2=n1.charAt(i+1);
             if(c1==' '&& c2==' ')
                  continue;
             else
                res=res+c1;
        }
        System.out.print(res+n1.charAt(len-1));//5
    }
}