import java.util.*;
class Union
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            arr1[i]=x;
        }
        for(int i=0;i<m;i++)
        {
            int y=sc.nextInt();
            arr2[i]=y;
        }
        ArrayList<Integer> v=new ArrayList<Integer>();
        Uni obj=new Uni();
        v= obj.findUnion(arr1, arr2, n, m);
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }

    }
}
}

class Uni {

public ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {


        ArrayList<Integer> k=new ArrayList<Integer>();
        int i=0,j=0;
        while( i<n  &&  j<m )
        {
             if( j>0 && arr2[j]==arr2[j-1] )
            {   
                System.out.println("a");
                j++;
                continue;
            }
            
            
            if( i>0 && arr1[i]==arr1[i-1])
                {
                    System.out.println("a");
                    i++;
                continue;
                }
                
    
            if(arr1[i]<arr2[j])
                k.add(arr1[i++]);
            else if(arr2[j]<arr1[i])
                k.add(arr2[j++]);
            else
            {
                k.add(arr2[j]);
                i++;
                j++;
            }
        }
        while(i<n)
        {
            if( i>0 && arr1[i]==arr1[i-1])
            {
                i++;
            continue;
            }
            else
            k.add(arr1[i++]);
        }
        while(j<m)
        {
            if( j>0 && arr2[j]==arr2[j-1] )
            {   
                j++;
                continue;
            }
            else
            k.add(arr2[j++]);
        }
        return k;    

        
    }
}






