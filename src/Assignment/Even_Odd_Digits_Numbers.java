package Assignment;

public class Even_Odd_Digits_Numbers {

	public static void main(String[] args) {
		 int number = 23456, evenCount=0, oddCount = 0;
	        while (number > 0) {
	            int digit = number % 10; // Extract the last digit
	            if (digit % 2 == 0) {
	                evenCount++; // Increment even counter if digit is even
	            } else {
	                oddCount++; // Increment odd counter if digit is odd
	            }
	            number = number / 10; // Remove the last digit
	        }

	        System.out.println("Even count: " + evenCount);
	        System.out.println("Odd count: " + oddCount);

	}

}
