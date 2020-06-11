import java.util.*;
public class chefandicecream {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            Icecream obj=new Icecream();
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                int s=sc.nextInt();
                arr[i]=s;
            }
            if(obj.ice(n,arr))
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }

    
}
class Icecream
{
    public boolean ice(int n,int arr[])
    {
        
        int p=0,q=0;
      for(int i=0;i<n;i++)
          {
             if(arr[i]==5)
                  p++;

             if(arr[i]==10)
                {
                    if(p>0)
                    {
                        p--;
                        q++;
                    }
                else
                    return false;                    
            }
             if(arr[i]==15)
             {
                if(q>0)
                {
                  q--;  
                }
                else if(p>1)
                {
                 p=p-2;   
                }
                else
                    return false;
             }
            }
    return true;

      }
    
    }  
