import java.util.*;
class employee
{
int id=10;
public static void main(String a[])
{
   
Scanner sc=new Scanner(System.in);
    employee e1=new employee();
     employee e2=new employee();
    e1.id=sc.nextInt();
  e2.id=sc.nextInt();
    if(e1.id>e2.id)
       System.out.println("id of first employee "e1.id);
  else
    System.out.println("id of second employee "e2.id);
     
     
 }
}

/*
java

what r the diiference between argument and parameters
*/