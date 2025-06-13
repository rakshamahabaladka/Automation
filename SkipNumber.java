package loopingstatements;

public class SkipNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Print numbers from 1 to 100 skipping multiples of 5
		for(int i =1;i<=100;i++) {
			if(i%5==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
