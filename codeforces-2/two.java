import java.util.*;
public class two {
      public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
        
            if(n%2==0)
            {
                System.out.println((n/2)+" "+(n/2));     
            }
            else{
                int r=0,s=0;
                int a=1, b=n-1,lcm=0,p=Integer.MAX_VALUE;
            while(a<=b)    
             {   lcm = (a > b) ? a : b;
               while(true)
                   {
                    if( lcm % a == 0 && lcm % b == 0 )
                          break;
                    ++lcm;
                    }
                        if(lcm<p)
                        {
                            r=a;
                            s=b;
                            p=lcm;
                        }
                    a++;
                    b--;
            }
            System.out.println(r+" "+s);
        }
        }
    
    }
}