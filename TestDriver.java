import java.awt.Color;
import java.util.Scanner;

public class TestDriver
{
	public static void addPlayers(Board b)
	{
		Player p1 = new Player();
		p1.setName("Daniel");
		
		Player p2 = new Player();
		p2.setName("Melvin");
		
		Player p3 = new Player();
		p3.setName("Kyle");

		Player p4 = new Player();
		p4.setName("Andrew");
		
		b.addPlayer(p1);
		b.addPlayer(p2);
		b.addPlayer(p3);
		b.addPlayer(p4);
	}
	
	public static void addLocations(Board b)
	{
		//special locations
		GoLocation l1 = new GoLocation();
		CommunityChest l2 = new CommunityChest();
		IncomeTax l3 = new IncomeTax();
		Chance l4 = new Chance();
		Location l5 = new Location();
		l5.setName("Just Visiting Jail");
		CommunityChest l6 = new CommunityChest();
		FreeParking l7 = new FreeParking();
		Chance l8 = new Chance(); 
		GoToJail l9 = new GoToJail();
		CommunityChest l10 = new CommunityChest();
		Chance l11 = new Chance();
		LuxuryTax l12 = new LuxuryTax();
		
		//properties
		Property prop1 = new Property();
		prop1.setName("Mediterranean Avenue");
		prop1.setColor(new Color(128, 0 , 128));
		prop1.setCost(60);
		prop1.setRent(2);
		
		Property prop2 = new Property();
		prop2.setName("Baltic Avenue");
		prop2.setColor(new Color(128, 0 , 128));
		prop2.setCost(60);
		prop2.setRent(4);
		
		prop1.addSeriesMate(prop2);
		prop2.addSeriesMate(prop1);
		
		Property prop3 = new Property();
		prop3.setName("Oriental Avenue");
		prop3.setColor(Color.CYAN);
		prop3.setCost(100);
		prop3.setRent(6);
		
		Property prop4 = new Property();
		prop4.setName("Vermont Avenue");
		prop4.setColor(Color.CYAN);
		prop4.setCost(100);
		prop4.setRent(6);
		
		Property prop5 = new Property();
		prop5.setName("Connecticut Avenue");
		prop5.setColor(Color.CYAN);
		prop5.setCost(120);
		prop5.setRent(8);
		
		prop3.addSeriesMate(prop4);
		prop3.addSeriesMate(prop5);
		prop4.addSeriesMate(prop3);
		prop4.addSeriesMate(prop5);
		prop5.addSeriesMate(prop3);
		prop5.addSeriesMate(prop4);
		
		Property prop6 = new Property();
		prop6.setName("St. Charles Place");
		prop6.setColor(Color.PINK);
		prop6.setCost(140);
		prop6.setRent(10);
		
		Property prop7 = new Property();
		prop7.setName("States Avenue");
		prop7.setColor(Color.PINK);
		prop7.setCost(140);
		prop7.setRent(10);
		
		Property prop8 = new Property();
		prop8.setName("Virginia Avenue");
		prop8.setColor(Color.PINK);
		prop8.setCost(160);
		prop8.setRent(12);
		
		prop6.addSeriesMate(prop7);
		prop6.addSeriesMate(prop8);
		prop7.addSeriesMate(prop6);
		prop7.addSeriesMate(prop8);
		prop8.addSeriesMate(prop6);
		prop8.addSeriesMate(prop7);
		
		Property prop9 = new Property();
		prop9.setName("St. James Place");
		prop9.setColor(Color.ORANGE);
		prop9.setCost(180);
		prop9.setRent(14);
		
		Property prop10 = new Property();
		prop10.setName("Tennessee Avenue");
		prop10.setColor(Color.ORANGE);
		prop10.setCost(180);
		prop10.setRent(14);
		
		Property prop11 = new Property();
		prop11.setName("New York Avenue");
		prop11.setColor(Color.ORANGE);
		prop11.setCost(200);
		prop11.setRent(16);
		
		prop9.addSeriesMate(prop10);
		prop9.addSeriesMate(prop11);
		prop10.addSeriesMate(prop9);
		prop10.addSeriesMate(prop11);
		prop11.addSeriesMate(prop9);
		prop11.addSeriesMate(prop10);
		
		Property prop12 = new Property();
		prop12.setName("Kentucky Avenue");
		prop12.setColor(Color.RED);
		prop12.setCost(220);
		prop12.setRent(18);
		
		Property prop13 = new Property();
		prop13.setName("Indiana Avenue");
		prop13.setColor(Color.RED);
		prop13.setCost(220);
		prop13.setRent(18);
		
		Property prop14 = new Property();
		prop14.setName("Illinois Avenue");
		prop14.setColor(Color.RED);
		prop14.setCost(240);
		prop14.setRent(20);
		
		prop12.addSeriesMate(prop13);
		prop12.addSeriesMate(prop14);
		prop13.addSeriesMate(prop12);
		prop13.addSeriesMate(prop14);
		prop14.addSeriesMate(prop12);
		prop14.addSeriesMate(prop13);
		
		Property prop15 = new Property();
		prop15.setName("Atlantic Avenue");
		prop15.setColor(Color.YELLOW);
		prop15.setCost(260);
		prop15.setRent(22);
		
		Property prop16 = new Property();
		prop16.setName("Ventnor Avenue");
		prop16.setColor(Color.YELLOW);
		prop16.setCost(260);
		prop16.setRent(22);
		
		Property prop17 = new Property();
		prop17.setName("Marvin Avenue");
		prop17.setColor(Color.YELLOW);
		prop17.setCost(280);
		prop17.setRent(24);
		
		prop15.addSeriesMate(prop16);
		prop15.addSeriesMate(prop17);
		prop16.addSeriesMate(prop15);
		prop16.addSeriesMate(prop17);
		prop17.addSeriesMate(prop15);
		prop17.addSeriesMate(prop16);
		
		Property prop18 = new Property();
		prop18.setName("Pacific Avenue");
		prop18.setColor(Color.GREEN);
		prop18.setCost(300);
		prop18.setRent(26);
		
		Property prop19 = new Property();
		prop19.setName("North Carolina Avenue");
		prop19.setColor(Color.GREEN);
		prop19.setCost(300);
		prop19.setRent(26);
		
		Property prop20 = new Property();
		prop20.setName("Pennsylvania Avenue");
		prop20.setColor(Color.GREEN);
		prop20.setCost(320);
		prop20.setRent(28);
		
		prop18.addSeriesMate(prop19);
		prop18.addSeriesMate(prop20);
		prop19.addSeriesMate(prop18);
		prop19.addSeriesMate(prop20);
		prop20.addSeriesMate(prop18);
		prop20.addSeriesMate(prop19);
		
		Property prop21 = new Property();
		prop21.setName("Park Place");
		prop21.setColor(Color.BLUE);
		prop21.setCost(350);
		prop21.setRent(35);
		
		Property prop22 = new Property();
		prop22.setName("Broadway");
		prop22.setColor(Color.BLUE);
		prop22.setCost(400);
		prop22.setRent(50);
		
		prop21.addSeriesMate(prop22);
		prop22.addSeriesMate(prop21);
		
		//railroads
		Railroad rail1 = new Railroad();
		rail1.setName("Reading Railroad");
		
		Railroad rail2 = new Railroad();
		rail2.setName("Pennsylvania Railroad");
		
		Railroad rail3 = new Railroad();
		rail3.setName("B.&O. Railroad");
		
		Railroad rail4 = new Railroad();
		rail4.setName("Short Line");
		
		rail1.addSeriesMate(rail2);
		rail1.addSeriesMate(rail3);
		rail1.addSeriesMate(rail4);
		rail2.addSeriesMate(rail1);
		rail2.addSeriesMate(rail3);
		rail2.addSeriesMate(rail4);
		rail3.addSeriesMate(rail1);
		rail3.addSeriesMate(rail2);
		rail3.addSeriesMate(rail4);
		rail4.addSeriesMate(rail1);
		rail4.addSeriesMate(rail2);
		rail4.addSeriesMate(rail3);
		
		//utilities
		Utility u1 = new Utility();
		u1.setName("Electric Company");
		
		Utility u2 = new Utility();
		u2.setName("Water Company");
		
		u1.addSeriesMate(u2);
		u2.addSeriesMate(u1);
		
		//add all of the locations to the board
		b.addLocation(l1);
		b.addLocation(prop1);
		b.addLocation(l2);
		b.addLocation(prop2);
		b.addLocation(l3);
		
		b.addLocation(rail1);
		b.addLocation(prop3);
		b.addLocation(l4);
		b.addLocation(prop4);
		b.addLocation(prop5);
		
		b.addLocation(l5);
		b.addLocation(prop6);
		b.addLocation(u1);
		b.addLocation(prop7);
		b.addLocation(prop8);
		
		b.addLocation(rail2);
		b.addLocation(prop9);
		b.addLocation(l6);
		b.addLocation(prop10);
		b.addLocation(prop11);
		
		b.addLocation(l7);
		b.addLocation(prop12);
		b.addLocation(l8);
		b.addLocation(prop13);
		b.addLocation(prop14);
		
		b.addLocation(rail3);
		b.addLocation(prop15);
		b.addLocation(prop16);
		b.addLocation(u2);
		b.addLocation(prop17);
		
		b.addLocation(l9);
		b.addLocation(prop18);
		b.addLocation(prop19);
		b.addLocation(l10);
		b.addLocation(prop20);
		
		b.addLocation(rail4);
		b.addLocation(l11);
		b.addLocation(prop21);
		b.addLocation(l12);
		b.addLocation(prop22);
	}
	
