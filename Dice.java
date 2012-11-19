
public class Dice
{
	public static int d6()
	{
		return (int)(Math.random() * 1000) % 5 + 1;
	}
}
