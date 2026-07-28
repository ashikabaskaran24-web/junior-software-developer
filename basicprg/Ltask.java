import java.util.Scanner;
class Ltask {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int count=0;
        String n1 = s1.next();
        for(int i=0;i<n1.length();i++)
        {
            char ch = n1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.print(ch);
                count++;
            }

        }
         System.out.println(" ("+count+")");

    }
}
/*switch(c)
{
    case 'a':case'e':case'i':case'o':case'u'
     case 'A':case'E':case'I':case'O':case'U'*/
