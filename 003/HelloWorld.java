public class HelloWorld {
	public static void main (String[] args) {
		String a = "hello";
		String b = "world";
		int c = 5;

		System.out.println(a + b);
		System.out.println(a + c); // 整数値は文字列にキャストされる
	}
}
