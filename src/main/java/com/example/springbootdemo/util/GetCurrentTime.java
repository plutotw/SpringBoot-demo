package com.example.springbootdemo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentTime {
    public static String getCurrentTime(){
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        return sdf.format(date);
    }
}
