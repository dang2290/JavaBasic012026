package Variables;

public class DemoVariable2 {

    public String name = "Đăng";// Biến tòa cục (instance)-> có phạm vi truy cập

    public  static  int age = 36;// Biến static -> dùng để lưu trữ giá trị sử dụng trong hàm static

    // Cấu trúc của 1 hàm
    public void getInfor1(){
        String address = "Hồ Chí Minh";// Biến local-> không có phạm vi truy cập
        System.out.println(address);
        System.out.println(name);

    }

    public void getInfor2(){
        String address = "Hà Nội";// Biến local
        System.out.println(address);
        System.out.println(name);

    }
    public static void main(String[] args) {
        System.out.println(age); // gọi trực tiếp
        System.out.println(DemoVariable2.age);// gọi thông qua tên class

        // Phải thông qua đối tượng class thì mới sủ dụng được biến tòa cục trong hàm main
        DemoVariable2 demo2 = new DemoVariable2();
        demo2.getInfor1();
        demo2.getInfor2();

    }
}
