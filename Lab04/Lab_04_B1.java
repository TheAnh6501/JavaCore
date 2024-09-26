package Lab04;

public class Lab_04_B1{
    public static void main(String[] args) {
        Product test = new Product();

        Product pr1 = test.nhapThongTin("Computer", 1000, 0.1);
        // test.xuatThongTin(pr1);

        Product pr2 = test.nhapThongTin("Phone", 500, 0.05);
        // test.xuatThongTin(pr2);

        Product pr3 = test.nhapThongTin("Laptop", 2000, 0.15);
        // test.xuatThongTin(pr3);

        System.out.println("Tax price of Computer: " + pr1.getTaxPrice(pr1.getPrice(), pr1.getTax()));
        System.out.println("Tax price of Phone: " + pr2.getTaxPrice(pr2.getPrice(), pr2.getTax()));
        System.out.println("Tax price of Laptop: " + pr3.getTaxPrice(pr3.getPrice(), pr3.getTax()));
    }
}