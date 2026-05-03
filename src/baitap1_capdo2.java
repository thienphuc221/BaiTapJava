
import java.util.Scanner;

public class baitap1_capdo2 {
    public static double tinhThue(double thuNhap) {
        double thue = (double)0.0F;
        if (thuNhap <= (double)5.0F) {
            thue = thuNhap * 0.05;
        } else if (thuNhap <= (double)10.0F) {
            thue = (double)0.25F + (thuNhap - (double)5.0F) * 0.1;
        } else if (thuNhap <= (double)18.0F) {
            thue = (double)0.75F + (thuNhap - (double)10.0F) * 0.15;
        } else if (thuNhap <= (double)32.0F) {
            thue = 1.95 + (thuNhap - (double)18.0F) * 0.2;
        } else if (thuNhap <= (double)52.0F) {
            thue = (double)4.75F + (thuNhap - (double)32.0F) * (double)0.25F;
        } else if (thuNhap <= (double)80.0F) {
            thue = (double)9.75F + (thuNhap - (double)52.0F) * 0.3;
        } else {
            thue = 18.15 + (thuNhap - (double)80.0F) * 0.35;
        }

        return thue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thu nhập hàng năm (triệu đồng): ");
        double thuNhap = scanner.nextDouble();
        if (thuNhap < (double)0.0F) {
            System.out.println("Thu nhập không hợp lệ!");
        } else {
            double thue = tinhThue(thuNhap);
            System.out.printf("Thu nhập: %.2f triệu đồng%n", thuNhap);
            System.out.printf("Thuế phải trả: %.2f triệu đồng%n", thue);
        }

        scanner.close();
    }
}
