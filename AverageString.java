public class AverageString{

	public static void main(String[] args) {
		String str[] = {"Amarpreet","Fatema","Kajol","Pranjul","aditi"};
		float sum = 0;
		float avg;
		for(int i=0;i<5;i++){
			sum += str[i].length();
		}
		avg = sum/str.length;
		System.out.println("Average is:" + avg);
	}

}