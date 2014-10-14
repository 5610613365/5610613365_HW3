/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalGrade;

/**
 *
 * @author poom
 */
public class CalGrade {
    public static String calGrade (double score)
    {
        String ans = null;
        if (score <= Student.getMax() && score>=(Student.getMax()+Student.getAvg())/2)
        {
            ans = "A";
        }
        else if (score >= Student.getAvg())
        {
            ans = "B";
        }
        else if ( score >= (Student.getAvg() + Student.getMin()) /2)
        {
            ans = "C";
        }
        else if ( score >= Student.getMin())
        {
            ans = "D";
        }
        else 
        {
            ans = "F";
        }
        return ans;
    }
}
