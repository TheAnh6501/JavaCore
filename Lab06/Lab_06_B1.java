package Lab06;

import java.util.Scanner;

public class Lab_06_B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào username: ");
        String username = sc.nextLine();
        
        System.out.println("Nhập vào password: ");
        String password = sc.nextLine();

        // Kiểm tra username và password
        if (username.equals("admin") && password.length() >= 8) {
            System.out.println("Dữ liệu đúng");
        } else {
            System.out.println("Dữ liệu sai");
        }

        sc.close();
    }
}
