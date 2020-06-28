import java.util.*;

class search
   {
public static void main(String args[])
   {
       int n,i,t=0,temp;
      Scanner sc=new Scanner(System.in);
    
      System.out.println("Enter the no.");
      n=sc.nextInt();


      System.out.println("Enter the element you want to search");
      temp=sc.next();

      for(i=0;i<n;i++)
         {
          a[i]=sc.next();
          if(a[i]==temp)
              {
                  temp=1;
             }           
        }
                    if(temp==1)
                        {
      System.out.println("present in list");
                        }
                     else
                        {                       
      System.out.println("Enter the element you want to search");
                       }
  }
}
   
