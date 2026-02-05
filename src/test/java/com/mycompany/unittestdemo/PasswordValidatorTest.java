/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.unittestdemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LorenzoSJ
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest()
    {
        
    }
    
    @Test
    public void testCheckLengthGood()
    {
        System.out.println("checkLengthGood");
        String password = "nylongpassword";
        assertEquals(true, PasswordValidator.checkLength(password));
    }
    
    @Test
    public void testCheckLengthBad()
    {
        System.out.println("checkLengthBad");
        String password = "pass";
        assertEquals(false, PasswordValidator.checkLength(password));
    }
    
    @Test
    public void testCheckLengthBoundary()
    {
        System.out.println("checkLengthBoundary");
        String password = "password";
        assertEquals(true, PasswordValidator.checkLength(password));
    }
    
}
