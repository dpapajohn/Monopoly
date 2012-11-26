/**
 * @(#)JailPrompt.java
 *
 *
 * @author
 * @version 1.00 2012/11/17
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JailPrompt extends JFrame
{
	private String myResponse = "";
	private JailPromptComponent myJPC;

    public JailPrompt(Player p)
    {
    	super(p.getName());
		setSize(250, 150);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setLocation(screenSize.width / 3, screenSize.height / 3);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		myJPC = new JailPromptComponent(p, this);
		add(myJPC);
    }

	public String getResponse()
	{
		return myJPC.getResponse();
	}
}