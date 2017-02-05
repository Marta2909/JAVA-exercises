
public class Fibonacci {

	public static void main(String[] args) {
		int[] ciagFibonacciego = new int[50];
		ciagFibonacciego[0] = 1;
		ciagFibonacciego[1] = 2;
		int suma = 0;
		for(int i = 2; i < ciagFibonacciego.length; i++){
			ciagFibonacciego[i] = ciagFibonacciego[i-1] + ciagFibonacciego[i-2];
		}
		for (int i = 0; i < ciagFibonacciego.length; i++){
			System.out.print(ciagFibonacciego[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; ciagFibonacciego[i] < 4000000; i++){
			if (ciagFibonacciego[i] % 2 == 0){
				suma += ciagFibonacciego[i];
				System.out.println(suma);
			}
		}
	}
	

}
