/*1.WAP that creats and initializes a 4 element double array. Calculate & display the average of its value.*/

public class AverageArray
{
	double sum,avg;
	AverageArray(double a[])
	{
		for(int i=0;i<4;i++)
		{
			sum+=a[i];
		}
		avg = sum/4;
		
	}
	void show()
	{
		System.out.println("Average =" + this.avg);
	}
	public static void main(String args[])
	{
		
		double arr[]={23.5,34.67,89.67,54.90};
		AverageArray a1 = new AverageArray(arr);
		a1.show();
	}

}