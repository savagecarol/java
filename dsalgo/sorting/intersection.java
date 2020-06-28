import java.util.*;
class Intersection
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
        Intersect obj=new Intersect();
        v=obj.printIntersection(arr1,arr2,n,m);
        for(int i=0;i<v.size();i++)
            {
                System.out.print(v.get(i)+" ");
            }

        }
    }
}




class Intersect
{
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    {
        
        ArrayList<Integer> k=new ArrayList<Integer>();
        int i=0;
        int j=0;
        while( i<n && j<m )
        {
            if( i>0 && arr1[i-1]==arr1[i])
            {
                i++;
                continue;
            }
         if (arr1[i] < arr2[j]) 
              i++; 
            else if (arr2[j] < arr1[i]) 
            j++; 
            else 
            { 
                k.add(arr1[i]);
                j++;
             i++; 
            } 
        
        }
        if(k.size()==0)
        {
            k.add(-1);
            return k;
        }

        return k;
    }

}
