/*.Write a program that computes the area of a triangle. The sides of triangle should be given interactively through the keyboard(command line argument).*/

public class TriangleArea
{
	double b,h;
	TriangleArea(double b1,double h1){
		b=b1;
		h=h1;
	}
	void area()
	{

		double a;
		a=(b*h)/2;
		System.out.println("Area of triangle = " + a);

	}
	public static void main(String[] args) {
		if(args.length!=2){
			System.out.println("Pass exactly 2 arguments");

		}
		else{
			double b= Double.parseDouble(args[0]);
			double h= Double.parseDouble(args[1]);
			TriangleArea ta = new TriangleArea(b,h);
			ta.area();
		}
	}
}