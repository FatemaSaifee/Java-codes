import mypkg.*;
class Flat extends House implements Area, Cost{
	int cost;
	Flat(int l,int b,int c){
		super(l,b);
		cost = c;
	}
	public void shaowArea(){


		System.out.println("The area is ="+l*b);
	}
	public void showCost(){
		int ar =l*b;
		System.out.println("cost ="+ ar * cost);
	}
	public static void main(String[] args) {
		Flat f = new Flat(134,567,12);
		f.shaowArea();
		f.showCost();
	}
}