public class TaxCalulator
{
   public static void main(String xyz[])
   {
	   
	Scanner sc = new Scanner(System.in);
	   
	System.out.print("Enter Salary :- ");
	int salary = sc.nextInt();
    float tax = 1;
	int taxRate = 0;
	if(salary>1000000)
	{
		taxRate = 20;
		tax = (float)(salary * 0.20);
	}
	
	System.out.print("For Salary "+salary+", Tax would be @ "+taxRate+"% amount "+tax+"Rs.");
	
   }
}


// Enter Basic Salary 
// add HRA :- @15 of Basic
// add DA :- 60% of Basic 
// tax : below 500k :- 0%'
// 500,001 - 10,00,000 :- 20%
// 10                  := 30%
