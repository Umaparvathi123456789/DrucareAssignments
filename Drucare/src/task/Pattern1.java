package task;


public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  for (int i = 5; i >= 1; i -= 2) {
		        for (int j = 1; j <= i; j++) {
		            System.out.print("*");
		        }
		        System.out.println();
		    }
		    
		    // Lower half of the pattern
		    for (int i = 3; i <= 5; i += 2) {
		        for (int j = 1; j <= i; j++) {
		            System.out.print("*");
		        }
		        System.out.println();
		    }
	}

}
