package loopingstatements;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 12345,digit;
        int count = 0;
        int n = num;
        while(num != 0) {
        	digit = num%10;
        	count++;
        	num = num/10;
        }
        System.out.println("Count of digits in "+n+" is "+count);
	}

}
