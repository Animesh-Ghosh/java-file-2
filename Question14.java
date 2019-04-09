import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// program to create an applet that implements MouseListener and MouseMotionListener

/* <applet code="Question14" width=300 height=100>
	</applet>
*/

public class Question14 extends Applet implements MouseListener, MouseMotionListener {
	String msg = "";
	int mouseX = 0, mouseY = 0;
	public void init () {
		setBackground (Color.cyan);
		addMouseListener (this);
		addMouseMotionListener (this);
	}
	public void mouseClicked (MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Clicked!";
		repaint ();
	}
	public void mouseEntered (MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Entered!";
		repaint ();
	}
	public void mouseExited (MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Exited!";
		repaint ();
	}
	public void mousePressed (MouseEvent me) {
		mouseX = me.getX ();
		mouseY = me.getY ();
		msg = "Down!";
		repaint ();
	}
	public void mouseReleased (MouseEvent me) {
		mouseX = me.getX ();
		mouseY = me.getY ();
		msg = "Up!";
		repaint ();
	}
	public void mouseDragged (MouseEvent me) {
		mouseX = me.getX ();
		mouseY = me.getY ();
		msg = "*";
		showStatus ("Dragging mouse at " + mouseX + ", " + mouseY);
		repaint ();
	}
	public void mouseMoved (MouseEvent me) {
		showStatus ("Moving mouse at " + me.getX () + ", " + me.getY ());
	}
	public void paint (Graphics g) {
		g.drawString (msg, mouseX, mouseY);
	}
}