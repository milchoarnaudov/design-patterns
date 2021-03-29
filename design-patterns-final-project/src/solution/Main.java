package solution;

import solution.Commands.Command;
import solution.Commands.StandUpCommand;
import solution.Commands.LayDownCommand;

public class Main {

	public static void main(String[] args) {
		TraineeSubscriber firstOnlineTrainee = new TraineeSubscriber("Ivaylo");
		TraineeSubscriber secondOnlineTrainee = new TraineeSubscriber("George");
		TraineeSubscriber thirdOnlineTrainee = new TraineeSubscriber("Petar");
		
		Trainee trainee = new Trainee();
		
		trainee.subscribe(firstOnlineTrainee);
		trainee.subscribe(secondOnlineTrainee);
		trainee.subscribe(thirdOnlineTrainee);
		
		FitnessInstructor fitnessInstructor = new FitnessInstructor();
		
		Command standUp = new StandUpCommand(trainee);
		Command layDown = new LayDownCommand(trainee);
		
		fitnessInstructor.setCommand(standUp);
		fitnessInstructor.giveExercise();
		fitnessInstructor.setCommand(layDown);
		fitnessInstructor.giveExercise();
	}

}
