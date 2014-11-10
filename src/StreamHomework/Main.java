/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamHomework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author poom
 */
public class Main {
    
    public static void main (String[] args) throws FileNotFoundException, IOException
    {
        FileReader reader = new FileReader("/Users/poom/NetBeansProjects/N'Dao/src/StreamHomework/TextTest.txt");
        FileWriter writer = new FileWriter("output.txt");
        BufferedReader p = new BufferedReader(reader);
        PrintWriter out = new PrintWriter(writer);
        ArrayList<Student> d = new ArrayList();
        String line;
        
        while((line = p.readLine())!=null){
            StringTokenizer tokenizer = new StringTokenizer(line);
            int i = 0;
            String[] token = new String[3];
            while(tokenizer.hasMoreTokens())
            {               
                        token[i++] = tokenizer.nextToken(":");   
            }
            if (d.isEmpty())
            {
                d.add(new Student(token[0]));
                switch (token[1]) {
                    case "HW1":
                        d.get(0).setHw1(token[2]);
                        break;
                    case "HW2":
                        d.get(0).setHw2(token[2]);
                        break;
                    default:
                        d.get(0).setHw3(token[2]);
                        break;
                }
            }
            else
            {
                boolean found = false;
                for (Student d1 : d) {
                    if (token[0].equals(d1.getID())) {
                        found = true;
                        switch (token[1]) {
                            case "HW1":
                                d1.setHw1(token[2]);
                                break;
                            case "HW2":
                                d1.setHw2(token[2]);
                                break;
                            default:
                                d1.setHw3(token[2]);
                                break;
                        }
                    }
                }
                if (!found)
                {
                    d.add(new Student(token[0]));
                    switch (token[1]) {
                        case "HW1":
                            d.get(d.size() - 1).setHw1(token[2]);
                            break;
                        case "HW2":
                            d.get(d.size() - 1).setHw2(token[2]);
                            break;
                        default:
                            d.get(d.size() - 1).setHw3(token[2]);
                            break;
                    }
                }
            }
        }
        reader.close();
        System.out.println("Student\t\tHW1\tHW2\tHW3");
        out.println("Student\t\tHW1\tHW2\tHW3");
        for (Student d1 : d) {
            out.println(d1);
            System.out.println(d1);
        }
        writer.close();      
    }
}
