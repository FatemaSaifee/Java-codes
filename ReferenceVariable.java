/*3. WAP to illustrate that a reference variable may refer to one object and later refer to different object.*/

public class ReferenceVariable
{
	double a1;
	ReferenceVariable(double a)
	{
		a1=a;
	}
	void show()
	{
		System.out.println("Value" + this.a1);
	}
	public static void main(String args[])
	{
		ReferenceVariable rv;
		double x=13.5;
		double y=45.7;
		ReferenceVariable a1 = new ReferenceVariable(x);
		rv = a1;
		rv.show();
		ReferenceVariable a2 = new ReferenceVariable(y);
		rv = a2;
		rv.show();
	}

}