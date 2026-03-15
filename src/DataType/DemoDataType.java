package DataType;


public class DemoDataType {
    public static void main(String[] args) {

        String name = "Selenium Java";
        String gioiTinh = "Nam";
        String shortName = "ksdfsfsfs";

        char kitu1 = '#';
        char kitu2 = '@';
        char kitu3 = '&';

       // Kiêu dữ liệu chỉ lưu số Nguyên
        byte number1 = 127;
        short number2 = 32000;
        int number3 = 2100000000;
        long number4 = 3000000000L;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

        // Kiểu dữ liệu lưu số thực
        float laiSuatNganHang =5.2F;
        double soPi  = 3.12456565;
        System.out.println(laiSuatNganHang);
        System.out.println(soPi); // thường dùng trong test automation

        // Kiểu dữ liệu đúng sai
        boolean check = true;
        boolean result = false;
        String actual = "login success";
        String expected = "login success";
        boolean checkCondition = actual.equals(expected);
        System.out.println(checkCondition);

        // Kiểu ký tự
        char kiTu = 'a';
        char isDeleted = '1';


    }


}
