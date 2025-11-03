package packageName;

public class binaryRepresentation {

	public static void main(String[] args) {
		System.out.println(toBinary(0));
		System.out.println(toBinary(1));
		System.out.println(toBinary(5));
		System.out.println(toBinary(10));
		System.out.println(toBinary(42));
	}
	
	public static String toBinary(int n) {
		if (n == 0) {
			return "";
		}
		String output = toBinary(n / 2) + n%2;
		return output;
	}

}
