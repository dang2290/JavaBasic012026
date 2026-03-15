package StaticJava;


import PhuongThuc.HamCoThamSo;

public class LoginTestCMS {
    public  void  test01_LoginSuccess(){
        System.out.println(ConfigData.browser);
        System.out.println(ConfigData.window_size);

        System.out.println("Test success");

        HamCoThamSo loginpage= new HamCoThamSo();
        loginpage.loginTestValid("dang@gmail","1213");


    }

    public  void  test02_LoginFailWithEmailInvalid(){
        System.out.println(ConfigData.browser);
        System.out.println(ConfigData.window_size);

        System.out.println("Test fail");

        HamCoThamSo loginpage= new HamCoThamSo();
        loginpage.loginTestValid("dang@gmail","5345");

    }
}