	public static void setupBoard(Board b)
	{
		addPlayers(b);
		addLocations(b);

		b.movePlayersToStart();
	}
	
	public static void movePlayer(Board b, Player current, int roll)
	{
		//move current player to new location based on roll
		int locIndex = b.getLocations().indexOf(current.getLocation());
		int newLocIndex = (locIndex + roll);
		if(newLocIndex >= b.getLocations().size())
		{
			//passed go
			System.out.println(current.getName() + " gets $200 for passing Go!");
			current.addCash(200);
		}
		newLocIndex %= b.getLocations().size();
		current.setLocation(b.getLocations().get(newLocIndex));
		
		//call location's landed on function
		String moveMessage = current.getLocation().landedOn(current);
		System.out.println(moveMessage);
		//check if they moved to "go to jail"
		if(moveMessage.equals("Go directly to jail. Do not pass go. Do not collect $200."))
		{
			current.setLocation(b.getGoToJailLocation());
			current.setJailedStatus(0);
		}
	}
	
	private static int roll(Board b, Player current)
	{
		int r1 = Dice.d6();
		int r2 = Dice.d6();
		System.out.println(current.getName() + " rolled a : " + (r1 + r2));
		//check for and deal with doubles
		if(r1 == r2)
		{
			if(current.getDoublesCount() == 2)
			{
				System.out.println(current.getName() + "Rolled a third double, and goes directly to jail.");
				current.setLocation(b.getLocations().get(10));
				current.setJailedStatus(0);
				current.setDoublesCount(0);
			}
			else 
			{
				current.incrementDoublesCount();
				System.out.println(current.getName() + "has rolled " +
						current.getDoublesCount() + " doubles. Watch out!");
			}
		}
		return r1 + r2;
	}
	
