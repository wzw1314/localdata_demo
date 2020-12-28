package demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo01 {
    public static void main(String[] args) {
       test01();
       test02();
       test03();

    }

    public static void test01(){
        LocalDate data = LocalDate.of(2020, 12, 28);
        System.out.println(data);
    }

    public static void test02(){
        LocalDate data = LocalDate.of(2020, 12, 28);
        DateTimeFormatter now = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format = now.format(data);
        System.out.println(format);
    }

    public static void test03(){
        LocalDate data = LocalDate.of(2020, 12, 28);
        DateTimeFormatter now = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String format = now.format(data);
        System.out.println(format);
    }
}
