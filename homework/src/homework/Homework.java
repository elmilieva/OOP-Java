package homework;

public class Homework {

	public static int maxMethod(int a, int b, int c) {
		int max = a;

		if (b > max) {
			max = b;
		}

		if (c > max) {
			max = c;
		}

		return max;
	}

	public static int minMethod(int a, int b, int c) {
		int min = a;

		if (b < min) {
			min = b;
		}

		if (c < min) {
			min = c;
		}

		return min;
	}

	public static int sumMethod() {
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
		}

		return sum;
	}

	// po uslovie nqma limit, za tova sum slojila 10 poneje stavat mnogo golemi
	// chislata
	public static int productMethod() {
		int product = 1;
		int i = 2;

		while (i <= 10) {
			product = product * i;
			i = i + 2;
		}

		return product;
	}

	public static int sum2Method() {
		int sum = 0;
		int i = 0;

		do {
			i++;
			sum = sum + i;
		} while (sum <= 100);

		return i;
	}

	public static void variablesMethod(int x) {
		int a = x % 10;
		x = x / 10;
		int b = x % 10;
		x = x / 10;
		int c = x % 10;
		x = x / 10;
		int d = x % 10;
		x = x / 10;
		int e = x % 10;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

	public static double formulaMethod(int a, int b, int c, int h, int x, int y) {
		double result = (a * (b + c) - ((a * b) - (b * c))) / (h * ((x * x) + (y * y)));

		return result;
	}

	public static void main(String[] args) {
		System.out.println("maxMethod(23, -24, 24): " + maxMethod(23, -24, 24));
		System.out.println("minMethod(23, -24, 24): " + minMethod(23, -24, 24));
		System.out.println("sumMethod(): " + sumMethod());
		System.out.println("productMethod(): " + productMethod());
		System.out.println("sum2Method(): " + sum2Method());
		System.out.println("variablesMethod(34567): ");
		variablesMethod(34567);
		System.out.println("formulaMethod(1, 2, 3, 4, 5, 6): " + formulaMethod(1, 2, 3, 4, 5, 6));
	}

}
