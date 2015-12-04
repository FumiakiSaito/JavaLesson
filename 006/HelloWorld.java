public class HelloWorld {
	public static void main (String[] args) {
		int sales[];
		sales = new int[4];
		sales[0] = 150;
		sales[1] = 200;
		sales[2] = 140;
		sales[3] = 400;

		// ↓これでもいい
		//int sales[] = {150, 200, 140, 400};

		for (int i = 0; i < sales.length; i++) {
			System.out.println(sales[i]);
		}
	}
}
