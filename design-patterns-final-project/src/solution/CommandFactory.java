package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import solution.Commands.Command;
import solution.Commands.LayDownCommand;
import solution.Commands.StandUpCommand;

public class CommandFactory extends AbstractFactory {
	private List<TraineeSubscriber> traineeSubscribers;
	private Trainee trainee;
	
	public CommandFactory() {
		this.traineeSubscribers = new ArrayList<TraineeSubscriber>();
		this.trainee = new Trainee();
		
		this.addOnlineTrainees();
		this.subscribeOnlineTraineesToTrainee();
	}
	
	@Override
	Command getCommand(String command) {
		try {
			String path = "solution.Commands.";
			return (Command) Class.forName(path + command).getConstructor(Trainee.class).newInstance(this.trainee);
		} catch (Exception e) {
			System.out.println("Command not found");
			return null;
		}
	}	
	
	private void addOnlineTrainees() {
		this.traineeSubscribers.add(new TraineeSubscriber("Ivaylo"));
		this.traineeSubscribers.add(new TraineeSubscriber("George"));
		this.traineeSubscribers.add(new TraineeSubscriber("Petar"));
	}
	
	private void subscribeOnlineTraineesToTrainee() {
		for(TraineeSubscriber traineeSubscriber: this.traineeSubscribers) {
			this.trainee.subscribe(traineeSubscriber);
		}
	}
	
}
