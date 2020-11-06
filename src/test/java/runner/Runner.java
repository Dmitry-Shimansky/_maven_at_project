package runner;

import chrome.Booking;
import chrome.SelectDemo;
import chrome.W3School;
import java.text.ParseException;

public class Runner {
    public static void main(String[] args) throws InterruptedException, ParseException {

        new SelectDemo().demo();
        new W3School().W3S();
        new Booking().book();
    }
}
