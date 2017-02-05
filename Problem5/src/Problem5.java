
public class Problem5 {

	public static void main(String[] args) {
		
		boolean toTaLiczba = false;
		int liczba = 1;
		while(!toTaLiczba){
			if ((liczba % 11 == 0) && (liczba % 12 == 0) && (liczba % 13 == 0) && (liczba % 14 == 0) && (liczba % 15 == 0) && (liczba % 16 == 0) && (liczba % 17 == 0) && (liczba % 18 == 0) && (liczba % 19 == 0) && (liczba % 20 == 0)){
				toTaLiczba = true;
				System.out.println(liczba);
			}
			liczba++;
		}
	}
	
}
