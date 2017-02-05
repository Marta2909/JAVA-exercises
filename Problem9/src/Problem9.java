
public class Problem9 {

	public static void main(String[] args) {
		int[] liczby = new int[3];
	
		for(int a = 1; a < 1000; a++){
			for (int b = a + 1; b < 1000; b++){
				for(int c = b + 1; c < 1000; c++){
					if((a*a+b*b == c*c)&&(a+b+c == 1000)){
						liczby[0] = a;
						liczby[1] = b;
						liczby[2] = c;
 					}
				}
			}
		}
		System.out.println(liczby[0] + " " + liczby[1] + " " + liczby[2]);
		System.out.println(liczby[0]*liczby[0] + liczby[1]*liczby[1] - liczby[2]*liczby[2]);
		System.out.println(liczby[0]+liczby[1]+liczby[2]);
		System.out.println("wynik: "+liczby[0]*liczby[1]*liczby[2]);
	}

}
