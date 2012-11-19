
public class GoLocation extends Location
{
	GoLocation()
	{
		this.myName = "Go";
	}
	public String landedOn(Player p)
	{
		//$200 cash bonus for landing directly on the Go space
		p.addCash(200);
		return p.getName() + " gets $200 for landing on Go!";
	}
}
