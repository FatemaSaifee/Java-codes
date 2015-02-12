public class SortList{
	int min,i,a[];
	SortList(int a1[]){
		a=a1;
	}
	void sort(){
		for(int j = 0; j<a.length;j++)
		{
			
			for(i=0;i<a.length;i++){
				
				if (a[j]<a[i])
					{
						int temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
			}
			 
		}
	}
	void show(){
		for (i=0;i<a.length ;i++ ) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int arr[] ={12,45,67,23,110};
		SortList l = new SortList(arr);
		l.sort();
		l.show();
	}
}