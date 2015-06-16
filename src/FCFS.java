import java.util.ArrayList;
import java.util.Random;

public class FCFS {

	public static ArrayList<Job> jobList = new ArrayList<Job>();
	public static int[] arrivalArray = new int[20];

	public static void main(String[] args) {
		
		// Fill the arrivalArray
		for (int i = 0; i < 99; i++) {
			arrivalArray[i] = i+1;
		}
		// Add jobs to the jobList
		for (int i = 0; i < 20; i++) {
			Random r = new Random();
			int jobNum = r.nextInt(100);
			if (arrivalArray[jobNum] != 0) {
				jobList.add(new Job("Job " + i, arrivalArray[jobNum], r.nextFloat()))
			}
			

		}
	}

}
