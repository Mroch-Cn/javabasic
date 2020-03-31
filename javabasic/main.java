package javabasic;

import javabasic.Clock;

public class main{
    public static void main(int a ,int b,int c ){
        javabasic.Clock aClock = new javabasic.Clock();
        aClock.hour = a;
        aClock.minute = b;
        aClock.second = c;
        aClock.setTime(aClock.hour, aClock.minute, aClock.second);
        aClock.showTime(aClock.hour, aClock.minute, aClock.second);
    }
}