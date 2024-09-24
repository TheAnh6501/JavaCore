import java.util.Arrays;
import java.util.Scanner;

public class Lab_03_B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        };
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Phần tử nhỏ nhất là: " + arr[0]);
        System.out.println("Phần tử lớn nhất là: " + arr[n - 1]);

        sc.close();
    }
}
