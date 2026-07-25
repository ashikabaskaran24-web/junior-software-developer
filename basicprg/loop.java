/*loop
a set of stmt executes more than one times until condition is true
types
~~~~~
1.for loop-fixed iteration
2.while loop-unfixed iteration with entry loop
3.do while loop-unfixed iteration with exit loop//always exit once
nested loop-loop inside another loop
for loop
==========
for(intial;condi;increment/decre)
{
stmt;
}
step;
step1 :inital(starting value)
ex:int i=1
step2 :condition(true/false)
ex:i<10
step 3:stmt
sysout(i)
step 4:incer/decre
step 5:step 2
*/
public class loop
{
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("consistency");
        }
    }
}