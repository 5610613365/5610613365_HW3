/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time;

/**
 *
 * @author poom
 */
public class TimeCounter extends Time {
    private int stimeH;
    private int stimeM;
    private int etimeH;
    private int etimeM;
    
    public TimeCounter()
    {
        super();
    }
    public TimeCounter(int initTime)
    {
        super(initTime);
    }
           
    public void startCounter()
    {
        stimeH = getHour();
        stimeM = getMin();
    }
    public void endCounter()
    {
        etimeH = getHour();
        etimeM = getMin();
        System.out.println("จับเวลาได้ : "+(etimeH-stimeH) +":"+(etimeM-stimeM));
    }
    
}
