import java.util.*;
public class three
 {

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
        int n=sc.nextInt();        
        for(int i=1;i<=64;i++)
        {   if(i==1)
            System.out.print("O");
           else if(n>1)
           {  
                System.out.print(".");
                 n--;
                }
             else 
             System.out.print("X");
            if(i%8==0)
               System.out.println();
        }
        
    }

}   

}