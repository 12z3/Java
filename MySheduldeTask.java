package aSoftUni;


import java.util.Timer;
import java.util.TimerTask;

class MyScheduledTask extends TimerTask {
        public void run(){
            System.out.println("Message printed every minute");
        }
    }

    class Main{
        public static void main(String... args){
            Timer timer = new Timer();
            timer.schedule(new MyScheduledTask(), 0, 60*1000);
            //Do something that takes time
        }
    }

