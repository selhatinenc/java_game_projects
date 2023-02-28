
public class Human {
	String name;
	int age;
	double weight;
	Human(String name,int age,double weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
		
	}
	void drink() {
		System.out.println(this.name+"is eating somethings");
		System.out.println("please don't disturb it");
	}
	void eat() {
		System.out.println(this.name+"is drinking something");
		
	}
	void walk() {
		System.out.println(this.name+"("+this.age+")"+"is walking");
		
	}
	void read() {
		System.out.println(this.name+"is reading book"+"(clever people)");
}
}