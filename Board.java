import java.util.ArrayList;


public class Board 
{
	private ArrayList<Player> myPlayers;
	private ArrayList<Location> myLocations;
	private int myCurrentPlayerNumber;
	
	Board()
	{
		myCurrentPlayerNumber = 0;
		myPlayers = new ArrayList<Player>();
		myLocations = new ArrayList<Location>();
	}
	
	public Location getGoToJailLocation()
	{
		for(int i = 0; i < myLocations.size(); i++)
		{
			if(myLocations.get(i) instanceof GoToJail)
				return myLocations.get(i);
		}
		return null;
	}
	
	public void incrementCurrentPlayerNumber()
	{
		myCurrentPlayerNumber++;
	}
	public int getCurrentPlayerNumber()
	{
		return myCurrentPlayerNumber;
	}
	public void setCurrentPlayerNumber(int num)
	{
		myCurrentPlayerNumber = num;
	}
	
	public ArrayList<Player> getPlayers()
	{
		return myPlayers;
	}
	public void setPlayers(ArrayList<Player> players)
	{
		myPlayers = players;
	}
	public ArrayList<Location> getLocations()
	{
		return myLocations;
	}
	public void setLocations(ArrayList<Location> locations)
	{
		myLocations = locations;
	}
	
	public void addLocation(Location loc)
	{
		myLocations.add(loc);
	}
	public void printLocations()
	{
		for(int i = 0; i < myLocations.size(); i++)
		{
			System.out.println(myLocations.get(i));
		}
	}
	public void addPlayer(Player p)
	{
		myPlayers.add(p);
	}
	public void printPlayers()
	{
		for(int i = 0; i < myPlayers.size(); i++)
		{
			System.out.println(myPlayers.get(i));
		}
	}
	public void movePlayersToStart()
	{
		for(int i = 0; i < myPlayers.size(); i++)
		{
			myPlayers.get(i).setLocation(myLocations.get(0));
		}
	}
}
