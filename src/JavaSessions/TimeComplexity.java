package JavaSessions;

public class TimeComplexity {

	public static void main(String[] args) {

		int i = 10; // only once this line no 7 will be executed
					// TimeComplexity will be O(1)

		// BIG O

		System.out.println(i);// TimeComplexity of line number 12
								// O(1)

		int p = 10 + 20;// O(1) as executed only once

		for (int j = 1; j <= 10; j++) {
			System.out.println(j);// O(10) --- O(n)
									// 10 is denoted by n

			// O(10) = O(n)

			// See the Notes
			// for single for loop Time complexity is O(n)
			// for double for loop Time complexity is O(n^2) --- O of n square
			// for triple for loop Time complexity is O(n^3) --- O of n cube

		}

	}

}
