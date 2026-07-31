import java.util.Scanner;
class Lastname {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        String n1=s1.next();
        int len=n1.length()-1;
        char ch;
        char ch1;
        for(int i=0;i<=len;i++)
        {
            if(i==len)//for odd character bas to bsaa
            {
             ch=n1.charAt(i);
             System.out.print(ch);
             break;
            }
            ch=n1.charAt(i);
            System.out.print(ch);//a
            System.out.print(ch1=n1.charAt(len));//a  totally 2 aa for that using if break 
            len--;

        }
    }
}
