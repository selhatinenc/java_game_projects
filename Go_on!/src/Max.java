public class Max {
	int a;
	public  <T extends Comparable<T>> T max(T x,T y,T z) {
		System.out.println(a);
		if(y.compareTo(x)>0)
			x=y;
		if(z.compareTo(x)>0)
			x=z;
		System.out.println(z);
		return x;
		
	}
	public   Comparable maximum(Comparable x,Comparable y,Comparable z) {
		System.out.println(a);

		if(y.compareTo(x)>0)
			x=y;
		if(z.compareTo(x)>0)
			x=z;
		return x;
		
	}
}