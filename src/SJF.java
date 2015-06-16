import java.util.*;
class SJF
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,BT[],WT[],TAT[];
		
		System.out.println("Enter number of process");
		n=sc.nextInt();
		BT=new int[n+1];
		WT=new int[n+1];
		TAT=new int[n+1];
		
		float AWT=0;
		float ATAT=0;
		
		System.out.println("Enter burst time");
		for(int i=0;i<n;i++)
		{
			System.out.println("Burst time for P"+(i+1)+"=");
			BT[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			WT[i]=0;
			TAT[i]=0;
		}
		
		//sorting process queue by burst time
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{ 
				if(BT[j]>BT[j+1])
				{
					temp=BT[j];
					BT[j]=BT[j+1];
					BT[j+1]=temp;
					
					temp=WT[j];
					WT[j]=WT[j+1];
					WT[j+1]=temp;
				}
			}
		}
			
		for(int i=0;i<n;i++)
		{
			TAT[i]=BT[i]+WT[i];
			WT[i+1]=TAT[i];
		}
		TAT[n]=WT[n]+BT[n];
		
		//print outputs
		System.out.println("Process\tBurst time\tWaiting time\tTurn Around time");
		
		for(int i=0;i<n;i++)
		{
			System.out.println("P" + (i+1) + "\t\t" + BT[i] + "\t\t" + WT[i]
				+ "\t\t" + TAT[i]);
		}
		for(int j=0;j<n;j++)
		{
			AWT+=WT[j];
		}
		AWT=AWT/n;
		for(int j=0;j<n;j++)
		{
			ATAT+=TAT[j];
		}
		ATAT=ATAT/n;
		
		System.out.println("Average Waiting time=" + AWT);
		System.out.println("Average Turn Around time=" + ATAT);
	}
}