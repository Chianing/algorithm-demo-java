package com.chianing.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Chianing
 */
public class DateUtil {

    public static Date getAfterHoursOfDay(Integer interval) {
        if (interval == null) {
            return new Date();
        }
        return getAfterHoursOfDay(new Date(), interval);
    }

    public static Date getAfterHoursOfDay(Date date, Integer interval) {
        if (date == null || interval == null) {
            return date;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, interval);

        return calendar.getTime();
    }

}
