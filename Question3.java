//  program to demonstrate creation of multiple child threads.

class A extends Thread {
	public void run () {
		try {
			for(int i = 1; i <= 5; i++) {
				System.out.println ("Running thread 1! " + i);
				Thread.sleep (500);
			}
		}
		catch (InterruptedException e) {
			System.out.println ("Thread interrupted!");
		}
	}
}

class B extends Thread {
	public void run () {
		try {
			for(int j = 1; j <= 4; j++) {
				System.out.println ("Running thread 2! " + j);
				Thread.sleep (500);
			}
		}
		catch (InterruptedException ie) {
			System.out.println ("Thread interrupted!");
		}
	}
}

class C extends Thread {
	public void run () {
		for(int k = 1; k <= 5; k++) {
			System.out.println ("Running thread 3! " + k);
		}
	}
}

class Question3 {
	public static void main (String[] args) {
	 	A obj1 = new A ();
	 	B obj2 = new B ();
	 	C obj3 = new C ();
	 	obj1.start ();
	 	obj2.start ();
	 	obj3.start ();	
	}
}