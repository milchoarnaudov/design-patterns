package solution.Commands;

import solution.Trainee;

public class LayDownCommand implements Command {
	Trainee trainee;
	
	public LayDownCommand(Trainee trainee) {
		this.trainee = trainee;
	}
	
	@Override
	public void execute() {
		String exercise = "Lay Down";
		this.trainee.setExercise(exercise);
	}

}
