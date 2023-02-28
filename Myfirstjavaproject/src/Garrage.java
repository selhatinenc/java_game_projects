
public class Garrage {
	Car car;
	Garrage(){
	
	}
	
	void park(Car car) {
		this.car=car;

		System.out.println("the "+this.car.name+" was parked");
	
		}

}
