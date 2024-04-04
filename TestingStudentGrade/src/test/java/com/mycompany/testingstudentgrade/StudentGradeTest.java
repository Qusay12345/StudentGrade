/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testingstudentgrade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Windows.10
 */
public class StudentGradeTest {
    
    public StudentGradeTest() {
    }
    @Test
     public void testGetGrade95() {
        System.out.println("Test for grade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);//this is test should pass
        assertEquals(expResult, result);
    }
     @Test
    public void testGetGrade85() {
        System.out.println("Test for grade 85");
        int mark = 85;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);//this is test should pass
        
        assertEquals(expResult, result);
    }
    @Test
    public void testGetGrade75() {
        System.out.println("Test for grade 75");
        int mark = 75;
        String expResult = "C";
        String result = StudentGrade.getGrade(mark);//this is test should fail
        assertEquals(expResult, result);
    }
@Test
    public void testGetGrade70() {
        System.out.println("Test for grade 70");
        int mark = 70;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);//this is test should fail
    }
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        //before each test case
      
    }
    
    @AfterEach
    public void tearDown() {
      
    }

 
}
