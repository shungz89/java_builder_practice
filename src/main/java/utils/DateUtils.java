package utils;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by zhudewei on 2016/1/24.
 * 时间相关工具类
 */
public class DateUtils {


    public static final SimpleDateFormat DEFAULT_SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat dfYMD = new SimpleDateFormat("yyyy-MM-dd");

    public static String date2String(Date time) {
        return date2String(time,null) ;
    }

    public static String date2String(Date time, SimpleDateFormat format) {
        return (format != null) ? format.format(time) : dfYMD.format(time);
    }




}