import java.util.*;
public class evenmatrix 
{
    public static void main(String args[])
    {    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0)
    {
      
        int n=sc.nextInt();
        Play obj=new Play();
        obj.player(n);
        t--;
      }
    }
  }

  class Play {
    public void player(int n)
{
  int k=1;
  int count=0;
  for(int i=1;i<=n*n;i++)
  {
    if( i%n==0)
    {
      System.out.print(k+" ");
      System.out.println();
      count++;
       k=k+n;
    }
  else if(count% 2==0 && (i%n)!=0)
  {
    
      System.out.print(k+" ");
      k++;
      }
      else if(count%2!=0 && (i%n)!=0)
      {
        System.out.print(k+" ");
        k--;
      }  
     
  }
  }
 }