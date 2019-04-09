import java.io.*;

/* program to take input from keyboard and write into a file using character stream 
	and byte stream */

class CharStreamWriteDemo {
	CharStreamWriteDemo () {
		FileWriter target = null;
		BufferedReader br = null;
		char c;
		try {
			target = new FileWriter ("File/Test1.txt");
			br = new BufferedReader (new InputStreamReader (System.in));
			System.out.println ("Using CharStream to write into file...");
			System.out.println ("Enter characters, '|' to stop reading keyboard: ");
			while (true) {
				c = (char) br.read ();
				if (c == '|') break;
				target.write ((int) c);
			}
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

class ByteStreamWriteDemo {
	ByteStreamWriteDemo () {
		FileOutputStream target = null;
		BufferedReader br = null;
		char c;
		try {
			target = new FileOutputStream ("File/Test2.txt");
			br = new BufferedReader (new InputStreamReader (System.in));
			System.out.println ("Using ByteStream to write into file...");
			System.out.println ("Enter characters, '|' to stop reading keyboard: ");
			while (true) {
				c = (char) br.read ();
				if (c == '|') break;
				target.write ((int) c);
			}
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

class Question9 {
	public static void main(String[] args) {
		CharStreamWriteDemo charStreamObj = new CharStreamWriteDemo ();
		ByteStreamWriteDemo byteStreamObj = new ByteStreamWriteDemo ();
	}
}