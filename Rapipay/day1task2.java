import java.util.Scanner;
public class BasicSalary
{
    public static void main(String xyz[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Basic Salary :- ");
	    int salary=sc.nextInt();
	    float HRA=(float)(0.15*salary);
	    long DA=(long)(0.6*salary);
	
	    System.out.print("HRA on Basic Salary "+HRA+",DA on Basic Salary will be "+DA+" ");

	    double tax=1;

	    if(salary<500000)
        {
	        tax=(tax*0);
        }
	    else if(salary>=500001 && salary<=1000000)
        {
	        tax=(double)(salary*0.20);
        }
	    else 
	    {
            tax=(double)(salary*0.30);
        }
	    System.out.print("For Basic Salary "+salary+",Tax would be "+tax+" ");
    }
}