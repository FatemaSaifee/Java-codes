public class SevenOccurence
{

  int n,cnt;
  SevenOccurence(int n1)
  {
  	n=n1;
  }
  void count()
  {
  	int i=0,a;
  	while(this.n!=0)
  	{
  		a=this.n%10;
  		this.n/=10;
  		if(a == 7)
  		{
  			this.cnt++; 
  		}
  		i++;
  	}
  }
  void show()
  {
  	this.count();
  	System.out.println("The count of seven is: " + this.cnt);
  }
 
  	
  
  public static void main(String[] args) {
  	SevenOccurence s1= new SevenOccurence(7787878);
  	s1.show();
  	SevenOccurence s2 = new SevenOccurence(77878777);
  	s2.show();

  }


}