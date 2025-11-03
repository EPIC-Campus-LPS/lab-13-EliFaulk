package packageName;

public class euclid {

	public static void main(String[] args) {
		System.out.println(Euclid(5,10));
		System.out.println(Euclid(35,7));
		System.out.println(Euclid(1071, 462));
		System.out.println(Euclid(1386, 3213));

	}
	
	public static int Euclid(int a, int b) {
		if (b > a) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (a % b == 0) {
			return b;
		}
		int output = Euclid(b, a % b);
		return output;
	}

}
