import java.util.Scanner;

/* program to input salary of a person along with their name. If their salary is 
	less than 70000 then throw an exception with a proper message "Not eligible for loan!" */

class Loan extends Exception {
	String name;
	double salary;
	void getInfo () {
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter person's details: ");
		System.out.print ("Enter name: ");
		name = input.nextLine ();
		System.out.print ("Enter salary: ");
		salary = input.nextDouble ();
	}
	void checkEligibility () throws Loan {
		if (salary < 70000) throw new Loan ();
		else System.out.println (name + " is eligible for loan!");
	}
	public String toString () {
		return "Not eligible for loan!";
	}
}

class Question2 {
	public static void main(String[] args) {
		Loan person = new Loan ();
		person.getInfo ();
		try {
			person.checkEligibility ();
		}
		catch (Loan l) {
			System.out.println (l);
		}
	}
}