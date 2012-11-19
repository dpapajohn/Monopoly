
public class FreeParking extends Location
{
	public static int myCash = 0;
	
	FreeParking()
	{
		this.myName = "Free Parking";
	}
	public String landedOn(Player p)
	{
		String message = p.getName() + " landed on free parking, gets $" + myCash;
		
		p.addCash(myCash);
		myCash = 0;
		
		return message;
	}
}
