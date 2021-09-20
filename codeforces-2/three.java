import java.util.*;
public class three {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                arr[i]=x;
            }
            int count=0;
            for(int i=n-1;i>0;i--)
            {
                if(arr[i]<arr[i-1])    
                count++;
            }
            System.out.println(count);
		}	
        }
    }
