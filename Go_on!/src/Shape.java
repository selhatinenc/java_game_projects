
public  interface Shape {
	 void draw(int a);
 double pi= 3.14;
 private int a=3;
}
 class RightTriangle implements Shape {
	// .....
	 
	public void draw(int a) {
	for (int line = 1; line <= a; line++) {
	for (int i = 0; i < line; i++) {
	System.out.print("*");
	}
	System.out.println();
	}
	}
	}
