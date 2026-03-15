package MangMotChieu;

public class DeMoMang {
    public static void main(String[] args) {

        //Khai báo mảng số nguyên 1 chiều
        int mangSoNguyen[] = new int[3]; // độ dài 3 phần tử

        // thêm giá trị vào mảng
        mangSoNguyen[0] = 5;// vị trí bắt đầu 0
        mangSoNguyen[1] = 10;
        mangSoNguyen[2] = 20;
        //mangSoNguyen[3]=30; // vượt ngưỡng dộ dài 3

        // duyệt mảng dùng vòng lặp for
        for (int i = 0; i < mangSoNguyen.length; i++) {
            System.out.println(mangSoNguyen[i]);

        }
        // Khai báo mảng và khởi tạo giá trị cho mảng
        int mang2[] = new  int[]{3,4,5,6,7};
    }
}
