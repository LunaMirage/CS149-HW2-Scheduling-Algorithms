import java.util.Random;

public class FCFS {

	public static Job[] jobList = new Job[20];
	public static int[] arrivalArray = new int[20];

	static float min = 0.1f;
	static float max = 10.0f;

	public static void main(String[] args) {

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

		// Algorithm
		int wt[] = new int[20];
		wt[0] = 0;
		for (int i = 1; i < 21; i++) {
			wt[i] = jobList[i - 1].getWaitingTime() + wt[i - 1];
			t1 += wt[i];
		}
		int tat[] = new int[p];
		for (int i = 0; i < p; i++) {
			tat[i] = bt[i] + wt[i];
			t2 += tat[i];
		}
		
		System.out
				.println("Process\tBurst time\tWaiting time\tTurn Around time");
		for (int i = 0; i < p; i++) {
			System.out.println("P" + (i + 1) + "\t\t" + bt[i] + "\t\t" + wt[i]
					+ "\t\t" + tat[i]);
		}
		System.out.println("Average Waiting time=" + t1 / p);
		System.out.println("Average Turn Around time=" + t2 / p);

	}

}