	private static void inJail(Board b, Player current)
	{
		Scanner kb = new Scanner(System.in);
		
		boolean hasGOOJF = false;
		if(current.getJailbreaks() > 0)
			hasGOOJF = true;
		int response = 0;
		while(response < 1 || (hasGOOJF == false && response > 2) || (hasGOOJF == true && response > 3))
		{
			System.out.println(current.getName() + "is in jail. Options:");
			System.out.println("\t1.) Pay $50");
			System.out.println("\t2.) Roll for doubles");
			if(hasGOOJF == true)
			{
				System.out.println("\t3.) Use Get out of jail free card.");
			}
			response = kb.nextInt();
		}
		if(response == 1)
		{
			//pay $50
			current.subtractCash(50);
			current.setJailedStatus(-1);
		}
		else if(response == 2)
		{
			//roll
			int r1 = Dice.d6();
			int r2 = Dice.d6();
			if(r1 == r2)
			{
				//doubles, get out of jail and move using double roll.
				current.setDoublesCount(1);
				movePlayer(b, current, r1 + r2);
			}
		}
		else
		{
			//GOOJF card
			current.decrementJailbreaks();
			current.setJailedStatus(-1);
		}
		kb.close();
	}

	public static void takeTurn(Board b)
	{		
		//get the current player whose turn it is.
		Player current = b.getPlayers().get(b.getCurrentPlayerNumber());
		
		System.out.println("\n~" + current.getName().toUpperCase() + "'s TURN~\n" + current);
		
		int roll;		
		
		if(current.getJailedStatus() == -1)
		{
			//not in jail
			roll = roll(b, current);
			movePlayer(b, current, roll);
		}
		else if(current.getJailedStatus() > 2)
		{
			//if player has been waiting in jail 3 turns, set him free and move.
			current.setJailedStatus(-1);
			roll = roll(b, current);
			movePlayer(b, current, roll);
		}
		else
		{
			//in jail
			inJail(b, current);
		}
		
		
		//move counter to next player
		if(b.getCurrentPlayerNumber() == b.getPlayers().size() - 1)
		{
			b.setCurrentPlayerNumber(0);
		}
		else
		{
			b.incrementCurrentPlayerNumber();
		}
	}
	
	public static void main(String[] args)
	{
		Board b = new Board();
				
		setupBoard(b);
		
		System.out.println("~LOCATIONS~");
		b.printLocations();
		
		b.movePlayersToStart();		
		
		System.out.println("~PLAYERS~");
		b.printPlayers();
		
		while(1 == 1)
		{
			takeTurn(b);
			takeTurn(b);
			takeTurn(b);
			takeTurn(b);
			System.out.println("\n~PLAYERS~");
			b.printPlayers();
		}
	}

}
