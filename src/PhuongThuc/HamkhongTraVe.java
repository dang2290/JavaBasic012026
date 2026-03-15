package PhuongThuc;

public class HamkhongTraVe {
    //Khai báo ham không trả về giá trị dùng lại
    public  void showInfo(){
        String name= "lan";
        String  address = "Đăk lăk";
        System.out.println(name);
        System.out.println(address);
    }

    public  void dispayVersion(){
        String version ="1.0.0";
        System.out.println(version);
    }

    public static void main(String[] args) {
        HamkhongTraVe object1= new HamkhongTraVe();
        object1.showInfo();
        object1.dispayVersion();



    }
}
