import java.util.*;
 class five {
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                a[i]=x;
            }
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                b[i]=x;
            }
        }
     }
}