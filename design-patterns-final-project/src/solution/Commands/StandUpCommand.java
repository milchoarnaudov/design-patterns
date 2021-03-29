package solution.Commands;

import solution.Trainee;

public class StandUpCommand implements Command {
	Trainee trainee;
	
	public StandUpCommand(Trainee trainee) {
		this.trainee = trainee;
	}
	
	@Override
	public void execute() {
		String exercise = "Stand up";
		this.trainee.setExercise(exercise);
	}

}
