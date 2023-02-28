import java.util.ArrayList;
import java.util.HashMap;

public class EnchancedMap <T>  {
	HashMap<T,ArrayList<T>> hashmap;
	public EnchancedMap() {
		hashmap=(HashMap<T, ArrayList<T>>) new HashMap<T,T>() ;
	}
	public void  add (T name,T score) {
		if(hashmap.containsKey(name)){
			ArrayList<T> list= new ArrayList<T>();;
			list.add(score);
			hashmap.put(name, list);       }
		else {
			ArrayList<T> list2=hashmap.get(name);
			hashmap.remove(name);
			list2.add(score);
			hashmap.put(name,list2 );
		}
		}
	public ArrayList<T> get(T name){
		return  hashmap.get(name);
	}
	public double getMean(T name) {
		double total=0;
		for (T d : hashmap.get(name)) {
			total=total+(double)d ;
		}
		return total/hashmap.get(name).size();
		
	}
	
	
	
}
