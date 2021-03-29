package solution;

import solution.Commands.Command;

public class FitnessInstructor {
	private Command currentCommand;
	
	public void setCommand(Command command) {
		this.currentCommand = command;
	}
	
	public void giveExercise() {
		System.out.println("The Fitnes Intructor gave a new exercise - " + this.currentCommand.getCommandName());
		this.currentCommand.execute();
	}
	
}
