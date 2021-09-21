import java.util.Scanner;
class Day1  
{    
public static void main(String args[])   
{    
Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter Number of rows:");
    int Rows=sc.nextInt();
    int i, j;       
    for (i=0; i<2*Rows-1; i++)   
        {  
            if(i%2==1) continue;
                for (j=2*Rows-1-i; j>1; j--)   
                    {  
                        System.out.print(" ");   
                    }   
            for (j=0; j<=i; j++ )   
                    {   
                        System.out.print("* ");   
                    }   
            System.out.println();   
        }   
    }   
}