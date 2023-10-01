package carinventory;

import java.util.Scanner;

public class Car {
int make;
String model;
	 int year;
	int price;
	
	Car(){
		
	}
	
	public Car(int make, String model, int year, int price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of cars");

		int n=sc.nextInt();
		Car[] car=new Car[n];
		
		for(int i=0;i<n;i++) {
			int b=i+1;
			System.out.println("Enter make, model, year,Price respectively for car "+ b);
			int make=sc.nextInt();
			String model =sc.next();
				 int year=sc.nextInt();
				int price=sc.nextInt();
			car[i]=new Car(make,model,year,price);
				
		}
		for(Car c:car) {
			System.out.println(c.toString());
		}
	}
}
