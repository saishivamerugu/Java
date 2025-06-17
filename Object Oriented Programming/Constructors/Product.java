package Constructors;

//Create a Product class with multiple constructors for initializing different combinations of product  data.

public class Product {

	String product;
	int price;
	double discount;
	
	public Product() {
		
	}
	
	public Product(String product) {
		this(product,450000,4);
	}
	
	public Product(String product,int price) {
		this(product,price,4);
	}
	public Product(String product,int price,double discount) {
		this.product=product;
		this.price=price;
		this.discount=discount;
	}
	
	public void displayProduct() {
        System.out.println("Product Name: " + product);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount + "%");
    }
	
	public static void main(String[] args) {
		        Product p1=new Product("iPhone");
		        p1.displayProduct();

		        Product p2=new Product("iPhone", 80000);
		        p2.displayProduct();
		        
		        Product p3=new Product("iPhone", 80000, 5);
		        p3.displayProduct();

		        Product p4=new Product();
		        p4.product="iPhone 15 Pro";
		        p4.price=150000;
		        p4.discount=7;
		        p4.displayProduct();
	}
}
