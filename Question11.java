import java.awt.*;
import java.applet.*;

// program to create an applet to display a moving banner

/* <applet code="Question11" width=300 height=50>
	</applet> */

public class Question11 extends Applet implements Runnable {
	String msg = " A Simple Moving Banner.";
	Thread t = null;
	int state; 
	Font f1;
	boolean stopFlag;
	public void init () {
		f1 = new Font ("Arial", Font.BOLD, 20);
		setBackground (Color.cyan);
	}
	public void start () {
		t = new Thread (this);
		stopFlag = false;
		t.start();
	}
	public void run () {
		char ch;
		for( ; ; ) {
			try {
				repaint ();
				Thread.sleep (250);
				ch = msg.charAt (0);
				msg = msg.substring (1, msg.length ());
				msg += ch;
				if (stopFlag) break;
			} 
			catch(InterruptedException e) {}
		}
	}
	public void stop () {
		stopFlag = true;
		t = null;
	}
	public void paint (Graphics g) {
		g.setFont (f1);
		g.drawString (msg, 50, 30);
	}
}