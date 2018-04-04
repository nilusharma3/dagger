package com.example.anil.dagger2demoimpl.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


/**
 * Generic methods used for Date & Time
 */
public final class DateTimeUtil {

    public static final String CAL_FORMAT = "EEE MMM dd HH:MM:SS GMT+05:30 yyyy";
    //    public static final String UTC_FORMAT = "Fri Jan 12 08:00:00 GMT+05:30 2018";
    public static final String UTC_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    public static final String FORMAT_START_TIME = "hh:mm a";
    public static final String FORMAT_END_TIME = "hh:mm a";
    public static final String DETAIL_FORMAT_TIME = "MMM dd,yyyy";
    public static final String SERVER_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final int ONE_MIN_IN_MILLISECONDS = 60000;
    private static final String LOCAL_FORMAT = "yyyy, dd MMM - hh:mm a";
    private static final String DOB_FORMAT = "dd/MM/yyyy";
    private static final int  THOUSAND = 1000;


    /**
     * Empty Constructor
     * not called
     */
    private DateTimeUtil() {
    }

    /**
     * Method to get current timezone offset value
     *
     * @return offset value in minutes
     */
    public static String getCurrentZoneOffset() {
        final TimeZone tz = TimeZone.getDefault();
        return String.valueOf(tz.getOffset(Calendar.ZONE_OFFSET));
    }

    /**
     * Method to convert UTC to LOCAL time format
     *
     * @param date UTC date
     * @return local timezone converted date
     */
    public static String getLocalDateFromUTC(final String date) {
        final DateFormat f = new SimpleDateFormat(UTC_FORMAT);
        f.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            final Date d = f.parse(date);
            final DateFormat formatedDate = new SimpleDateFormat(LOCAL_FORMAT);
            return formatedDate.format(d);
        } catch (final ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Gets display date format.
     *
     * @param date the date
     * @return the date with month name
     */
    public static String getDisplayDateFormat(final String date) {
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        //f.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date d = f.parse(date);
            DateFormat formatedDate = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);
            return formatedDate.format(d);
        } catch (final ParseException e) {
            return "";
        }
    }

    /**
     * Gets date in iso.
     *
     * @param date the date
     * @return the date in iso
     */
    public static String getServerDateFormat(final String date) {
        DateFormat f = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);
        //f.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date d = f.parse(date);
            DateFormat formatedDate = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            return formatedDate.format(d);
        } catch (final ParseException e) {
            return "";
        }
    }


    /**
     * Get date string.
     *
     * @param date the date
     * @param type 0 for month, 1 for day and 2 for year
     * @return the string
     */
    public static String getDate(final String date, final int type) {
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            Date d = f.parse(date);
            DateFormat formatedDate;
            if (type == 0) {
                formatedDate = new SimpleDateFormat("MMM", Locale.ENGLISH);
            } else if (type == 1) {
                formatedDate = new SimpleDateFormat("dd", Locale.ENGLISH);
            } else {
                formatedDate = new SimpleDateFormat("yyyy", Locale.ENGLISH);
            }
            return formatedDate.format(d).toUpperCase();
        } catch (final ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * get dob date
     *
     * @param date the date
     * @return the string
     */
    public static String getDOBDate(final String date) {
        SimpleDateFormat sdf = new SimpleDateFormat(SERVER_FORMAT);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat dateTimeFormat = new SimpleDateFormat(DOB_FORMAT);
        try {
            Date myDate = sdf.parse(date);
            return dateTimeFormat.format(myDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * get dob date
     *
     * @param date the date
     * @return the string
     */
    public static String getStartTime(final String date) {
        SimpleDateFormat sdf = new SimpleDateFormat(UTC_FORMAT);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat dateTimeFormat = new SimpleDateFormat(FORMAT_START_TIME);
        try {
            Date myDate = sdf.parse(date);
            return dateTimeFormat.format(myDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * get dob date
     *
     * @param date the date
     * @return the string
     */
    public static String getEndTime(final String date) {
        SimpleDateFormat sdf = new SimpleDateFormat(UTC_FORMAT);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat dateTimeFormat = new SimpleDateFormat(FORMAT_END_TIME);
        try {
            Date myDate = sdf.parse(date);
            return dateTimeFormat.format(myDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * get dob date
     *
     * @param date the date
     * @return the string
     */
    public static String getDetailDate(final String date) {
        SimpleDateFormat sdf = new SimpleDateFormat(UTC_FORMAT);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat dateTimeFormat = new SimpleDateFormat(DETAIL_FORMAT_TIME);
        try {
            Date myDate = sdf.parse(date);
            return dateTimeFormat.format(myDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

}
