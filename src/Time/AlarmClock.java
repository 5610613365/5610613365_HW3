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
public class AlarmClock extends Time {
    private double alarm;
    
    public AlarmClock()
    {
        super();
    }
    public AlarmClock(double initalarm)
    {
        super();
        alarm = initalarm;
    }
    public AlarmClock(int inittime, double initalarm)
    {
        super(inittime);
        alarm = initalarm;
    }
    public double getAlarm()
    {
        return alarm;
    }
    public void setAlarm(double newAlarm)
    {
        alarm = newAlarm;
    }
    public void adjustTimeAfter(int h , int m){
        
        setMin(getMin() + m) ;
        if (getMin() > 60)
        {
            setHour(getHour()+1);
            setMin(getMin()%60);
        }
        
        setHour(getHour() + h);
        if(getHour() > 24){
            setHour(getHour() % 24);
        }
        
        if(getHour() == (int)alarm )
        {
            if(getMin() == (int)((alarm-(int)alarm) *100))
            {
                System.out.println("Beep Beep Beep Beep!!!!!");
            }
            
        }
        
    }
    public void adjustTimeBefore(int h , int m){
        
        setMin(getMin() - m) ;
        if(getMin()< 0){
            setMin(getMin()+ 60);
            setHour(getHour()-1);
        }
        setHour(getHour() - h);
        if (getHour() < 0)
        {
            setHour(getHour() +24);
        }
        if(getHour() == (int)alarm )
                
        {
        if(getMin() == (int)((alarm-(int)alarm) *100))
            {
                System.out.println("Beep Beep Beep Beep!!!!!");
            }
            
        }
    }
    public String toString(){
        return "time = " +getHour() + ":" + getMin();
    }
}
