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
public class StudentGrade {

    public static void main(String[] args) {
        Student[] dao = new Student[args.length];
        for (int i = 0 ; i < args.length ; i++) 
        {
            dao[i] = new Student(split(args[i]));
        }
        
       for (int i = 0 ; i < args.length ; i++)
       {
           System.out.println(dao[i]);
       }
    }
    
    private static String[] split (String a)
    {
        String[] s = null;
        for (int j = 0; j < 2; j++) {
            s = a.split(":");
        }
        return s;
    }
}
