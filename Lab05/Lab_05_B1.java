package Lab05;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab_05_B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thực từ bàn phím !!!");
        ArrayList<Double> arr = new ArrayList<Double>();
        while (true) {
            System.out.println("Nhập số: ");
            double n = sc.nextDouble();
            arr.add(n);
            sc.nextLine();
            System.out.println("Nhập thêm ? Y/N");
            String option = sc.nextLine();
            if (option.equals("N")) {
                break;
            }
        }
        System.out.println(arr);
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        System.out.println("Tổng array = " + sum);
        sc.close();
    }
}
