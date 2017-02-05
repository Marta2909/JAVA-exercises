import java.util.Scanner;
//u�ytkownik wpisuje ile chce string�w i tyle string�w i program wypisuje najpierw parzyste litery potem spacj� i nieparzyste litery ka�dego stringa
public class Day6String {
	
	public static void main(String[] args) {
		int T; // liczba przypadk�w
		
		// odczytuje liczb� przypadk�w podan� przez u�ytkownika		
		Scanner odczyt = new Scanner(System.in);
		T = odczyt.nextInt();
		
		// odczytuje przypadki - kolejne stringi podane przez u�ytkownika
		String[] napisy = new String[T]; // 
		for (int i = 0; i < napisy.length; i++){
			napisy[i] = odczyt.next();
		}
		
		// wypisuje na konsoli podan� liczb� przypadk�w 
		//System.out.println(T);
		
		// dla ka�dego podanego przypadku:
		for (int i = 0; i < napisy.length; i++){
			// wypisuje ten przypadek
			//	System.out.println(napisy[i]);
			
			// dzieli przypadek na pojedyncze litery
			char[] litery = napisy[i].toCharArray();
			
			// wrzuca litery w odpowiedniej kolejno�ci do wynikowego stringa
			String wynik = new String();
			
			for (int k = 0; k < litery.length; k+=2){
				wynik += litery[k];
			}
				wynik+=" ";
			for (int k = 1; k < litery.length; k+=2){
				wynik += litery[k];
			}
			
			// wypisuje wynikowy string
			System.out.println(wynik);
		}
	}

}
