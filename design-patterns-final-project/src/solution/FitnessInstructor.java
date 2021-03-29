package solution;

import solution.Commands.Command;

public class FitnessInstructor {
	private Command currentCommand;
	
	public void setCommand(Command command) {
		this.currentCommand = command;
	}
	
	public void giveExercise() {
		this.currentCommand.execute();
	}
	
}
