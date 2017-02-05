
public class Problem10 {

	public static void main(String[] args) {
		long suma = 0L;		
		int licznik = 0;
		for (int i = 2; i <= 2000000; i++){
			for (int j = 2; j < i; j++){
				if(i%j == 0){
					licznik++;
				} 
			}
			if (licznik == 0){
				suma += i;
			}
			System.out.println("liczba " + i + " suma liczb pierwszych= " + suma);
			licznik = 0;
		}
	}
}

