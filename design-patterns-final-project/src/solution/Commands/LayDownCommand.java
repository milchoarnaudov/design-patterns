package solution.Commands;

import solution.Trainee;

public class LayDownCommand implements Command {
	private Trainee trainee;
	private String exercise;
	
	public LayDownCommand(Trainee trainee) {
		this.trainee = trainee;
		this.setExercise("Lay Down");
	}
	
	@Override
	public void execute() {
		this.trainee.setExercise(this.getExercise());
	}

	private String getExercise() {
		return exercise;
	}

	private void setExercise(String exercise) {
		this.exercise = exercise;
	}

	@Override
	public String getCommandName() {
		return this.getExercise();
	}

}
