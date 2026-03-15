package PhuongThuc;

public class HamTraVe {

    //Khai báo ham trả về giá trị dùng lại
//    public  void showInfo(){
//        String name= "lan";
//        String  address = "Đăk lăk";
//        System.out.println(name);
//        System.out.println(address);
//    }

    public String getVersion(){
        String version ="1.0.0";
        return version;
    }
    public  int getcategoryTotal(){
        int categoryTatal = 100;
        return categoryTatal;
    }
    public static void main(String[] args) {
        HamTraVe object1= new HamTraVe();
        String version = object1.getVersion();
        System.out.println(version);

    }
}
