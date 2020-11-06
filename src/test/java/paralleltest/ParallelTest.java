package paralleltest;

import chrome.Booking;
import chrome.SelectDemo;
import chrome.W3School;

import java.text.ParseException;

public class ParallelTest {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                System.out.println("Thread Running");
                try {
                    new SelectDemo().demo();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t1.start();

        Thread t2 = new Thread() {
            public void run() {
                System.out.println("Thread Running");
                try {
                    new W3School().W3S();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t2.start();


        Thread t3 = new Thread() {
            public void run() {
                System.out.println("Thread Running");
                try {
                    new Booking().book();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        };
        t3.start();
    }
}

