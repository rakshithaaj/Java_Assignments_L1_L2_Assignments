package level1;

public class StringReversal {
    public static void main(String[] args) {
        String input = "APPLE";
        
        
        String reversed = reverseString(input);
        
        
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
    
    public static String reverseString(String input) {
        
        char[] charArray = input.toCharArray();
        
        
        int start = 0;
        int end = charArray.length - 1;
        
        
        while (start < end) {
            // Swap characters at positions start and end
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            
            
            start++;
            end--;
        }
        
        
        return new String(charArray);
    }
}

		
		

	


