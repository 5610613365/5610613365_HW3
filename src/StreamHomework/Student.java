/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamHomework;

/**
 *
 * @author poom
 */
public class Student {
    private String ID;
    private String hw1 = "-";
    private String hw2 = "-";
    private String hw3 = "-";
    public Student (String inputID)
    {
        ID = inputID;
    }
    public String getID ()
    {
        return ID;
    }
    public void setHw1(String inputhw1)
    {
        hw1 = inputhw1;
    }
    public void setHw2(String inputhw2)
    {
        hw2 = inputhw2;
    }
    public void setHw3(String inputhw3)
    {
        hw3 = inputhw3;
    }
    public String toString ()
    {
        return ID + "\t" + hw1 + "\t" + hw2 + "\t" + hw3; 
    }
}
