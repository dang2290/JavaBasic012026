package DieuKienIFELSE;

public class CauLenhIFELSE {

  public  void  createBrowser(String browser){
      String browserSystem = System.getProperty("browser");
      if (browserSystem!= null){
          browser = browserSystem;
      }
      System.out.println(browser);
  }

    public static void main(String[] args) {


        String actualCustomerName = "Nga 0112";
        int customerID = 123;
        if (actualCustomerName.equals("Nga 01") && customerID ==123){
            System.out.println("test case add new customer passed 1");
        }else {
            System.out.println("Test case add new customer fail");
        }


//        if (customerID==123){
//            System.out.println("test case add new customer passed 2");
//        }

    }

}
