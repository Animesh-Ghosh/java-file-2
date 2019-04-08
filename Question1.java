// program to demonstrate checked or unchecked exception

class Question1 {
	public static void main (String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int a = 10, b = 0, c;
		try {
			System.out.print (arr[5]);
		}
		catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println ("Index out of bound.\n" + aioobe);
		}
		try {
			c = a / b;
		}
		catch (ArithmeticException ae) {
			System.out.println ("Division by Zero!\n" + ae);
			b = 1;
			c = a / b;
			System.out.println ("a = " + a + "\tb = " + b);
			System.out.println ("a / b = " + c);
		}
	}
}