package Day_7;
import java.util.*;

public class Task2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Question 2: Search for an Element in an Array
		Scenario: A college administrator wants to check whether a particular student roll number exists in a list.

		Task:
		- Create an integer array containing 6 student roll numbers.
		- Search for a given roll number using a loop.
		- If the number exists, display its position; otherwise, display that it was not found.*/
		
		int[] rollNumbers = {101, 102, 103, 104, 105, 106};
		int searchNumber = 104;
		
		  int position = Arrays.binarySearch(rollNumbers, searchNumber);

	        if (position >= 0) {
	            System.out.println("Roll number found at position: " + (position + 1));
	        } else {
	            System.out.println("Roll number not found");
	        }
		
	}

}
