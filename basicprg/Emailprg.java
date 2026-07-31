import java.util.Scanner;
class Emailprg {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        String n1=s1.next();
        int count=0;
        int count1=0;
        int count2=0;
        int len=n1.length();
        System.out.println("enter your text:");
        for(int i=0;i<len;i++)
        {
             char ch=n1.charAt(i);
             System.out.print(ch);
             if(ch>='a'&&ch<='z')//comparing with ascii value
             {   
                count ++;
             }
             else if(ch>='0'&&ch<='9')
             {
                count1 ++;
             }
             else if(ch=='.')
             {
                 count2++;
             }
             else if(ch=='@')
             {
                break;
             }
        }
        System.out.println(" alphabet:"+count);
        System.out.println(" number:"+count1);
        System.out.println(" special:"+count2);

        }
    }

