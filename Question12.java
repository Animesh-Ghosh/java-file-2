import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// program to create an applet to demonstrate check-box, choice list and push button control

/* <applet code="">
	</applet> */

public class Question12 extends Applet implements ItemListener, ActionListener {
	Checkbox cb1, cb2, cb3;
	Choice c1, c2, c3;
	Button b1, b2, b3;
	public void init () {
		cb1.addItemListener (this);
		cb2.addItemListener (this);
		cb2.addItemListener (this);
		c1.addItemListener (this);
		c2.addItemListener (this);
		c3.addItemListener (this);
	}
	public void itemStateChanged (ItemEvent ie) {
		repaint ();
	}
	public void actionPerformed (ActionEvent ae) {
		String button = ae.getActionCommand ();
		repaint ();
	}
	public void paint (Graphics g) {

	}
}