

public class Problem3 {

	public static boolean sprawdzCzyPierwsza(int sprawdzanaLiczba){
		boolean czyPierwsza = true;
		for (int j = 2; j < sprawdzanaLiczba; j++){
			if (sprawdzanaLiczba % j == 0){
				czyPierwsza = false;
			}
		}
		return czyPierwsza;
	}
	
	public static void main(String[] args) {
		long liczba = 600851475143L;
		
		for(int i = 3 ; i < liczba; i++){
			long reszta = liczba % i;
			if (sprawdzCzyPierwsza(i) == true && reszta == 0) {
				System.out.println(i);
			} 
		}
		
	}

}
	
	
	
	
	
