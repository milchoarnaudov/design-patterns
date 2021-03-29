package solution.Commands;

import solution.Trainee;

public class StandUpCommand implements Command {
	private Trainee trainee;
	private String exercise;
	
	public StandUpCommand(Trainee trainee) {
		this.trainee = trainee;
		this.setExercise("Stand up");
	}
	
	@Override
	public void execute() {
		this.trainee.setExercise(getExercise());
	}

	public String getExercise() {
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
