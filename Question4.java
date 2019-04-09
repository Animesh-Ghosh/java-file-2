// program to display ID's of 5 different child threads spawned from main

class Demo extends Thread {
	public void run () {
		System.out.println ("Name is " + this.getName () + ".");
		System.out.println ("Thread ID: " + this.currentThread ().getId ());
		for (int i = 3; i > 0; i--)
			System.out.println (i);
	}
}

class Question4 {
	public static void main (String args[]) {
		for (int i = 0; i < 5; i++) {
			Demo obj = new Demo ();
			obj.start ();
		}
	}
}