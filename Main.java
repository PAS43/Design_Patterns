
public class Main 
{
	public static void main(String[] args)
	{
		CarFactory cf = new CarFactory();
		
		Car FordST = cf.getCar("Ford");
		FordST.model();
		
		Car Skyline = cf.getCar("Nissan");
		Skyline.model();
		
		Car M5 = cf.getCar("BMW");
		M5.model();
		
		
	}

}
