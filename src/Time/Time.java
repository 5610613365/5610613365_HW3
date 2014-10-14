package Time;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author poom
 */
public class Time {
    private int hour;
    private int min;
    
    public Time(){
        hour = 0;
        min = 0;
    }
    public Time(int time){
        hour = time / 100;
        min = time % 100;
    }
    public int getHour(){
        return hour;
    }
    public void setHour(int inithour)
    {
        hour = inithour;
    }
    public int getMin(){
        return min;
    }
    public void setMin(int initmin)
    {
        min = initmin;
    }
    public void adjustTimeAfter(int h , int m){
        
        min += m;
        if (min > 60)
        {
            hour++;
            min %= 60;
        }
        
        hour += h;
        if(hour > 24){
            hour %= 24;
        }
    }
    public void adjustTimeBefore(int h , int m){
        
        min -= m;
        if(min < 0){
            min += 60;
            hour--;
        }
        hour -= h;
        if (hour < 0)
        {
            hour += 24;
        }
    }
    public String toString(){
        return "time = " +hour+ ":" + min;
    }
}
