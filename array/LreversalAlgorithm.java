import java.util.*;
public class LreversalAlgorithm
 {

    public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
           int N=sc.nextInt();
           int x=sc.nextInt();
           int a[]=new int[N];
           for(int i=0;i<N;i++)
           {
               int p=sc.nextInt();
               a[i]=p;
           }
           Solution o=new Solution();
           o.rotateArr(a,x,N);
        }		// your code goes here
	}
}
class Solution 
{
    static void rotateArr(int arr[],int d,int n)
    {
        int temp[]=new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++)
        {
            arr[n-d+i]=temp[i];
        }
        for (int i = 0; i < n; i++) 
        System.out.print(arr[i] + " "); 
      
    }

}





//2nd one is better     





// import java.io.*; 
  
// class LeftRotate { 
//     /* Function to left rotate arr[] of size n by d */
//     static void leftRotate(int arr[], int d) 
//     { 
  
//         if (d == 0) 
//             return; 
//         int n = arr.length; 
//         rvereseArray(arr, 0, d - 1); 
//         rvereseArray(arr, d, n - 1); 
//         rvereseArray(arr, 0, n - 1); 
//     } 
  
//     /*Function to reverse arr[] from index start to end*/
//     static void rvereseArray(int arr[], int start, int end) 
//     { 
//         int temp; 
//         while (start < end) { 
//             temp = arr[start]; 
//             arr[start] = arr[end]; 
//             arr[end] = temp; 
//             start++; 
//             end--; 
//         } 
//     } 
  
//     /*UTILITY FUNCTIONS*/
//     /* function to print an array */
//     static void printArray(int arr[]) 
//     { 
//         for (int i = 0; i < arr.length; i++) 
//             System.out.print(arr[i] + " "); 
//     } 
  
//     /* Driver program to test above functions */
//     public static void main(String[] args) 
//     { 
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
//         int n = arr.length; 
//         int d = 2; 
  
//         // in case the rotating factor is 
//         // greater than array length 
//         d = d % n; 
//         leftRotate(arr, d); // Rotate array by d 
//         printArray(arr); 
//     } 
// } 