package solution;

import solution.Commands.Command;

public abstract class AbstractFactory {
	abstract Command getCommand(String command);
}
