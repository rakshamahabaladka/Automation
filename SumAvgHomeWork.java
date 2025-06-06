package myfirstpackage;

public class SumAvgHomeWork {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maths = 95, science = 98, english = 90;
		int sum = 0;
		float avg = 0;
		sum = maths+science+english;
		avg = sum/3;
		
		System.out.println("Sum is "+ sum);
		System.out.println("Average is "+ avg);
		System.out.println("Average is "+ (int)avg);
}
}