import java.util.*;
class sorting
{
 public static void main(String args[])
    {
   int a[]={23,45,12,47,12,32};
   Scanner sc=new Scanner(System.in);

  system.out.println("\nsorted array is");
       for(int i=1;i<n;i++)
          {
            for( int j=i;j<n-i-1;j++)
               {
                     if(a[j]>a[j+1])
                           {
                               int temp=a[j];
                              a[j] =a[j+1];
                              a[j+1]=temp;
                            }
              }
        }
           for(i=0;i<n;i++)
               {
                 system.out.print(a[i]);
              }
   }
}