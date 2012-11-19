
public class IncomeTax extends Location
{
	IncomeTax()
	{
		this.myName = "Income Tax";
	}
	public String landedOn(Player p)
	{
		int tenPercent = p.getCash() / 10;
		if(tenPercent < 200)
		{
			p.subtractCash(tenPercent);
			return p.getName() + " paid 10%, $" + tenPercent + " in Income Tax.";
		}
		else
		{
			p.subtractCash(200);
			return p.getName() + " paid $200 flat rate in Income Tax.";
		}
	}
}
