package PhuongThuc;

public class HamCoThamSo {

    public int cong2So(int number1, int number2) {
        return  number1 + number2;

    }
    public  void  loginTestValid(String email, String password){
        System.out.println("Navigate to URL");
        System.out.println("Enter emai: "+ email);
        System.out.println("Enter password: " + password);
        System.out.println("Click button login");
        System.out.println("Verify Login success");
    }
    public  void  loginTestINValid(String email, String password){
        System.out.println("Navigate to URL");
        System.out.println("Enter emai: "+ email);
        System.out.println("Enter password: " + password);
        System.out.println("Click button login");
        System.out.println("Verify Login success");
    }
    public static void main(String[] args) {
        HamCoThamSo object1= new HamCoThamSo();
        System.out.println(object1.cong2So(5,10));
       object1.loginTestValid("dang@gmail.com","123!@#");
       object1.loginTestINValid("dang@gmail.com","123!@#");

    }
}
