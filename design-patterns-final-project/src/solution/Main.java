package solution;

import solution.Commands.Command;
import solution.Commands.StandUpCommand;
import solution.Commands.LayDownCommand;

public class Main {
	public static void main(String[] args) {
		FitnessInstructor fitnessInstructor = new FitnessInstructor();
		
		AbstractFactory commandFactory = AbstractFactory.getFactory(Constants.HOME_FITNESS_FACTORY);
		
		Command layDown = commandFactory.getCommand(Constants.LAYDOWN_COMMAND);
		Command standUp = commandFactory.getCommand(Constants.STANDUP_COMMAND);
		
		fitnessInstructor.setCommand(standUp);
		fitnessInstructor.giveExercise();
		
		fitnessInstructor.setCommand(layDown);
		fitnessInstructor.giveExercise();
	}

}
