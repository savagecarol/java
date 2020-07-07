import java.util.*;

import javax.lang.model.util.ElementScanner6;
class six
 {
     public static void main(String a[])
     {
         Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         while(t-->0)
        {
            int n=sc.nextInt();
            long m=sc.nextLong();
            long arr[]=new long[n];
            for(int i=0;i<n;i++)
            {long x=sc.nextLong();arr[i]=x;}
            Arrays.sort(arr);
            long count=0;int k=0;
            for(int i=0;i<n;i++)
            {   
            if(m<arr[i])
             {
                 k=1;
             while(m<=arr[i])
                    {
                    m=m*2;
                    count++;
                    }
            m=arr[i];
            }
             else if((m>arr[i]) && k<1)
                    count++;

            else
                 {
                        count=count+1;
                        m=2*arr[i];
                 }
            }
         

            System.out.println(count);     
        }
     }
}