import java.util.*;

class one
{public static void main(String a[])
    {      
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
        Print obj=new Print();
        int n;
        n=sc.nextInt();
        obj.t(n);
        System.out.println();
    }
    }
}

class Print
        {
            public void t(int n)
            {
                if(n<1)
                    return ;
                t(n-1);
                System.out.println(n);
            }
        }