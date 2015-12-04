public class HelloWorld {
	public static void main (String[] args) {
		int n = 0;
		while (n < 10) {
			System.out.println(n);
			n++;
		}

		for (int j = 0; j < 10; j++) {
			if (j == 2) {
				continue;
			}
			if (j == 5) {
				break;
			}
			System.out.println(j);
		}
	}
}
