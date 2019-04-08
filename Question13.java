import java.applet.*;
import java.awt.event.*;
import java.awt.*;

/* program to accept details of employee (name, eno, mobile no., designation, salary) 
	using AWT controls */

/* <applet code="Question13" height="400" width="300">
	</applet> */

public class Question13 extends Applet implements ActionListener {
	Label msgIn, empty1, name, number, phone, designation, salary, empty2, 
	msgOut, empName, empNumber, empPhNumber, empDesignation, empSalary;
	TextField nameField, numberField, phoneField, designationField, salaryField;
	Button enter;
	Panel upper, lower;
	public void init () {
		upper = new Panel ();
		lower = new Panel ();
		upper.setLayout (new GridLayout (7, 2, 5, 5));
		lower.setLayout (new GridLayout (6, 1, 5, 5));
		setLayout (new GridLayout (2, 1, 5, 5));
		msgIn = new Label ("Enter employee detail: ", Label.LEFT);
		empty1 = new Label ();
		name = new Label ("Employee Name: ", Label.LEFT);
		number = new Label ("Employee Number: ", Label.LEFT);
		phone = new Label ("Employee Phone number: ", Label.LEFT);
		designation = new Label ("Employee designation: ", Label.LEFT);
		salary = new Label ("Employee salary: ", Label.LEFT);
		empty2 = new Label ();
		msgOut = new Label ("", Label.LEFT);
		empName = new Label ("", Label.LEFT);
		empNumber = new Label ("", Label.LEFT);
		empPhNumber = new Label ("", Label.LEFT);
		empDesignation = new Label ("", Label.LEFT);
		empSalary = new Label ("", Label.LEFT);
		nameField = new TextField (10);
		numberField = new TextField (10);
		phoneField = new TextField (10);
		designationField = new TextField (10);
		salaryField = new TextField (10);
		enter = new Button ("Enter");
		upper.add (msgIn); upper.add (empty1);
		upper.add (name); upper.add (nameField);
		upper.add (number); upper.add (numberField);
		upper.add (phone); upper.add (phoneField);
		upper.add (designation); upper.add (designationField);
		upper.add (salary); upper.add (salaryField);
		upper.add (empty2); upper.add (enter);
		lower.add (msgOut);
		lower.add (empName);
		lower.add (empNumber); 
		lower.add (empPhNumber);
		lower.add (empDesignation);
		lower.add (empSalary);
		add (upper);
		add (lower);
		nameField.addActionListener (this);
		numberField.addActionListener (this);
		phoneField.addActionListener (this);
		designationField.addActionListener (this);
		salaryField.addActionListener (this);
		enter.addActionListener (this);
	}
	public void actionPerformed (ActionEvent ae) {
		String b = ae.getActionCommand ();
		if (b.equals ("Enter")) {
			msgOut.setText ("Employee details: ");
			empName.setText ("Name: " + nameField.getText ());
			empNumber.setText ("Employee number: " + numberField.getText ());
			empPhNumber.setText ("Phone number: " + phoneField.getText ());
			empDesignation.setText ("Designation: " + designationField.getText ());
			empSalary.setText ("Salary: " + salaryField.getText ());
		}
	}
}