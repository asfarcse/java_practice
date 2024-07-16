package solidPrinciple.singleResponsiblity;


/**separate class for calculation work*/
class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}
}


/**a separate class for printing result*/
class ResultFormatter {
	public String formatResult(int result) {
		return "Result: " + result;
	}
}

public class SingleResponsiblityExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.add(5, 3); // Perform addition
		ResultFormatter formatter = new ResultFormatter();
		String formattedResult = formatter.formatResult(result); // Format the result
		System.out.println(formattedResult); // Print the formatted result

		result = calculator.subtract(10, 4); // Perform subtraction
		formattedResult = formatter.formatResult(result); // Format the result
		System.out.println(formattedResult); // Print the formatted result
	}
}
