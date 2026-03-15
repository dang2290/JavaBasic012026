package XuLyChuoiString;

import javax.sound.midi.Soundbank;

public class XuLyChuoi {
    public static void main(String[] args) {
        String str1 = "Selenium java - web Test Automation";
        String Str2 = "Playwright Java - Web&API test automaiton";

        System.out.println(str1.charAt(14));// bắt đầu vị trí 0
        System.out.println(str1.length());
        System.out.println(str1.substring(16));
        System.out.println(str1.substring(16,19));

        System.out.println(str1.contains("Selenium"));
        System.out.println(str1.contains("Playwright"));

        System.out.println(str1.equals("Selenium"));
        System.out.println(str1.equals("Playwright"));

        String textTableFooter = "Showing 1 to 25 of 40 entries";


        // lấy so 40 trong chuỗi
        //Cách 1- không ổn định
        System.out.println(textTableFooter.substring(19,21));

        //Cách 2
        String mangGiaTriSauTach[] = textTableFooter.split(" ");
        System.out.println(mangGiaTriSauTach[5]);

        // kiểm tra chuỗi có bị rỗng không
        boolean check = str1.isEmpty();
        System.out.println(check);

        // nối chuỗi lại với nhau
        String str3 = "Thu viện automation: " + "Selenium";
        System.out.println(str3);
        System.out.println(str3.concat(" Playwright"));

        // Thay the chuỗi


    }
}
