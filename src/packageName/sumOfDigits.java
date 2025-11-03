package packageName;

public class sumOfDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits(123));
		System.out.println(sumDigits(12345));
		System.out.println(sumDigits(954736163));
	}
	
	public static int sumDigits(int num) {
		if (num == 0) {
			return 0;
		}
		int output = (num % 10) + sumDigits(num/10);
		return output;
	}

}
