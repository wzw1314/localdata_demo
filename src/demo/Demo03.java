package demo;

import java.io.FileInputStream;

public class Demo03 {
    public static void main(String[] args) {
        read();
    }

    public static void read() {
        try (FileInputStream inputStream = new FileInputStream("d://a.txt")) {
            byte[] buf = new byte[1024];
            int length;
            while ((length = inputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
