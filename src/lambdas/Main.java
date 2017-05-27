import java.util.ArrayList;
import java.util.Arrays;

class Main {

	public static void main(String[] args) {

		// Old style:
		Runnable r = new Runnable(){
				@Override
				public void run() {
					System.out.println("My Runnable");
				}};

		// New
		Runnable r1 = () -> {
			System.out.println("My Runnable");
		};

		// Instantiate interface
		Interface1 i1 = (s) -> System.out.println(s);

		i1.method1("abc");

		// Sort array of strings using lambdas, by length
		System.out.println("Sorting array by decreasing length:");
		String[] strArray = {"aa", "aaa", "b", "", "cccccc"}; //new String[4];

		Arrays.sort(strArray,
				(String s1, String s2) -> s2.length() - s1.length());

		for (int i = 0; i < 4; ++i) {
			System.out.println("\"" + strArray[i] + "\"");
		}

	}

}
