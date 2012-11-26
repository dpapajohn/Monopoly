/**
 * @(#)PurchasePropertyComponent.java
 *
 *
 * @author
 * @version 1.00 2012/11/17
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PurchasePropertyComponent extends JComponent implements ActionListener
{
	public JButton yes, no;
	public String response = "";
	public JFrame myFrame;

    public PurchasePropertyComponent(Property p, JFrame f)
    {
		super();
		myFrame = f;

		JLabel propInfo = new JLabel(p.getName());
		yes = new JButton("Yes, purchase for $" + p.getCost());
		no = new JButton("No, don't purchase.");

		yes.addActionListener(this);
		no.addActionListener(this);

		setLayout(new FlowLayout());

		add(propInfo);
		add(yes);
		add(no);
    }

	public String getResponse()
	{
		return response;
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == yes)
		{
			response = "Yes";
		}
		else if(e.getSource() == no)
		{
			response = "No";
		}
		myFrame.dispose();
	}
}