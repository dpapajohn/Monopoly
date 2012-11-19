
public class LuxuryTax extends Location
{
	LuxuryTax()
	{
		this.myName = "Luxury Tax";
	}
	public String landedOn(Player p)
	{
		p.subtractCash(75);
		return p.getName() + "paid $75 in luxury taxes.";
	}
}
