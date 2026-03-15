package SwitchCase;

public class CauLenhSwitchCase {
    public static void main(String[] args) {

        String browser = "Chrome";

        switch (browser) {
            case "Chrome":
                System.out.println("Khởi tạo trình duyệt Chrome");
                break;
            case "Edge":
                System.out.println("Khởi tạo trình duyệt Edge");
                break;
            case "Firefox":
                System.out.println("Khởi tạo trình duyệt Firefox");
                break;
            default:
                System.out.println("Default trình duyệt Chrome");
        }
    }
}
