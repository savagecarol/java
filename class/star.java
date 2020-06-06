import java.util.*;
class star
{
public static void main(String a[])
{
int x,i,j;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
    for(i=1;i<=x;i++)
 {
     for(j=1;j<=x;j++) 
        {                 
       if(i+j>x)
                {
              System.out.print("*");
                }
    else
           {
    System.out.print(" ");
       } 
    }
       System.out.println();
  }

}
}
