package empDetails;

public class CountOfOddNumber {
	public static void main (string [] args) {
		int count =0;
		for (int i =1; i<= 100; i++) {
			if (i % 2 == 1) {
				count = count + 1;
			
			}
		}
		System.out.println(count);
	}
}
