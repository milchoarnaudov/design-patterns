package solution;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {
	private List<Observer> observers;
	private String exercise;
	
	public Trainee() {
		this.observers =  new ArrayList<Observer>();
	}
	
	@Override
	public void subscribe(Observer traineeSubscriber) {
		this.observers.add(traineeSubscriber);
		traineeSubscriber.setTrainee(this);
	}

	@Override
	public void unsubscribe(Observer traineeSubscriber) {
		this.observers.remove(traineeSubscriber);
		traineeSubscriber.setTrainee(null);
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
