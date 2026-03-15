package StaticJava;

public class BienStatic {
    public String email = "admin@example.com";// phải khởi tạo đối trượng class để sửa dụng trong hàm static

    public  static  String password = "1234"; // Biến static không cần khởi tạo đối tượng class, gọi đươc trực tiếp trong hàm static hoạc gọi được thông qua tên class

    public static void main(String[] args) {

        BienStatic object1 = new BienStatic();
        System.out.println(object1.email);

        System.out.println(password);

        System.out.println(ConfigData.browser);


    }
}
