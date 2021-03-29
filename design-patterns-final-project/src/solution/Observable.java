package solution;

public interface Observable {
	void subscribe(Observer traineeSubscriber);
	void unsubscribe(Observer traineeSubscriber);
	void notifyObservers();
	String getUpdate();
}
