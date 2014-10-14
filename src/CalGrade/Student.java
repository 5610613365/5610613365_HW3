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
public class Student {
    private String[] arr = new String[3];
    private static double max=0;
    private static double avg;
    private static double min=101;
    private static int count = 0;
    public Student (String[] s)
    {
        arr[0] = s[0];
        arr[1] = s[1];
        arr[2] = s[2];
        count ++;
        if (Double.parseDouble(arr[1])+ Double.parseDouble(arr[2]) > max)
        {
            max = Double.parseDouble(arr[1])+ Double.parseDouble(arr[2]);
        }
        if (Double.parseDouble(arr[1])+ Double.parseDouble(arr[2]) < min)
        {
            min = Double.parseDouble(arr[1])+ Double.parseDouble(arr[2]);
        }
        avg = (max + min) / count;
    }
    public static double getAvg()
    {
        return avg;
    }
    public static double getMin()
    {
        return min;
    }
    public static double getMax()
    {
        return max;
    }
    public String toString ()
    {
        return "ID : " + arr[0] + "\nGrade : " + CalGrade.calGrade
        (Double.parseDouble(arr[1]) + Double.parseDouble(arr[2]));
    }
    
}
