
public class CarFactory 
{
	public Car getCar(String car)
	{
		if(car == null)
		{
			return null;
		}		
		if(car.equalsIgnoreCase("Ford"))
		{
			return new Ford();
		} else if(car.equalsIgnoreCase("BMW"))
		{
			return new BMW();
		}else if(car.equalsIgnoreCase("Nissan"))
		{
			return new Nissan();
		}
		
		return null;
	}
}
