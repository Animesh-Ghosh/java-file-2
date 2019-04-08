// program to demonstrate application of isAlive() or join() method

class Count extends Thread {
	Count () {
		super ("My thread");
		System.out.println (this);
		start ();
	}
	public void run () {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println (i);
				Thread.sleep (1000);
			}
		}
		catch (InterruptedException ie) {
			System.out.println ("Thread interrupted!");
		}
		System.out.println ("My thread run() is over!");
	}
}

class Question5 {
	public static void main (String[] args) {
		Count obj = new Count ();
		try {
			while (obj.isAlive ()) {
				System.out.println ("Main thread alive till child thread is alive.");
				Thread.sleep (1500);
			}
		}
		catch (InterruptedException ie) {
			System.out.println ("Main thread Interrupted!.");
		}
		System.out.println ("Main thread run() is over.");
	}
}