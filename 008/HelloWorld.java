class User {
	String name;
	String email;

	// コンストラクタ
	User(String name) {
		this.name = name;
	}

	void sayHi() {
		System.out.println(name + " Hi");
	}
}

public class HelloWorld {
	public static void main (String[] args) {
		User tom = new User("tom");
		tom.sayHi();
		User bob = new User("bob");
		bob.sayHi();
	}
}
