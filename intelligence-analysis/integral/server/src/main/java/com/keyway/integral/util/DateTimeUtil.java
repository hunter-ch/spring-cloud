package com.keyway.integral.util;

import lombok.extern.slf4j.Slf4j;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期时间工具类
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 19:36
 */
@Slf4j
public class DateTimeUtil {
    /**
     * 将日期转换成指定格式的字符串.
     *
     * @param date 日期
     * @param dateFormat 日期格式. 如果为空，默认为:yyyy-MM-dd HH:mm:ss.
     * @author hunter
     * @since 2018/8/31 19:36
     **/
    public static String dateToStr(final Date date, String dateFormat) {
        if (date == null) {
            return "";
        }
        try {
            if (dateFormat == null || dateFormat.trim().length() == 0){
                dateFormat = "yyyy-MM-dd HH:mm:ss";
            }
            DateFormat fmt = new SimpleDateFormat(dateFormat.trim());
            return fmt.format(date);
        } catch (Exception ex) {
            log.error("将日期转换成指定格式({})的字符串时失败！错误原因：{}", dateFormat, ex.getMessage());
            return "";
        }
    }

    /**
     * 将当前日期转换成yyyyMMddHHmmss的字符串. 如：20180726112754
     *
     * @author hunter
     * @since 2018/8/31 19:36
     **/
    public static String currDateToStr() {
        return dateToStr(new java.util.Date(), "yyyyMMddHHmmss");
    }
}
