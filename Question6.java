// program to spawn 3 childs threads with different priorities

class threadPriority extends Thread {
	threadPriority (String str) {
		super (str);
	}
	public void run () {
		System.out.println ("Running thread name is " + this.getName ());
		System.out.println ("Running thread priority is " + this.getPriority ());
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println ("Thread " + this.getName () + ": " + i);
				Thread.sleep (500);
			}
		}
		catch (InterruptedException ie) {
			System.out.println (this.getName () + " interrupted!");
		}
	}
}

class Question6 {
	public static void main(String[] args) {
		threadPriority t1 = new threadPriority ("A");
		threadPriority t2 = new threadPriority ("B");
		threadPriority t3 = new threadPriority ("C");
		t1.setPriority (Thread.MIN_PRIORITY);
		t2.setPriority (Thread.NORM_PRIORITY);
		t3.setPriority (Thread.MAX_PRIORITY);
		t1.start ();
		t2.start ();
		t3.start ();
	}
}