package solution;

import solution.Commands.Command;

public abstract class AbstractFactory {
	public static AbstractFactory getFactory(String factory) {
		try {
			String path = "solution.";
			return (AbstractFactory) Class.forName(path + factory).getConstructor().newInstance();
		} catch (Exception e) {
			System.out.println("Factory not found");
			return null;
		}
	}
	
	abstract Command getCommand(String command);
}
