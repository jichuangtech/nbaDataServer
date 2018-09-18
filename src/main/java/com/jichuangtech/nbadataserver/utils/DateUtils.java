package com.jichuangtech.nbadataserver.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DateUtils {
    public static String getSimpleDate(Timestamp time) {
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(time);
    }
}
