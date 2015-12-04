/*
boolean true/false
char 1文字 'a'
byte / short / int / long
float double
String 文字列
*/

public class HelloWorld {
	public static void main (String[] args) {
		boolean isHoge = true;
		int num = 5;
		double p = 3.14;
		long a = 1234567891234L; // 必ず最後にLをつける
		float b = 12345.678F;    // 必ず最後にFをつける
		String message = "abcdefg";
		System.out.println(isHoge);
		System.out.println(num);
		System.out.println(p);
		System.out.println(message);
		System.out.println(a);
		System.out.println(b);
	}
}
