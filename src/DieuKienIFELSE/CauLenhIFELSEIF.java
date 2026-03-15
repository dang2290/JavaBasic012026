package DieuKienIFELSE;

public class CauLenhIFELSEIF {

    public void checkRoleAndMenuDissplay(String role){
        if (role.equals("Admin")){
            System.out.println("Thấy 15 menu");
        }else if (role.equals("Customer")){
            System.out.println("Thấy 5 menu");
        } else if (role.equals("Employe")) {
            System.out.println("Go to home");
        }else {
            System.out.println("Direct to well come page");
        }
    }
    public static void main(String[] args) {
        int marks = 65;

        if (marks < 50) {
            System.out.println("Tạch!");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Xếp loại D");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Xếp loại C");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Xếp loại B");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Xếp loại A");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("Xếp loại A+");
        } else {
            System.out.println("Giá trị không hợp lệ!");
        }
    }
}
