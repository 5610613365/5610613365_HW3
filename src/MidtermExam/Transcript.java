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
public class Transcript{
    private double gpa;
    private String firstname;
    private String lastname;
    private String ID;
    
    
    public Transcript(){
        System.out.print("Enter firstname: ");
        Scanner sc = new Scanner(System.in);
        firstname = sc.next();
        System.out.println("");
        System.out.print("Enter lastname: ");
        lastname = sc.next();
        System.out.println("");
        System.out.print("Enter your ID: ");
        ID = sc.next();
        System.out.println("");
        System.out.print("Enter your GPA: ");
        gpa = sc.nextDouble();
    }
    public Transcript(String initfirstname, String initlastname, String initID, 
                        double initgpa )
    {
        firstname = initfirstname;
        lastname = initlastname;
        ID = initID;
        gpa = initgpa;
        
    }
    
    public String getFirstname()
    {
       return firstname;
    }
    public void setFirstname(String initfirstname)
    {
        firstname = initfirstname;
    }
    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String initlastname)
    {
        lastname = initlastname;
    }
    public String getID()
    {
        return ID;
    }
    public void setID(String initID)
    {
        ID = initID;
    }
    public double getGPA()
    {
        return gpa;
    }
    public void setGPA(String initgpa)
    {
        ID = initgpa;
    }
    public String toString ()
    {
        return "name : " + getFirstname() + " " + getLastname() + "\n" + "ID : " + getID() + "\n" + "GPA : " + getGPA();
    }
}
