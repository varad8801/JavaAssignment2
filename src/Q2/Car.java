package Q2;

public class Car {
	private int make;
	private String model;
	private int year;
	private double mileage;
	private int fuel_level;
	private int speed;
	
	
	static void race(int s_car1, int s_car2) {
		if(s_car1>s_car2) {
			System.out.println("Car1 is faster");
		}
		else if(s_car1<s_car2) {
			System.out.println("Car2 is faster");

		}
		else
			System.out.println("Both cars have same speed.");
	}
	
public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}


private	static int num_cars;
	public int getMake() {
		return make;
	}
	public void setMake(int make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public static int getNum_cars() {
		return num_cars;
	}
	public static void setNum_cars(int num_cars) {
		Car.num_cars = num_cars;
	}
	Car(){
		num_cars++;
	}
	void display() {
		System.out.println("Model is: "+ model );
		System.out.println("Make is: "+ make );
		System.out.println("year is: "+ year );
		System.out.println("Number of cars : "+ num_cars );
	
		//System.out.println(make +" "+ model+" "+year+""+num_cars);
	}
	void start_engine() {
		System.out.println("Engine Started");
	}
	
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public int getFuel_level() {
		return fuel_level;
	}
	public void setFuel_level(int fuel_level) {
		this.fuel_level = fuel_level;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", mileage=" + mileage + ", fuel_level="
				+ fuel_level + ", speed=" + speed + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.setMake(9989);
		car.setModel("Volvo");
		car.setYear(1998);
		car.setMileage(22.6);
		car.setFuel_level(50);
		car.setSpeed(200);
		
	//car.display(); 
	//	System.out.println(car.getFuel_level());
		//System.out.println(car.getMileage());
		System.out.println(car.toString());
		
		Car car2=new Car();
		car2.setMake(9989);
		car2.setModel("Volvo");
		car2.setYear(1998);
		car2.setMileage(22.6);
		car2.setFuel_level(50);
		car2.setSpeed(250);

	//	car2.display(); 
		//System.out.println(car2.getFuel_level());
		//System.out.println(car2.getMileage());
		System.out.println(car2.toString());
		
		Car.race(car.getSpeed(), car2.getSpeed());
		
		
		
		
		
		
	}

}
