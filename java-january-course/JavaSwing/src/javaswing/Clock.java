package javaswing;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Clock implements Runnable{
    JFrame f;
    Thread t = null;
    int hours =0,minutes = 0, seconds= 0;
    String timeString = "";
    JButton b;
    Clock(){
        f=new JFrame();
        t= new Thread();
        t.start();;
        b= new JButton();
        b.setBounds(100,100,100,50);
        f.add(b);
        f.setSize(300,400);
        f.setVisible(true);

    }
    public void run(){
        try {
            while (true){
                Calendar calendar  = Calendar.getInstance();
                hours=calendar.get(Calendar.HOUR_OF_DAY);
                if (hours>12) hours-=12;
                minutes=calendar.get(Calendar.MINUTE);
                seconds=calendar.get(Calendar.SECOND);
                SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
                Date date = calendar.getTime();
                timeString=format.format(date);
                printTime();
                t.sleep(1000);

            }
        }
        catch (Exception e){

        }
    }
    public void printTime(){
        b.setText(timeString);
    }
    public static void main(String a[]){
        new Clock();
    }
}
