/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignment_1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author lab_services_student
 */
public class Account_GatheringTest {

    public Account_GatheringTest() {
    }

    Account_Gathering Login = new Account_Gathering();

    //Check to see if the username entered is correctly formatted
    @Test
    public void testCheckUserNameCorretlyFormatted() {
        boolean actual = Login.checkUserName("kyl_1");
        assertTrue(actual);
    }

    //Check to see if the username entered is incorrectly formatted
    @Test
    public void testCheckUserNameIncorretlyFormatted() {
        boolean actual = Login.checkUserName("kyle!!!!!");
        assertFalse(actual);
    }

    //Check to see if the password entered is correctly formatted
    @Test
    public void testCheckPasswordComplexitySuccess() {
        boolean actual = Login.checkPasswordComplexity("Ch&&sec@ke9");
        assertTrue(actual);
    }

    //Check to see if the password entered is incorectly formatted
    @Test
    public void testCheckPasswordComplexityFail() {
        boolean actual = Login.checkPasswordComplexity("password");
        assertFalse(actual);
    }

    //Check to see if the credentials entered are correct
    @Test
    public void testLogInUserTrue() {
        boolean actual = Login.LogInUser("kyl_1", "Ch&&sec@ke9" );
        assertTrue(actual);
    }
    
    //Check to see if the credentials entered are incorrect
    @Test
    public void testLogInUserFalse() {
        boolean actual = Login.LogInUser("kyle!!!!!", "password" );
        assertFalse(actual);
    }

    @Test
    public void testGetUsername() {
    }

    @Test
    public void testSetUsername() {
    }

    @Test
    public void testGetPassword() {
    }

    @Test
    public void testSetPassword() {
    }

    @Test
    public void testGetFirstName() {
    }

    @Test
    public void testSetFirstName() {
    }

    @Test
    public void testGetLastName() {
    }

    @Test
    public void testSetLastName() {
    }

}
