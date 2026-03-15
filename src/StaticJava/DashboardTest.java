package StaticJava;


import PhuongThuc.HamCoThamSo;

public class DashboardTest {

    public  void  test01_CheckCustomerTotal(){
        System.out.println(ConfigData.browser);
        System.out.println(ConfigData.window_size);

        System.out.println("Test success");

        HamCoThamSo loginpage= new HamCoThamSo();
        loginpage.loginTestValid("dang@gmail","1213");

        PhuongThucStatic.clickElement("Search input");
        PhuongThucStatic.setText("10","search input");


    }

    public static void main(String[] args) {
        DashboardTest dashboardTest = new DashboardTest();
        dashboardTest.test01_CheckCustomerTotal();
    }
}
