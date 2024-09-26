package Lab01;
import java.util.Scanner;

public class Lab_01_B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        float dai = sc.nextFloat();
        System.out.println("Nhập chiều rộng: ");
        float rong = sc.nextFloat();
        ////////////////////////////////////////
        float chuVi = (dai + rong) * 2;
        float dienTich = dai * rong;
        float temp = Math.min(dai, rong);
        // if (dai > rong) {
        //     temp = rong;
        // } else if (dai < rong) {
        //     temp = dai;
        // } else {
        //     temp = dai;
        // }
        ////////////////////////////////////////
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
        System.out.println("Cạnh nhỏ nhất là: " + temp);
        sc.close();
    }    
}
