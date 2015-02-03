public class SortList{
	int min,i,a[];
	SortList(int a1[]){
		a=a1;
	}
	void sort(){
		min=a[0];
		for(i=1;i<5;i++){
			
			if (a[i]<min){
				min=a[i];
			} 
		}
	}
}