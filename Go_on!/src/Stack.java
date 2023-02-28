import java.util.ArrayList;

public class Stack <T>{
	private  ArrayList<T> Elements;
	Stack(){
		this(10);
	}
	public Stack(int i) {
		// TODO Auto-generated constructor stub
		int capacity= i<1?10:i;
		Elements=new ArrayList<T>(capacity);
		
	}
	public void push(T element) {
		Elements.add(element);
	}
	public T pop() throws ExceptionindexoutofBound {
		T elmnt;
		if(!Elements.isEmpty())
		elmnt=Elements.remove(Elements.size()-1);
		else {
			throw new ExceptionindexoutofBound();
		}
		return elmnt;
	}

}
