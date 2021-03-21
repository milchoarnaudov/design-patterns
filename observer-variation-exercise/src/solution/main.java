package solution;

public class main {

	public static void main(String[] args) {
		Exercise exercise = new Exercise();
		
		ExerciseSubscriber ivanFitnessEnthusiast = new ExerciseSubscriber("Ivan");
		ExerciseSubscriber georgiFitnessEnthusiast = new ExerciseSubscriber("Georgi");
		ExerciseSubscriber petarFitnessEnthusiast = new ExerciseSubscriber("Petar");

		exercise.subscribe(ivanFitnessEnthusiast);
		exercise.subscribe(georgiFitnessEnthusiast);
		exercise.subscribe(petarFitnessEnthusiast);
		
		exercise.setExercise("Bench Press");
		exercise.setExercise("Leg Press");
		exercise.setExercise("Squats");
	}

}
