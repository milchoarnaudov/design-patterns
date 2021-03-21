package solution;

public class ExerciseSubscriber implements Observer {
	private String name;
	private Observable exercise;
	
	public ExerciseSubscriber(String name) {
		this.setName(name);
	}
	
	@Override
	public void update() {
		if(exercise == null) {
			System.out.println(this.getName() + " is not doing an exercise");
			return;
		}
		
		String newExercise = exercise.getUpdate();
		System.out.println(this.getName() + ": has to do a new exercise: " + newExercise);

	}

	@Override
	public void setExercise(Observable exercise) {
		this.exercise = exercise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
