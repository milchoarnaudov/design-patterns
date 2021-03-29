package solution;

public class TraineeSubscriber implements Observer {
	private String name;
	Observable trainee;
	String currentExercise;
	
	public TraineeSubscriber(String name) {
		this.setName(name);
	}
	
	@Override
	public void update() {
		if (trainee == null) {
			System.out.print(this.getName() + " is not watching any trainee");
		}
		
		this.currentExercise = this.trainee.getUpdate();
		this.printUpdatesToConsole();
	}
	
	private void printUpdatesToConsole() {
		System.out.println(this.getName() + " is doing " + this.currentExercise);
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
