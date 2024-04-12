/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_1;

import javax.swing.JOptionPane;

public class Account_Gathering {

    private String Username;
    private String Password;
    private String FirstName;
    private String LastName;

    // check if the username has an underscore and 5 characters in total otherwise showmessage and close the application
    public boolean checkUserName(String newUsername) {
        if (newUsername.contains("_") && newUsername.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }

    //Check that the different necesities for creating a valid password are true
    public boolean checkPasswordComplexity(String newPassword) {
        // get length of password
        int lengthOfPassword = newPassword.length();
        // boolean variables to validate specifications of the password
        boolean hasUpCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        // loop through the length of the password to identify the different characters within it
        for (int i = 0; i < newPassword.length(); i++) {
            char letter = newPassword.charAt(i);
            if (Character.isUpperCase(letter)) {         // validate if the posotion of the password has an uppercase letter
                hasUpCase = true;
            } else if (Character.isDigit(letter)) {      // validate if the posotion of the password has a number
                hasNumber = true;
            } else if (!Character.isWhitespace(letter)) {// validate if the posotion of the password has a special character
                hasSpecialChar = true;
            }
        }

        // check length of password and other validations
        if (newPassword.length() >= 8 && hasUpCase && hasNumber && hasSpecialChar) {
            // if everything matches then show a message and set boolean to true 
            return true;
        } else {
            // if something or more than one thing doesnt match then show a message and set the boolean to false
            return false;
        }
    }

    // Login prompt 
    public boolean LogInUser(String madeUsername, String madePassword) {
        if (madeUsername.equals(Username) && madePassword.equals(Password)) { // if the username and password match, then return the boolean as true
            // JOptionPane.showMessageDialog(null, "True");
            return true;
        } else {
            // JOptionPane.showMessageDialog(null, "False");
            return false;
        }
    }

    // getter for Username
    public String getUsername() {
        return Username;
    }

    // setter for Username
    public void setUsername(String Username) {
        this.Username = Username;
    }

    // getter for Password                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    public String getPassword() {
        return Password;
    }

    // setter for Password
    public void setPassword(String Password) {
        this.Password = Password;
    }

    // getter for first name 
    public String getFirstName() {
        return FirstName;
    }

    // setter for first name
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    // getter for last name
    public String getLastName() {
        return LastName;
    }

    // setter for last name
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

}
