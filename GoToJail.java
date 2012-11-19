
public class GoToJail extends Location
{
	GoToJail()
	{
		this.myName = "Go To Jail";
	}
	public String landedOn(Player p)
	{
		return "Go directly to jail. Do not pass go. Do not collect $200.";
	}
}
