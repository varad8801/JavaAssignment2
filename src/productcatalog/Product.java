package productcatalog;

import java.util.Scanner;



public class Product {
String name;
int price;
int quantity;
public Product(String name, int price, int quantity) {
	super();
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
Product(){
	
}
@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
}

public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number of Products");

		int n=sc.nextInt();
		Product[] product=new Product[n];
		
		for(int i=0;i<n;i++) {
			int b=i+1;
			System.out.println("Enter Name, price and quantity respectively for car "+ b);
			
			String name=sc.next();
			int price=sc.nextInt();
			int quantity=sc.nextInt();;
			product[i]=new Product(name, price, quantity);
				
		}
		for(Product p:product) {
			System.out.println(p.toString());
		}
	}

}

}
