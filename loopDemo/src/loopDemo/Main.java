package loopDemo;

public class Main {

	public static void main(String[] args) {
		// For döngüsü
		for (int i = 2; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü bitti");
		int i = 1;
		// While döngüsü
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Döngüsü bitti");
		// do-while döngüsü
		int j = 1;
		do {
			System.out.println("Loglandı");
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("do-while döngüsü bitti");

	}

}
