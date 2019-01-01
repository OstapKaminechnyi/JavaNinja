package sample;
import java.util.*;
import java.text.*;

public class DateFormating {
    public static void main(String args[]){
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyy.mm.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current date" + ft.format(dNow));
    }
}
