import java.util.Scanner;

public class Lab_02_B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float soDien = sc.nextFloat();
        if (soDien < 0){
            System.out.println("Không hợp lệ");
        } else if (soDien <= 100){
            Float tienPhaiTra = soDien * 1000;
            System.out.println("Tiền phải trả: " + tienPhaiTra);
        } else {
            Float tienPhaiTra = 100 * 1000 + (soDien - 100) * 1500;
            System.out.println("Tiền phải trả: " + tienPhaiTra);
        }

        sc.close();
    }
}
