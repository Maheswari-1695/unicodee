package Examples;

public class ExactNumFromStrinAndAdd {
	public static void main(String[] args) {
		String name = "ma25hi1";
		int total = 0;
		int length = name.length();
		for (int i = 0; i < length; i++) {
			char character = name.charAt(i);
			if (Character.isDigit(character)) {
				total = total + Character.getNumericValue(character);

			}
		}
		System.out.println(total);
	}

}
