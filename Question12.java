import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// program to create an applet to demonstrate check-box, choice list and push button control

/* <applet code="Question12" height="200" width="300">
	</applet> */

public class Question12 extends Applet implements ItemListener, ActionListener {
	Checkbox Windows, Mac, Linux;
	Choice Browsers;
	Button Yes, No, Maybe;
	String os, winMSG, macMSG, linxMSG, browser, browserMSG, msg;
	public void init () {
		os = "Current OS selection: ";
		browser = "Current Browser selection: ";
		msg = "No button pressed yet!";
		winMSG = "Windows: ";
		macMSG = "Mac: ";
		linxMSG = "Linux: ";
		browserMSG = "";
		Windows = new Checkbox ("Windows 10", true);
		Mac = new Checkbox ("Mac OS X");
		Linux = new Checkbox ("Linux Mint 19.1");
		Browsers = new Choice ();
		Browsers.add ("Google Chrome");
		Browsers.add ("Mozilla Firefox");
		Browsers.add ("Microsoft Edge");
		Browsers.select ("Mozilla Firefox");
		Yes = new Button ("Yes");
		No = new Button ("No");
		Maybe = new Button ("Maybe");
		add (Windows);
		add (Mac);
		add (Linux);
		add (Browsers);
		add (Yes);
		add (No);
		add (Maybe);
		Windows.addItemListener (this);
		Mac.addItemListener (this);
		Linux.addItemListener (this);
		Browsers.addItemListener (this);
		Yes.addActionListener (this);
		No.addActionListener (this);
		Maybe.addActionListener (this);
	}
	public void itemStateChanged (ItemEvent ie) {
		repaint ();
	}
	public void actionPerformed (ActionEvent ae) {
		String button = ae.getActionCommand ();
		if (button.equals ("Yes")) msg = "Yes Pressed!";
		else if (button.equals ("No")) msg = "No Pressed!";
		else if (button.equals ("Maybe")) msg = "Maybe Pressed!";
		repaint ();
	}
	public void paint (Graphics g) {
		winMSG = "Windows: " + Windows.getState ();
		macMSG = "Mac: " + Mac.getState ();
		linxMSG = "Linux: " + Linux.getState ();
		browserMSG = Browsers.getSelectedItem ();
		g.drawString (os, 6, 85);
		g.drawString (winMSG, 6, 100);
		g.drawString (macMSG, 6, 115);
		g.drawString (linxMSG, 6, 130);
		g.drawString (browser, 6, 155);
		g.drawString (browserMSG, 6, 170);
		g.drawString (msg, 6, 190);
	}
}