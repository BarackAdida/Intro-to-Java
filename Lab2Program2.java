import javax.swing.*;
//import java.awt.*;

public class Lab2Program2 {

    public static void main (String [] args) {
          
	// String firstName;
	// String lastName;
    String fullName;

    fullName = JOptionPane.showInputDialog(null, "What is your name?");
	// firstName = JOptionPane.showInputDialog(null, "What is your first name?");
	// lastName = JOptionPane.showInputDialog(null, "What is your last name?");
    String[] parts = fullName.split(" ");
    // JOptionPane.showMessageDialog(null, fullName);
    // char initial1 = firstName.charAt(0);
    // char initial2 = lastName.charAt(0);

        JOptionPane.showMessageDialog(null, "Your first name is: " + parts[0]);
        JOptionPane.showMessageDialog(null, "Your last name is: " + parts[1]);
	// JOptionPane.showMessageDialog(null, "Your full name is " + 
	// 			            firstName + " " + lastName);
    
    // JOptionPane.showMessageDialog(null, "Yor initials are: " + initial1 + "." + initial2 + ".");
    }
}