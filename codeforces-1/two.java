import java.util.*;
public class two {
        public static void main(String args[])
{   Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {   
      int x=sc.nextInt();
      int count=0;
        while(x>1)
        {
            if(x%6==0)
                {
                    x=x/6;
                }
            else 
            {
                x=x*2;

            }
            count++;
                  
        }
        if(x==1)
            System.out.println(count);
        else
            System.out.println(-1);

      }
    }
}