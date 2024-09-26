package Lab02;
import java.util.Scanner;

public class Lab_02_B4 {
    public static void ptBacNhat(float a, float b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có 1 nghiệm: " + -b / a);
        }
    };
    public static void ptBacHai(float a, float b, float c){
        if (a == 0) {
            ptBacNhat(b, c);
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép: " + -b / (2 * a));
            } else {
                System.out.println("Phương trình có hai nghiệm phân biệt: ");
                System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
                System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
            }
        }
    };
    public static void tinhTienDien(float soDien) {
        if (soDien < 0) {
            System.out.println("Không hợp lệ");
        } else if (soDien <= 100) {
            float tienPhaiTra = soDien * 1000;
            System.out.println("Tiền phải trả: " + tienPhaiTra);
        } else {
            float tienPhaiTra = 100 * 1000 + (soDien - 100) * 1500;
            System.out.println("Tiền phải trả: " + tienPhaiTra);
        }
    }
    
    public static void tinhNang1() {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a = sc.nextFloat();
        System.out.println("Nhập b: ");
        float b = sc.nextFloat();
        ptBacNhat(a, b);
        sc.close();  
    };
    public static void tinhNang2() {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a = sc.nextFloat();
        System.out.println("Nhập b: ");
        float b = sc.nextFloat();
        System.out.println("Nhập c: ");
        float c = sc.nextFloat();
        ptBacHai(a, b, c);
        sc.close();
    };
    public static void tinhNang3() {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG 3 <<");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện: ");
        float soDien = sc.nextFloat();
        tinhTienDien(soDien);
        sc.close();
    };
    public static void main(String[] args) {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        Scanner sc = new Scanner(System.in);
        int luaChon = sc.nextInt();

        switch (luaChon) {
            case 1:
                tinhNang1();
                break;
            case 2:
                tinhNang2();
                break;
            case 3:
                tinhNang3();
                break;
            default:
                System.out.println("Bạn đã thoát chương trình.");
                System.exit(0);
        };

        sc.close();
    }
}
