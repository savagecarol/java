import java.util.*;
public class chefandstring {
public static void main(final String a[]) {
    final Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    final hy s = new hy();
    while (t > 0) {
        String str = sc.next();
        System.out.println(s.counter(str));
        t--;
    }
}

}

class hy {
    public int counter(String str)
    { int n=str.length();
      int count=0;
        for(int i=0;i< n-1 ; i++)
        {
        if( (str.charAt(i)=='x' && str.charAt(i+1)=='y') || (str.charAt(i)=='y' && str.charAt(i+1)=='x'))
            {
                count++;
                i=i+1;
            };
        }
        return count;
    }
}