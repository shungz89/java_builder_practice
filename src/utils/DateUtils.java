package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;


/**
 * Created by zhudewei on 2016/1/24.
 * 时间相关工具类
 */
public class DateUtils {


    public static final SimpleDateFormat DEFAULT_SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat dfYMD = new SimpleDateFormat("yyyy-MM-dd");

    public static String date2String(Date time) {
        return dfYMD.format(time);
    }

    public static String date2String(Date time, SimpleDateFormat format) {
        return format.format(time);
    }

    public static int getBirthDay(Date dateOfBirth) {
        long dateToday = new Date().getTime();
        long dateOfBirthLong = dateOfBirth.getTime();

        long calDiff = dateToday - dateOfBirthLong;

        long difference_In_Years
                = (calDiff
                / (1000l * 60 * 60 * 24 * 365));

        return (int) difference_In_Years;

    }


}