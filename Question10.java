import java.io.*;

/* program to copy an existing text file into a newly created file */

class CharStreamDemo {
	CharStreamDemo () {
		FileReader source = null;
		FileWriter target = null;
		int k;
		String msg = " Target file!";
		try {
			source = new FileReader ("File/Test1.txt");
			target = new FileWriter ("File/Test1_target.txt");
			System.out.println ("Using CharStream to copy file...");
			while ((k = source.read ()) != -1) {
				System.out.print ((char) k);
				target.write (k);
			}
			target.write (msg);
		}
		catch (IOException ioe) {
			System.out.println ("I/O Exception!\n" + ioe);
		}
		finally {
			try {
				target.close ();
			}
			catch (IOException ioe) {
				System.out.println ("I/O Exception!\n" + ioe);
			}
		}
	}
}

class ByteStreamDemo {
	ByteStreamDemo () {
		FileInputStream source = null;
		FileOutputStream target = null;
		int k;
		String msg = " Target file!";
		try {
			source = new FileInputStream ("File/Test2.txt");
			target = new FileOutputStream ("File/Test2_target.txt");
			System.out.println ("\nUsing ByteStream to copy file...");
			while ((k = source.read ()) != -1) {
				System.out.print ((char) k);
				target.write (k);
			}
			target.write (msg.getBytes ());
		}
		catch (IOException ioe) {
			System.out.println ("I/O Exception!\n" + ioe);
		}
		finally {
			try {
				target.close ();
			}
			catch (IOException ioe) {
				System.out.println ("I/O Exception!\n" + ioe);
			}
		}
	}
}

class Question10 {
	public static void main(String[] args) {
		CharStreamDemo charStreamObj = new CharStreamDemo ();
		ByteStreamDemo byteStreamObj = new ByteStreamDemo ();
	}
}