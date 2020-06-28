import  java.util.*;
public class two {
    public static void main(String a[])
    {      
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    Print obj=new Print();
    while(t-->0)
    {
             int n=sc.nextInt();
        obj.t(n);
        System.out.println(obj.t(n));
  }
    }
}
class Print 
      {
        public static int t(int n)
        {
            if(n<10)
            {
                return n;
            }
            return t(n/10)+ (n%10) ;
        }


    }
