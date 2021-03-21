package solution;

import java.util.ArrayList;
import java.util.List;

public class Exercise implements Observable {
	private List<Observer> observers;
	private String exercise;
	
	public Exercise() {
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void subscribe(Observer exerciseSubscriber) {
		this.observers.add(exerciseSubscriber);
		exerciseSubscriber.setExercise(this);
	}

	@Override
	public void unsubscribe(Observer exerciseSubscriber) {
		this.observers.remove(exerciseSubscriber);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.getExercise();
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
		this.notifyObservers();
	}

}
