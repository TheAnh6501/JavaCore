package Lab04;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product(){

    }

    public Product(String name, Double price, Double tax){
        this.name = name;
        this.price = price;
        this.tax = tax;
    }
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getTax(){
        return tax;
    }
    
    public Product nhapThongTin(String name, double price, double tax){
        Product product = new Product(name, price, tax);
        return product;
    }
    
    public void xuatThongTin(Product product){
        System.out.println("Name of product: " + product.getName());
        System.out.println("Price of product: " + product.getPrice());
        System.out.println("Tax of product: " + product.getTax());

    }

    public double getTaxPrice(double price, double tax){
        return price * tax; 
    }
}
