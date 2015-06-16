
public class Job {
	
	// Necessary Job Variables
	public String JobName;
	public int ArrivalTime; // Time or Position it arrived
	public float CPUTime; // Time it takes to complete
	public int Priority;
	
	// Extra Variables for Calculation
	public int WaitingTime;
	public int TurnAroundTime;
	
	public Job(String name, int arrival, float cpuTime, int priorityVal) {
		this.JobName = name;
		this.ArrivalTime = arrival;
		this.CPUTime = cpuTime;
		this.Priority = priorityVal;
	}

}
