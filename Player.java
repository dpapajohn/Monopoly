import java.util.ArrayList;

public class Player
{
	private ArrayList<Property> myProperties;
	private int myCash;
	private String myName;
	private Location myLocation;
	private int myJailbreaks;
	private int myJailedStatus;
	private int myDoublesCount;
	
	Player()
	{
		myCash = 1500;
		myProperties = new ArrayList<Property>();
		myName = "";
		myLocation = null;
		myJailbreaks = 0;
		myJailedStatus = -1;
		myDoublesCount = 0;
	}
	
	public ArrayList<Property> getProperties()
	{
		return myProperties;
	}
	public void setProperties(ArrayList<Property> properties)
	{
		myProperties = properties;
	}
	public void addProperty(Property property)
	{
		myProperties.add(property);
	}
	
	public void incrementDoublesCount()
	{
		myDoublesCount++;
	}
	public int getDoublesCount()
	{
		return myDoublesCount;
	}
	public void setDoublesCount(int doubles)
	{
		myDoublesCount = doubles;
	}
	public void setJailedStatus(int jailed)
	{
		myJailedStatus = jailed;
	}
	public int getJailedStatus()
	{
		return myJailedStatus;
	}
	
	public void setJailbreaks(int jailbreaks)
	{
		myJailbreaks = jailbreaks;
	}
	public int getJailbreaks()
	{
		return myJailbreaks;
	}
	public void inctrementJailbreaks()
	{
		myJailbreaks++;
	}
	public void decrementJailbreaks()
	{
		myJailbreaks--;
	}
	
	public String toString()
	{
		String result = "Name: " + myName + ";\n\tCash: " + myCash + "; Properties: "
				+ myProperties.size() + ";\n\tLocation: " + myLocation.getName() + "; Jailbreaks: " + myJailbreaks + ";";
		return result;
	}
	
	public void addCash(int cash)
	{
		myCash += cash;
	}
	public void subtractCash(int cash)
	{
		myCash -= cash;
	}
	
	public Location getLocation()
	{
		return myLocation;
	}
	public void setLocation(Location location)
	{
		myLocation = location;
	}
	
	public String getName()
	{
		return myName;
	}
	public void setName(String name)
	{
		myName = name;
	}
	public int getCash()
	{
		return myCash;
	}
	public void setCash(int cash)
	{
		myCash = cash;
	}
}
