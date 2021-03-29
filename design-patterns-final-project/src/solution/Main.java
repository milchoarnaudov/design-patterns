package solution;

public class Main {

	public static void main(String[] args) {
		TraineeSubscriber firstOnlineTrainee = new TraineeSubscriber("Ivaylo");
		TraineeSubscriber secondOnlineTrainee = new TraineeSubscriber("George");
		TraineeSubscriber thirdOnlineTrainee = new TraineeSubscriber("Petar");
		
		Trainee trainee = new Trainee();
		
		trainee.subscribe(firstOnlineTrainee);
		trainee.subscribe(secondOnlineTrainee);
		trainee.subscribe(thirdOnlineTrainee);
		
	}

}
