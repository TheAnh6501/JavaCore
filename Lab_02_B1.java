import java.util.Scanner;

public class Lab_02_B1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        Float a = sc.nextFloat();
        System.out.println("Nhập b: ");
        Float b = sc.nextFloat();
        if (a == 0){
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co 1 nghiem: " + -b / a);
        }

        sc.close();
    }
}