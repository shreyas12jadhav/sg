package generalization;

public class GeneralizationStudy {

	public static void main(String[] args) 
	{
		SBI sbi= new SBI();
		BOI boi= new BOI();
		
		System.out.println(RBI.zeroBalance);
		
		sbi.withDraw();
		sbi.transfer();
		sbi.deposite();
		sbi.loan();
		sbi.yono();
		
		System.out.println("=======================");
		boi.withDraw();
		boi.transfer();
		boi.deposite();
		boi.loan();
		boi.starApp();

	}

}
