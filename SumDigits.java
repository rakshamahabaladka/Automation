package loopingstatements;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 12345,digit;
        int sum=0;
        int n=num;
        while(num!=0) {
        	digit = num%10;
        	sum = sum+digit;
            num = num/10;
        }
        System.out.println("Sum of digits in "+n+" is "+sum);
	}

}
