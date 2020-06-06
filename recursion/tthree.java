import java.util.*;
public class tthree {
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TOH t=new TOH();
        t.towerofhanoi(n,'A','B','C');
    }
    
}
class TOH
{
    public static void towerofhanoi(int n,char A,char B,char C)
    {
        if(n==1)
        {
            System.out.println("move " + n +" from "+A +" -> "+ C);
            return ;
        }
        towerofhanoi(n-1,A,C,B);
        System.out.println("move " + n +" from "+A+ " -> "+ C);
        towerofhanoi(n-1, B, A, C);
        
    }
}