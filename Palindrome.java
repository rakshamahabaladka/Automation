package loopingstatements;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 121, rev = 0;
        int n= num;
        while(num!=0) {
        	int digit = num%10;
        	rev = rev*10+digit;
        	num = num/10;
        }
        if(n==rev) {
        	System.out.println("Palindrome number");
        }
        else {
        	System.out.println("Not a plaindrome number");
        }
	}

}
