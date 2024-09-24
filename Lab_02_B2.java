import java.util.Scanner;

public class Lab_02_B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a = sc.nextFloat();
        System.out.println("Nhập b: ");
        float b = sc.nextFloat();
        System.out.println("Nhập c: ");
        float c = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co 1 nghiem: " + -c / b);
            }
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co 1 nghiem kep: " + -b / (2 * a));
            } else {
                System.out.println("Phuong trinh co 2 nghiem phan biet: ");
                System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
                System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
            }
        }

        sc.close();

    }
}
