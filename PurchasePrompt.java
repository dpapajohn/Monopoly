/**
 * @(#)PurchasePrompt.java
 *
 *
 * @author
 * @version 1.00 2012/11/17
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PurchasePrompt extends JFrame
{
	private Property myProperty;
	private String myResponse = "";
	private PurchasePropertyComponent myPPC;

    public PurchasePrompt(Property prop, Player p)
    {
    	super(p.getName());
    	myProperty = prop;
		setSize(250, 125);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setLocation(screenSize.width / 3, screenSize.height / 3);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		myPPC = new PurchasePropertyComponent(prop, this);
		add(myPPC);
    }

	public String getResponse()
	{
		return myPPC.getResponse();
	}
}