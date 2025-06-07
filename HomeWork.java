package conditionalstatements;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int maths = 92, science = 77, english = 32;
        int avg = 0;
        
        avg = (maths+science+english)/3;
        System.out.println("Average is "+ avg);
        
        if (avg >= 90 && avg <= 100) {
        	System.out.println("Grade A+");
        	System.out.println("Excellent performance");
        }
        else if (avg >= 75 && avg<= 89 ) {
        	System.out.println("Grade A");
        	System.out.println("Excellent performance");
        }
        else if(avg >= 60 && avg <= 74) {
        	System.out.println("Grade B");
        	System.out.println("Keep improving");
        }
        else if(avg >=40 && avg <= 59) {
        	System.out.println("Grade C");
        	System.out.println("Keep improving");
        }
        else if(avg<40) {
        	System.out.println("Fail");
        	System.out.println("Please work harder next time");
        }
        if (maths <35 || science <35 || english <35) {
        	System.out.println("Failed due to low score in at least one subject");
        }
	}

}
