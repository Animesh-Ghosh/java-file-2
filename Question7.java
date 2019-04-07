// program to demonstrate use of synchronization

class Demo {
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

class MyThread1 extends Thread {
	Demo d;
	MyThread1 (Demo d) {
		this.d = d;
	}
	public void run () {
		d.print (5);
	}	
}

class MyThread2 extends Thread {
	Demo d;
	MyThread2 (Demo d) {
		this.d = d;
	}
	public void run () {
		d.print (10);
	}
}

class MyThread3 extends Thread {
	Demo d;
	MyThread3 (Demo d) {
		this.d = d;
	}
	public void run () {
		d.print (20);
	}
}

class Question7 {
	public static void main (String[] args) {
		Demo obj = new Demo ();
		MyThread1 obj1 = new MyThread1 (obj);
		MyThread2 obj2 = new MyThread2 (obj);
		MyThread3 obj3 = new MyThread3 (obj);
		obj1.start ();
		obj2.start ();
		obj3.start ();
	}
}