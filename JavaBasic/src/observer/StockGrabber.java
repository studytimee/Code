package observer;

import java.util.ArrayList;


public class StockGrabber implements Subject{

	ArrayList<Observer> observer;
	private double ibmPrice;
	private double applPrice;
	private double googPrice;
	
	public StockGrabber()
	{
		observer = new ArrayList<Observer>();
	}
	
	// Register function will register object 
	// pass object in register parameter.
	@Override
	public void register(Observer newObserver) {
		
		observer.add(newObserver);
		
	}

	@Override
	public void un_register(Observer newObserver) {
		int index = observer.indexOf(newObserver);
		observer.remove(index);
	}

	@Override
	public void notifies() {
		
		for(Observer obs: observer)
		{
			obs.update(ibmPrice, applPrice, googPrice);
		}
		
	}
	
	public void setIBMPrice(double newPrice)
	{
		this.ibmPrice = newPrice;
	}
	public void setGOOGPrice(double newPrice)
	{
		this.googPrice = newPrice;
	}
	public void setAPPLPrice(double newPrice)
	{
		this.applPrice = newPrice;
	}
	

}
