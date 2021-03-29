package solution;

import java.lang.reflect.InvocationTargetException;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		try {
			String path = "solution.";
			return (AbstractFactory) Class.forName(path + factory).getConstructor().newInstance();
		} catch (Exception e) {
			System.out.println("Factory not found");
			return null;
		}
	}
}
