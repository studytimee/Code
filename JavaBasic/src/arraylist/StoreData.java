package arraylist;

import java.util.ArrayList;

public class StoreData {
	ArrayList<Integer> data = new ArrayList<Integer>();
	

	
	public void store(int newdata) {
		
		data.add(newdata);
		
	}
	
	public int getData()
	{	
		return data.get(0);
	}
	
}
