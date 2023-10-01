
public class ElectricCar extends Car {

	private int battery_size; 
	public int getBattery_size() {
		return battery_size;
	}

	public void setBattery_size(int battery_size) {
		this.battery_size = battery_size;
	}

	void display() {
		
		System.out.println("Model is: "+ getModel() );
		System.out.println("Make is: "+ getMake() );
		System.out.println("BatterySize is: "+ getBattery_size() );
		System.out.println("Number of cars : "+ getNum_cars() );

	}
	
	void start_engine() {
		System.out.println("Electric Motor Started");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar ec=new ElectricCar();
		ec.setModel("Tesla");
		ec.setMake(2089);
		ec.setYear(7727);
		ec.setBattery_size(2085);
		ec.setFuel_level(50);
		ec.setMileage(60.5);
		ElectricCar ec2=new ElectricCar();

		ec.display();
		System.out.println("Fuel Level is: "+ec.getFuel_level());
		System.out.println("Mileage is: "+ec.getMileage());
		ec.start_engine();
		System.out.println(ec.toString());
		
		
		
	}

}
