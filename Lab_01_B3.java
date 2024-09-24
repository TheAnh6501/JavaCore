import java.util.Scanner;

public class Lab_01_B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh khối lập phương: ");
        float a = sc.nextFloat();
        double theTich = Math.pow(a, 3);
        System.out.println("Thể tích: " + theTich);
        sc.close();
    }
}
