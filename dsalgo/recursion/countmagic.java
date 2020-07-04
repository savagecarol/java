import java.util.*;
class CountMagic {
	public static void main (final String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(new Digital().digitalRoot(n));

        }
    }
}

class Digital {

int root(int n)
{
    if(n==0)
    return n;
return (n%10 + root(n/10));    
}


    public int digitalRoot(int n)
{
    while(true)
    {
    if((int)Math.floor(Math.log10(n) + 1) == 1)
        return n; 
    n= root(n);
    }
}
  



}
