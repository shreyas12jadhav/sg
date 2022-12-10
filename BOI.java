package generalization;

public class BOI implements RBI
{

	@Override
	public void deposite() 
	{
		System.out.println("BOI's deposite system");
		
	}

	@Override
	public void withDraw() 
	{
		System.out.println("BOI's withDraw system");
		
	}

	@Override
	public void loan() 
	{
		
		System.out.println("BOI's loan system");
	}

	@Override
	public void transfer() 
	{
		System.out.println("BOI's transfer system");
		
	}
	public void starApp()
	{
	System.out.println("BOI's star system");
	}
}
