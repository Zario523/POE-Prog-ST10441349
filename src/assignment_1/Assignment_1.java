// Zario Di Paolo
// Group 1: POE
/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_1;

import javax.swing.JOptionPane;

public class Assignment_1 {

    public static void main(String[] args) {

        Account_Gathering Account = new Account_Gathering();
        String Username;
        String Password;

        // Username validation
        JOptionPane.showMessageDialog(null, "Please ensure that your Username contains an underscore and is less than 5 characters");// inform the user of the limits to making their username
        do { // create a loop to allow the user to re-enter the username if entered incorrectly

            Username = JOptionPane.showInputDialog("Please create a Username: ");// promopt user to enter a username to make a new username

            if (Account.checkUserName(Username) == true) {     // if the username is valid then set the username to the variable in the class       
                Account.setUsername(Username);
                JOptionPane.showMessageDialog(null, "Username successfully captured!");
            } else {
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            }
        } while (!Account.checkUserName(Username) == true);

        // Password validation
        JOptionPane.showMessageDialog(null, "Please ensure that your password is: \nAt least 8 characters long \nContains a capital letters \nContains a number \nContain a special character");// inform the user of the limits to making their password
        do { // create a loop to allow the user to re-enter the username if entered incorrectly
            Password = JOptionPane.showInputDialog("Please create a Password: ");// promopt user to enter a password to make a new password

            if (Account.checkPasswordComplexity(Password) == true) { // if the password is valid then set the password to the variable in the class            
                Account.setPassword(Password);
                JOptionPane.showMessageDialog(null, "Password successfully captured");
            } else {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            }
        } while (!Account.checkPasswordComplexity(Password) == true);

        // Ask user for first and last name
        String FirstName = JOptionPane.showInputDialog("Please enter your First Name:");
        String LastName = JOptionPane.showInputDialog("Please enter your Last Name:");

        // set the name values to the variable in the class
        Account.setFirstName(FirstName);
        Account.setLastName(LastName);

        // Log in prompts 
        String createdUsername;
        String createdPassword;

        do {
            // promt the user to enter a username and password
            createdUsername = JOptionPane.showInputDialog("Please enter your created Username: ");
            createdPassword = JOptionPane.showInputDialog("Please enter your created Password: ");

            //run the method to check if the username and password enterd is the same as the original ones created
            Account.LogInUser(createdUsername, createdPassword);

            // Return a message for whether the information entered is successful or unsuccessful
            if (Account.LogInUser(createdUsername, createdPassword) == true) {
                JOptionPane.showMessageDialog(null, "Welcome " + Account.getFirstName() + ", " + Account.getLastName() + " it is great to " + "see you again. ");
            } else {
                JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");
            }
        } while (!Account.LogInUser(createdUsername, createdPassword));

    }
}
