
public class Problem10v2 {

	public static boolean sprawdzCzyPierwsza(int sprawdzanaLiczba){
		boolean czyPierwsza = true;
		for(int i = 2; i < sprawdzanaLiczba; i++){
			if (sprawdzanaLiczba % i == 0){
				czyPierwsza = false;
			}
		}
		return czyPierwsza;
	}
	
	public static void main(String[] args) {
		int limit = 2000000;
		long suma = 5L;
		int n = 5;
		while (n <= limit){
			if (sprawdzCzyPierwsza(n)==true){
				suma += n;
			}
			n += 2;
			System.out.println(n);
		}
		System.out.println(suma);
	}

}
