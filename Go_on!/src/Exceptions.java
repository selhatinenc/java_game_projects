class ExceptionA extends Exception {}
class ExceptionB extends Exception {}
class ExceptionC extends RuntimeException {}

public class Exceptions {
	public double methodf(int i) throws ExceptionA, ExceptionB {
		
		double sqrt=Math.sqrt(i);
		return sqrt;
	}
	public double methodg() {
		try {
			return 2*methodf(0);
		} catch (ExceptionA e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} catch (ExceptionB e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 1;
		}
		catch (Exception e) {
return 0;}
	}
}
