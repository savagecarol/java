import java.util.*;
import java.math.*;
public class quadratic
 {
public static void main(String arr[])
    {
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    Quad obj=new Quad();
    while(T-->0)
        {
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        obj.roots(a,b,c);
        System.out.println();
        } 
        }
 }
class Quad
{
    public static void roots(int a,int b,int c)
    {
    int k;
    int s;
   double d= (b*b) - (4*a*c);
   System.out.println(d);
    if (d<0)
    {
        System.out.print("Imaginary");
    } 
    else if(d==0)
    {
        k=(-1*b)/(2*a);
        System.out.print(k+" "+k);

    }


    else
    {
        k=Math.floorDiv((-1*b) + ((b*b) - (4*a*c)),(2*a));
        s=Math.floorDiv((-1*b) - ((b*b) - (4*a*c)),(2*a));
        System.out.print(k+" "+s);
      
    }
 }
}
