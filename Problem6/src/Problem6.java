
public class Problem6 {

	public static void main(String[] args) {
		int suma = 0;
		int kwadratSumy = 0;
		int sumaKwadratow = 0;
		int roznica;
		for (int i=1; i <= 100; i++){
			sumaKwadratow += i*i;
			suma +=i;
		}
		System.out.println(sumaKwadratow);
		kwadratSumy = suma*suma;
		System.out.println(kwadratSumy);
		roznica = kwadratSumy - sumaKwadratow;
		System.out.println(roznica);
	}

}
