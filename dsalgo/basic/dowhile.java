import java.util.*;
class forloop
{
 public static void main(String args[])
    {
     do
        {
 Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no. ");
      int n=sc.nextInt();
        int i;
       for(i=1;i<=10;i++)
             {
                System.out.println(n*i);      
            }
    System.out.println("type y to print new table");
   char ch=sc.next();
     }
     while(ch.equal("y"));
    }
}