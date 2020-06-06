import java.util.*;
class test
{
int x=10,y=20;
int sum(int x,int y)//we can made this method by static also
{

return x+y;
}

public static void main(String a[])
{
/*

printing hello your name
System.oyt.println("hello "+a[]);

*/

/*

add two no. by command line argument
int x=Integer.parseInt(a[0]);
int y=Integer.parseInt(a[1]);
int z=x+y;
System.out.println(z);

*/
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
int q=sc.nextInt();
test t=new test();
int z=t.sum(p,q);
System.out.println("sum is "+z);

}
}