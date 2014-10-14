/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidtermExam;

import java.util.Scanner;

/**
 *
 * @author poom
 */
public class Student extends Transcript {
    public Student(){
        super();
    }
    public Student(String initfirstname, String initlastname, String initID, double initgpa)
    {
        super(initfirstname, initlastname, initID, initgpa);
    }
    public Transcript sentApplication()
    {
        return new Transcript(getFirstname(), getLastname(), getID(), getGPA());
    }
    
}
