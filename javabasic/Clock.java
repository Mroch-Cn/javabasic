package javabasic;

public class Clock {
    int hour;
    int minute;
    int second;
    //方法的定义
    public void setTime(int newH,int newM,int newS){
        hour = newH;
        minute = newM;
        second = newS;
    }
    public void showTime(){
        System.out.println(hour+":"+minute+":"+second);
    }
}