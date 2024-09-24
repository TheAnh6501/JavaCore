import java.util.Scanner;

public class Lab_01_B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của sinh viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm: ");
        Float diem = sc.nextFloat();
        System.out.println(name + " có điểm " + diem);
        sc.close();
    }
}
