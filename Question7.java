// program to demonstrate the use of synchronization by spawning 3 different threads

class syncDemo {
	synchronized void print (int n) {
		for (int i = 1; i <= 3; i++) {
			System.out.println (n + " x " + i + " = " + (n * i));
			try {
				Thread.sleep (500);
			}
			catch (Exception e) {
				System.out.println (e);
			}		
		}
	}
}

class syncThread1 extends Thread {
	syncDemo d;
	syncThread1 (syncDemo d) {
		this.d = d;
	}
	public void run () {
		d.print (5);
	}	
}

class syncThread2 extends Thread {
	syncDemo d;
	syncThread2 (syncDemo d) {
		this.d = d;
	}
	public void run () {
		d.print (10);
	}
}

class syncThread3 extends Thread {
	syncDemo d;
	syncThread3 (syncDemo d) {
		this.d = d;
	}
	public void run () {
		d.print (20);
	}
}

class Question7 {
	public static void main (String[] args) {
		syncDemo obj = new syncDemo ();
		syncThread1 obj1 = new syncThread1 (obj);
		syncThread2 obj2 = new syncThread2 (obj);
		syncThread3 obj3 = new syncThread3 (obj);
		obj1.start ();
		obj2.start ();
		obj3.start ();
	}
}