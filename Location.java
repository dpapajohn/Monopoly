
public class Location
{
	String myName;
	
	Location()
	{
		myName = "";
	}
	
	public String toString()
	{
		String result = "Name: " + this.getName();
		return result;
	}
	
	public String getName()
	{
		return myName;
	}
	public void setName(String name)
	{
		myName = name;
	}
	
	public String landedOn(Player p)
	{
		return p.getName() + " Landed on space: '" + myName + "'.";
	}
}
