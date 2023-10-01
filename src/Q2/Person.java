package Q2;
public class Person {
	private String Name;
	private Car car;
	
	
	


	


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Car car=new Car();
		car.setMake(9989);
		car.setModel("Volvo");
		car.setYear(1998);
		car.setMileage(22.6);
		car.setFuel_level(50);
		p1.setName("Goku");
		p1.setCar(car);
		System.out.println(p1.toString());

		Person p2=new Person();
		Car car2=new Car();	
		car2.setMake(99893);
		car2.setModel("Vol3vo");
		car2.setYear(19983);
		car2.setMileage(223.6);
		car2.setFuel_level(530);
		p2.setName("Gohan");
		p2.setCar(car2);
		System.out.println(p2.toString());
		
		
		
	}


	@Override
	public String toString() {
		return "Person [Name=" + Name + ", car=" + car + "]";
	}

}
