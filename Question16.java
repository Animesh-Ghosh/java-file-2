import java.applet.*;
import java.awt.event.*;
import java.awt.*;

// applet that demonstrates working of 3 scrollbars(RGB) to change background color

/* <applet code="Question16" height=200 width=300>
	</applet> */

public class Question16 extends Applet implements AdjustmentListener {
	Scrollbar r, g, b;
	Panel p = new Panel ();
	public void init () {
		r = new Scrollbar (Scrollbar.HORIZONTAL, 0, 20, 0, 275);
		g = new Scrollbar (Scrollbar.HORIZONTAL, 0, 20, 0, 275);
		b = new Scrollbar (Scrollbar.HORIZONTAL, 0, 20, 0, 275);
		p.setLayout (new GridLayout (3, 1, 10, 10));
		setLayout (new BorderLayout ());
		p.add (r);
		p.add (g);
		p.add (b);
		add (p, "South");
		r.addAdjustmentListener (this);
		g.addAdjustmentListener (this);
		b.addAdjustmentListener (this);
	}
	public void adjustmentValueChanged (AdjustmentEvent e) {
		int R, G, B;
		R = r.getValue ();
		G = g.getValue ();
		B = b.getValue ();
		showStatus ("Color is R = " + R + " G = " + G + " B = " + B);
		setBackground (new Color (R, G, B));
	}
}