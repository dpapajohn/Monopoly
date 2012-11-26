/**
 * @(#)JailPromptComponent.java
 *
 *
 * @author
 * @version 1.00 2012/11/17
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JailPromptComponent extends JComponent implements ActionListener
{
	public JButton pay, roll, goojf;
	public String response = "";
	public JFrame myFrame;

    public JailPromptComponent(Player p, JFrame f)
    {
    	super();
    	myFrame = f;

		JLabel description = new JLabel(p.getName() + " in jail. What to do?");
		pay = new JButton("Pay $50 Bail");
		roll = new JButton("Roll for Doubles");
		goojf = new JButton("Use Get out of Jail Free");

		pay.addActionListener(this);
		roll.addActionListener(this);
		goojf.addActionListener(this);

		setLayout(new FlowLayout());

		add(description);
		add(pay);
		add(roll);
		if(p.getJailbreaks() >= 1)
		{
			add(goojf);
		}
    }

	public String getResponse()
	{
		return response;
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == pay)
		{
			response = "pay";
		}
		else if(e.getSource() == roll)
		{
			response = "roll";
		}
		else if(e.getSource() == goojf)
		{
			response = "goojf";
		}
		myFrame.dispose();
	}
}