import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// program to implement any one of the 4 layout managers

/* <applet code="Question18" height="200" width="300">
	</applet> */

public class Question18 extends Applet implements ItemListener, ActionListener {
	CheckboxGroup OS;
	Checkbox Windows, Mac, Linux;
	List Browsers;
	String os, browsers, browsersMSG;
	public void init () {
		setLayout (new FlowLayout (FlowLayout.CENTER, 10, 15));
		os = "Current OS selection: ";
		browsers = "Current Browsers selection: ";
		browsersMSG = "";
		OS = new CheckboxGroup ();
		Windows = new Checkbox ("Windows 10", OS, true);
		Mac = new Checkbox ("Mac OS X", OS, false);
		Linux = new Checkbox ("Linux Mint 19.1", OS, false);
		Browsers = new List (2, true);
		Browsers.add ("Google Chrome");
		Browsers.add ("Mozilla Firefox");
		Browsers.add ("Microsoft Edge");
		Browsers.select (1);
		add (Windows);
		add (Mac);
		add (Linux);
		add (Browsers);
		Windows.addItemListener (this);
		Mac.addItemListener (this);
		Linux.addItemListener (this);
		Browsers.addActionListener (this);
	}
	public void itemStateChanged (ItemEvent ie) {
		repaint ();
	}
	public void actionPerformed (ActionEvent ae) {
		int[] indxs;
		browsers = "Current Browsers selection: ";
		browsersMSG = "";
		indxs = Browsers.getSelectedIndexes ();
		for (int i = 0; i < indxs.length; i++) 
			browsersMSG += Browsers.getItem (indxs[i]) + " ";
		repaint ();
	}
	public void paint (Graphics g) {
		os = "Current OS selection: " + OS.getSelectedCheckbox ().getLabel ();
		g.drawString (os, 6, 120);
		g.drawString (browsers, 6, 140);
		g.drawString (browsersMSG, 6, 155);
	}
}