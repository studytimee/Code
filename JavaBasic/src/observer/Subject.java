package observer;
// Observer design pattern in which an object is called subject, 
// matain list of all its dependies, called observer, and notifies them 
// automatically when any state change usually calling one of their method.

public interface Subject {
	public void register(Observer o);
	public void un_register(Observer o);
	public void notifies();
}
