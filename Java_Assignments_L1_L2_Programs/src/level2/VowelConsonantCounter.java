package level2;

public class VowelConsonantCounter {

	public static void main(String[] args) {

		  
		         String input = "Hello, world!";
		        input = input.toLowerCase(); // Convert the string to lowercase for case-insensitive counting

		        int vowelsCount = 0;
		        int consonantsCount = 0;

		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i);
		            if (c >= 'a' && c <= 'z') {
		                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		                    vowelsCount++;
		                } else {
		                    consonantsCount++;
		                }
		            }
		        }

		        System.out.println("Number of vowels: " + vowelsCount);
		        System.out.println("Number of consonants: " + consonantsCount);
		    }
		


	}


