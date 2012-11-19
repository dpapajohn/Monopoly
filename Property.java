import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

public class Property extends Location
{
	private Color myColor;
	private Player myOwner;
	private int myCost;
	private int myRent;
	private ArrayList<Property> mySeriesMates;
	
	Property()
	{
		myColor = Color.BLACK;
		myOwner = null;
		myCost = 0;
		myRent = 0;
		mySeriesMates = new ArrayList<Property>();
	}
	
	public void addSeriesMate(Property p)
	{
		mySeriesMates.add(p);
	}
	public boolean isMonopoly()
	{
		for(int i = 0; i < mySeriesMates.size(); i++)
		{
			if(mySeriesMates.get(i).getOwner() != myOwner)
				return false;
		}
		return true;
	}
	
	public int getCost()
	{
		return myCost;
	}
	public void setCost(int cost)
	{
		myCost = cost;
	}
	public int getRent()
	{
		return myRent;
	}
	public void setRent(int rent)
	{
		myRent = rent;
	}
	public Player getOwner()
	{
		return myOwner;
	}
	public void setOwner(Player p)
	{
		myOwner = p;
	}
	public Color getColor()
	{
		return myColor;
	}
	public void setColor(Color color)
	{
		myColor = color;
	}
	
	public String landedOn(Player p)
	{
		
		
		if(myOwner == null)
		{
			//someone doesnt own it. p has option to buy it.
			int response = 0;
			Scanner kb = new Scanner(System.in);
			while(response < 1 || response > 2)
			{
				System.out.println("Purchase " + myName + " for $" + myCost + "? Options:");
				System.out.println("\t1.) Yes, buy for $" + myCost + ".");
				System.out.println("\t2.) No.");
				response = kb.nextInt();
			}
			kb.close();
			if(response == 1)
			{
				p.subtractCash(myCost);
				p.addProperty(this);
				myOwner = p;
				return p.getName() + " purchased " + myName + ".";
			}
			else
			{
				return p.getName() + " did not purchase " + myName + ".";
			}
		}
		else
		{
			//someone owns it. p pays them.
			p.subtractCash(myRent);
			myOwner.addCash(myRent);
			return p.getName() + " paid " + myOwner.getName() + " $" + myRent
					+ " for rent on " + myName + ".";
		}
		
	}
}
