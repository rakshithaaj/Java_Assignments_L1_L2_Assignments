package level2;


		import java.util.ArrayList;
		import java.util.List;

		public class IterateListWithLambda {
		    public static void main(String[] args) {
		        List<Integer> numbers = new ArrayList<>();
		        numbers.add(1);
		        numbers.add(2);
		        numbers.add(3);
		        numbers.add(4);
		        numbers.add(5);

		        // Using a lambda expression to iterate through the list
		        numbers.forEach(number -> System.out.println(number));
		    }
		


	}


