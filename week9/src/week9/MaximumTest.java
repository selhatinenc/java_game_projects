package week9;

public class MaximumTest {

	public static void main(String[] args) 
	{
		int x = (Integer)maximum(3, 4, 5);
		System.out.println("Maximum of 3,4,5 is " + x);
		System.out.println("Maximum of 6.6,8.8, 7.2 is " + maximum(6.6, 8.8, 7.2));
		System.out.println("Maximum of pear, apple, orange is " + maximum("pear", "apple", "orange"));
	}

	/*public static <T extends Comparable<T>> T maximum(T x, T y, T z)
	{
		T max = x; 
		
		if(y.compareTo(max) > 0)
			max = y;
		
		if(z.compareTo(max) > 0)
			max = z;
		
		return max;
		
	}*/
	
	public static Comparable maximum(Comparable x, Comparable y, Comparable z)
	{
		Comparable max = x; 
		
		if(y.compareTo(max) > 0)
			max = y;
		
		if(z.compareTo(max) > 0)
			max = z;
		
		return max;
		
	}
}
