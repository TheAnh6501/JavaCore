import java.util.Scanner;

public class Lab_03_B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên từ 1 > 10: ");
        int n;
        n = sc.nextInt();
        while (n < 1 || n > 10) {
            System.out.println("Số không hợp lệ, nhập lại: ");
            n = sc.nextInt();
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i + "\n");
        }
            
        sc.close();
    }
}
