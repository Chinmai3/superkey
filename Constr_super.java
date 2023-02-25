import java.util.*;
import java.math.*;
public class Constr_super{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> al=new ArrayList<Integer>();
    while(sc.hasNextInt())
    {
        al.add(sc.nextInt());
    }
    B b=new B(al);
}
}
class A{
    int sum1=0;
    A(ArrayList<Integer> al)
    {
        int len=al.size();
        int i;
        for(i=0;i<len;i++)
        {
            if(i%2==0)
            {
                sum1+=(int)(al.get(i));
            }
        }
    }
}
class B extends A{
    int sum1=0;
    B(ArrayList<Integer> al)
    {
        //super() method is used to invoke the immediate parent class construcor.
        //super() method must be the first statement inside the constructor.
        super(al);
        int len=al.size();
        int i;
        for(i=0;i<len;i++)
        {
            if(i%2!=0)
            {
                sum1+=(int)(al.get(i));
            }
        }
        //super keyword used for accessing the immediate parent class instance variable.
        System.out.println(Math.abs(sum1-(super.sum1)));
    }
}