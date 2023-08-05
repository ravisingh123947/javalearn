package com.springbootdemo.javalearn;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainDateUtc {
    public static void main(String[] args) throws ParseException {

//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
//
//        System.out.println(calendar.getTime());
//
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(dateFormat.format(calendar.getTime()));

//        String time =  "2023-07-04T12:34:56.789Z";
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd:mm:yyyy");
//        simpleDateFormat.format(time);
//        System.out.println(time);

//        TimeZone defaultTimeZone = TimeZone.getDefault();
//        System.out.println(defaultTimeZone.getID());

//        Float value = 12.2361F;
//        System.out.println(String.format("%.2f",value));

//        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
//        System.out.println(now);

//        String str1 = "";
//        String str2 = "";
//
//        str1 += "+00:00";
//        str2 += "\u221200:30";
//        System.out.println(str1);
//        System.out.println(str2);

//        Integer a = 4;
//        Integer  b = 10;
//        System.out.println(a.compareTo(b));
//
//        Calendar calendar = Calendar.getInstance();
//        Date date1 = calendar.getTime();
//        calendar.add(Calendar.DAY_OF_MONTH,5);
//        Date date2 = calendar.getTime();
//
//        System.out.println(date1.compareTo(date2));


        //in below code i tried to find out time in millis in utc and indian time

//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
//        System.out.println(calendar.getTime());
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
//        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
//
//        String utcTime = sdf.format(calendar.getTime());
//        System.out.println(utcTime);
//        System.out.println();
//        System.out.println(calendar.getTime().getTime());
//
//        Date tt = sdf.parse(utcTime);
//        System.out.println(tt.getTime());

    }
}
