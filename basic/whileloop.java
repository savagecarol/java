import java.util.*;
class whileloop
{
 public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no. ");
      int n=sc.nextInt();
      System.out.println("the table of the no. is ");
        int i=1;
      while(i<=10)
           {
     System.out.println(n*i);
        i++;
          }
    }
}