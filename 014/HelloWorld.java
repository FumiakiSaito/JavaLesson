import java.util.Calendar;

public class HelloWorld {
	public static void main (String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE));

		cal.set(2011, 4, 17, 12, 3, 22);
		System.out.println(cal.get(Calendar.DATE));

		cal.add(Calendar.DATE, 5);
		System.out.println(cal.get(Calendar.DATE));
	}
}
