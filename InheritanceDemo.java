class InheritanceDemo{
public static void main(String[] args) {
	N n = new N();
	System.out.println("d = "+ n.d + "f = " +n.f+" s = "+ n.s);
	}
}
class M extends Object{
	float f = 1.11f;
	String s = "fabulous";
}
class N extends M{
	double d =44.44;
}