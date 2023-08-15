package level1;

public class AddwithoutPlusOperator {

	public static void main(String[] args) {
				        int a = 5;
		        int b = 7;
		        int sum = add(a, b);
		        
		        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
		    }
		    
		    public static int add(int a, int b) {
		        while (b != 0) {
		            int carry = a & b;
		            a = a ^ b;
		            b = carry << 1;
		        }
		        
		        return a;
		    }
		


	}


