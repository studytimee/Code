package observer;

public class StockObserver implements Observer {
	private Subject stockGrabber;
	public StockObserver(Subject stockGrabber)
	{
		this.stockGrabber = stockGrabber;
		stockGrabber.register(this);
	}
	@Override
	public void update(double IBMPrice, double GOOGPrice, double APPLPrice) {
		// TODO Auto-generated method stub
		
	}

}
