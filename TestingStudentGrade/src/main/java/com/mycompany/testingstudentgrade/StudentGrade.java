/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testingstudentgrade;

/**
 *
 * @author Windows.10
 */
public class StudentGrade {
    /**
     * Calculates grade as follows:
     * A (90 - 100), B (80 - 89), C(<80 && >=70), D(<70 && >=60) F ( < 60)
     * @param mark Student mark
     * @return The grade based on the mark entered by user
     */
    public static String getGrade(int mark) {
        //adding more grades
        if (mark >= 90 && mark <= 100)
            return "A";
        else if (mark >= 80 && mark < 90)
            return "B";        
        else
            return "F";
    }
}
