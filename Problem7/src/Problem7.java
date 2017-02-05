import java.util.ArrayList;

public class Problem7 {
	
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

		ArrayList<Integer> tablicaLiczbPierwszych = new ArrayList<Integer>();
		int j = 2;
		while(tablicaLiczbPierwszych.size() < 10002){
			if (sprawdzCzyPierwsza(j)==true){
				tablicaLiczbPierwszych.add(j);
			} 
			j++;
		}
		System.out.println(tablicaLiczbPierwszych);
		System.out.println(tablicaLiczbPierwszych.remove(10001));
	}

}
