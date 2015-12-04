public class HelloWorld {
	public static void main (String[] args) {
		sayHi();
		sayHi("taro");
	}

	public static void sayHi() {
		System.out.println("hi");
	}

	// オーバーロード
	public static void sayHi(String name) {
		System.out.println(name);
	}
}
