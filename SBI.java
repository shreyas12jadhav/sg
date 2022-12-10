package generalization;

public class SBI implements RBI
{

	@Override
	public void deposite() 
	{
		System.out.println("SBI's deposite system");
		
	}

	@Override
	public void withDraw() 
	{
		
		System.out.println("SBI's withDraw system");

	}

	@Override
	public void loan() 
	{

		System.out.println("SBI's Loan system");

	}

	@Override
	public void transfer()
	{
		System.out.println("SBI's tranasfer system");

	} 
	public void yono()
	{
	System.out.println("SBI own facility YONO");
	}

	
}
