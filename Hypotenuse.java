/*.WAP to calculate the hypotenuse of a right triangle whose sides are 4.5 and 8.9 unit long.*/

public class Hypotenuse
{
	double p = 4.5;
	double b = 8.9;
	public static void main(String a[])
	{
		Hypotenuse h1 = new Hypotenuse();
		double h = Math.sqrt(h1.p*h1.p + h1.b*h1.b);
		System.out.println(h);
	}
}