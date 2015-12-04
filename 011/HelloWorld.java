public class HelloWorld {
	public static void main (String[] args) {
		String s = new String("abcdefg");
		System.out.println(s.length());
		System.out.println(s.substring(2, 5));
		System.out.println(s.replaceAll("abc", "ABC"));

		String s1 = "Sun,Mon,Tue";
		String[] youbi = s1.split(",", 0);
		System.out.println(youbi[0]);

		String s2 = "Java";
		String s3 = "java";
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}

		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}

		String s4 = "";
		if (s4.isEmpty()) {
			System.out.println("s4は空文字");
		}
	}
}
