public class overlo {
    static int avg(int n1,int n2)
    {
        int tot=n1+n2;
        int avg1=tot/2;
        return avg1;
    }
    static int avg(int n1,int n2,int n3)
    {
        int tot=n1+n2+n3;
        int avg1=tot/3;
        return avg1;
    }
    public static void main(String[] args) {
        System.out.println(avg(10,20));
         System.out.println(avg(10,20,30));
    }
}
