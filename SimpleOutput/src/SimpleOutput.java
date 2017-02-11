import java.util.Scanner;

public class SimpleOutput {

	public static void main(String[] args) {
		int x;
		Scanner odczyt = new Scanner(System.in);
		x = odczyt.nextInt();
		while (x != 42) {
			System.out.println(x);
			x = odczyt.nextInt();
		}
	}

}

 