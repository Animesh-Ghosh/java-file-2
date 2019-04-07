import java.util.Arrays;
import java.util.Scanner;
 
class Question15 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		String[] names = new String[10];
		System.out.println ("Enter 10 names: ");
		for (int i = 0; i < names.length; i++) 
			names[i] = input.nextLine ();
		Arrays.sort (names);
		/* case insensitive sorting
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER); */
		System.out.println ("Names in sorted order: ");
		for (int i = 0; i < names.length; i++) 
			System.out.println(names[i]);
	}
}