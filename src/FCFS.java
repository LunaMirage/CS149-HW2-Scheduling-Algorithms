import java.util.Random;

public class FCFS {

	public static void main(String[] args) {

		Job[] jobList = new Job[20];
		int[] arrivalArray = new int[100];

		float min = 0.1f;
		float max = 10.0f;
		float avgWait = 0, avgTurnAround = 0;

		// Fill the arrivalArray
		for (int i = 0; i < 99; i++) {
			arrivalArray[i] = i + 1;
		}

		// Add jobs to the jobList
		for (int i = 0; i < 20; i++) {
			Random r = new Random();
			int jobNum = r.nextInt(100);
			if (arrivalArray[jobNum] != 0) {
				jobList[i] = new Job("Job " + i, arrivalArray[jobNum],
						r.nextFloat() * (max - min) + min, 1);
				arrivalArray[jobNum] = 0;
			} else {
				i--;
			}
		}

		// Sort by Arrival Time (Bubble Sort)
		for (int j = 0; j < jobList.length; j++) {
			for (int k = 0; k < jobList.length; k++) {
				if (jobList[j].getArrivalTime() < jobList[k].getArrivalTime()) {
					Job buffer = jobList[j];
					jobList[j] = jobList[k];
					jobList[k] = buffer;
				}
			}
		}

		// Algorithm
		for (int i = 0; i < jobList.length; i++) {
			float waitTime = 0.0f;
			jobList[i].getTurnAroundTime() = jobList[i].getCPUTime() + waitTime;
		}

	}

}
