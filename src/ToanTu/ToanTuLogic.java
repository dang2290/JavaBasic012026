package ToanTu;

public class ToanTuLogic {
    public static void main(String[] args) {

        //Toán tử && (and) -> Chỉ đúng khi tất cả đều đúng
        int age = 18;
        boolean hasID = true;
        String  address = "Hà Nội";

        if (age >= 18 && hasID && address.equals("Cần Thơ")) {
            System.out.println("Được phép vào");
        }
        else {
            System.out.println("Không được truy cập");
        }

        String alertMessage = "Category has been inserted successfully";
        String alertMessageActual = "Get form Selenium";
        String categoryName = "Get form Selenium";
        if (alertMessageActual.equals(alertMessage) && categoryName.equals("Category 01"))
        {
            System.out.println("add new category success");
        }

        // Toán tử || (or)-> chỉ cân một điều kiện đúng là true
        boolean isAdmin = false;
        boolean isManager = true;

        if (isAdmin || isManager) {
            System.out.println("Có quyền truy cập");
        }

        // Toán tử ! (NOT)
        boolean isActive = false;

        if (!isActive) {
            System.out.println("Tài khoản chưa kích hoạt");
        }

        if (!(age > 20))
        {
            System.out.println("Được xét đi NVQS");
        }
        else {
            System.out.println("không xét đi NVQS");
        }

        // Toán tử gán
        int number1,number2;
        number1= number2 = 5;
        System.out.println(number1 + number2);

        // Thứ tự ưu tiên
        int a = 20;
        int b = 5;
        int c = 10;

        System.out.println("a + b * c   = " + (a + b * c));
        System.out.println("(a + b) * c = " + ((a + b) * c));
        System.out.println("a / b - c   = " + (a / b - c));
        System.out.println("a / (b - c) = " + (a / (b - c)));


    }
}
