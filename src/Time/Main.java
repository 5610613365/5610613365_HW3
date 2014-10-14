/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time;

import java.util.Scanner;

/**
 *
 * @author poom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // สร้างTimeobject ที%แสดงค่าเวลา22:34
        /*Time t = new Time(2234);
        // แสดงเวลาออกที%จอภาพ 
        System.out.println(t);
        // นําส่วนที%เป็ นชั%วโมงแสดงค่าออกที%จอภาพ 
        System.out.println("Hour part = " + t.getHour());
        // นําส่วนที%เป็ นนาทีแสดงค่าออกที%จอภาพ 
        System.out.println("Min part = " + t.getMin());
        // ปรับเวลาไปข้างหน้าอีก 4 ชั%วโมง 48 นาที 
        t.adjustTimeAfter(4, 48);
        // แสดงเวลาที%เป็ นค่าใหม่ออกที%จอภาพ 
        System.out.println(t);
        // ปรับเวลาถอยหลังเป็ นจํานวน 15 ชั%วโมง 40 นาที 
        t.adjustTimeBefore(15, 40);
        // แสดงเวลาที%เป็ นค่าใหม่ออกที%จอภาพ 
        System.out.println(t);
        */
        
        
        //System.out.print("Enter time: ");
        Scanner sc = new Scanner(System.in);
        /*AlarmClock dao = new AlarmClock(sc.nextDouble());
        dao.adjustTimeAfter(2,10);
        dao.setAlarm(2.20);
        dao.adjustTimeAfter(0, 10);*/
        
        /*
        Calendar d = new Calendar(sc.nextInt(),sc.nextInt(),sc.nextInt(),
                                   sc.nextInt());
        d.adjustTimeBefore(1, 30, 1, 1, 1);
        d.showCalendar();
                */
        
        TimeCounter p = new TimeCounter();
        p.startCounter();
        p.adjustTimeAfter(2, 10);
        p.adjustTimeAfter(1, 20);
        p.endCounter();
    }
}
