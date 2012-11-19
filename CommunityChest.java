
public class CommunityChest extends Location
{
	CommunityChest()
	{
		this.myName = "Community Chest";
	}
	public String landedOn(Player p)
	{
		//draw a card, so far only get out of jail frees exist. We'll add more.
		p.inctrementJailbreaks();
		return p.getName() + " drew a Get Out of Jail Free card from the Community Chest.";
	}
}
