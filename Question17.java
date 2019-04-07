import java.awt.*;
import java.applet.*;
import java.util.*;

// demonstrate BorderLayout with insets.

/* <applet code="Question17" width=400 height=200>
	</applet> */

public class Question17 extends Applet {
	public void init () {
		setBackground (Color.cyan);
		setLayout (new BorderLayout (10, 10));
		add (new Button ("TOP Button."), BorderLayout.NORTH);
		add (new Label ("BOTTOM Label."), BorderLayout.SOUTH);
		add (new Button ("RIGHT Button."), BorderLayout.EAST);
		add (new Button ("LEFT Button."), BorderLayout.WEST);
		String msg = "The opposite of love is not hate, it's indifference. \n " + 
		"The opposite of art is not ugliness, it's indifference. \n" + 
		"The opposite of faith is not heresy, it's indifference. \n" + 
		"And the opposite of life is not death, it's indifference. \n\n" + 
		"- Elie Wiesel";
		add (new TextArea (msg), BorderLayout.CENTER);
	}
	// add insets
	public Insets getInsets () {
		return new Insets (10, 10, 10, 10);
	}
}