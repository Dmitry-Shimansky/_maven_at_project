package hometestwork.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentDate {

    public static String currentDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
//        System.out.println(dateFormat.format(date));
        return dateFormat.format(date);
    }
}
