package solution;

import solution.Commands.Command;

public class HomeFitnessFactory extends AbstractFactory{
	
	@Override
	Command getCommand(String command) {
		CommandFactory commandFactory = new CommandFactory();
		
		return commandFactory.createCommand(command);
	}

}
