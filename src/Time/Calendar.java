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
public class Calendar extends Time{
    private int day;
    private int month;
    private int year;
    
    public Calendar()
    {
        super();
        day = 1;
        month = 1;
        year = 2014;
    }
    
    public Calendar(int inittime,int initday,int initmonth, int inityear)
    {
        super(inittime);
        day = initday;
        month = initmonth;
        year = inityear;
        
    }
    
    public void adjustTimeAfter(int h , int m, int d, int mo, int y){
        
        setMin(getMin() + m) ;
        if (getMin() > 60)
        {
            setHour(getHour()+1);
            setMin(getMin()%60);
        }
        
        setHour(getHour() + h);
        if(getHour() > 24){
            setHour(getHour() % 24);
            day++;
        }
        day+=d;
        if(day > 30)
        {
            month++;
            day %= 31;
        }
        month += mo;
        if(month > 12)
        {
            year++;
            month %= 13;
        }
        year += y;
    }
    public void adjustTimeBefore(int h , int m ,int d, int mo, int y){
        
        setMin(getMin() - m) ;
        if(getMin()< 0){
            setMin(getMin()+ 60);
            setHour(getHour()-1);
        }
        setHour(getHour() - h);
        if (getHour() < 0)
        {
            setHour(getHour() +24);
            day--;
        }
        day -= d;
        if(day < 0)
        {
            month--;
            day += 30;
        }
        month -= mo;
        if(month < 0)
        {
            year--;
            month += 12;
        }
        year -= y;
    }
    public void showCalendar()
    {
       
        System.out.println("Time: " +getHour() + ":" +getMin());
        
        System.out.println("Today is " +day + "/" +month + "/" +year);
        
    }
    
}

    

