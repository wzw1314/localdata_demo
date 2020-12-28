package demo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Demo02 {
    public static void main(String[] args) {
        test01();
        test02();
        test03();
        test04();
        test05();
        test06();
        test07();
        test08();
        test09();
    }

    // 输出星期几
    public static void test01() {
        LocalDate data = LocalDate.now();
        DayOfWeek dayOfWeek = data.getDayOfWeek();
        System.out.println(dayOfWeek);
    }

    // 本月的第几天
    public static void test02() {
        LocalDate data = LocalDate.now();
        int dayOfMonth = data.getDayOfMonth();
        System.out.println(dayOfMonth);
    }

    // 本年度的第几天
    public static void test03() {
        LocalDate data = LocalDate.now();
        int dayOfYear = data.getDayOfYear();
        System.out.println(dayOfYear);
    }

    // 输出三天后的日期
    public static void test04() {
        LocalDate now = LocalDate.now();
        LocalDate localDate = now.plusDays(3);
        System.out.println(localDate);

    }

    // 一周后的日期
    public static void test05() {
        LocalDate now = LocalDate.now();
        LocalDate localDate = now.plusWeeks(1);
        System.out.println(localDate);
    }

    // 一个月后的日期
    public static void test06() {
        LocalDate now = LocalDate.now();
        LocalDate localDate = now.plusYears(1);
        System.out.println(localDate);
    }

    // 输出当前时间
    public static void test07() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH时mm分ss秒");
        String format = formatter.format(now);
        System.out.println(format);
    }

    // 输出今天0点0分0秒的时间
    public static void test08() {
        // 获取明天零点时间戳
        LocalDate localDate = LocalDate.now();
        // 当前日期+1
        localDate = localDate.plusDays(1);
        LocalDateTime dateTime = LocalDateTime.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth(), 0, 0, 0);
        long timestamp = dateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println(timestamp);
    }

    // 输出今天23点59分59秒的时间
    public static void test09() {
        // 获取明天零点时间戳
        LocalDate localDate = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth(), 23, 59, 59);
        long second = dateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println(second);
    }
}
