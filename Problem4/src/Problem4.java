
public class Problem4 {
	
	//program wyszukuje najwiêkszy palindrom po przemno¿eniu 3 liczb 3-cyfrowych

	public static void main(String[] args) {
		int iloczyn;
		String tekst;
		int najwiekszyPalindrom = 0;
		char[] tab = new char[6];
		
		for (int i = 999; i >= 800 ; i--){
			for (int j = 999; j >= 800 ; j--) {
				iloczyn = i * j;
				tekst = Integer.toString(iloczyn);
				for (int k = 0 ; k < tekst.length(); k++){
					tab[k] = tekst.charAt(k);
				}
				if (tekst.length() == 6) {
					if(tab[0] == tab[5] && tab[1] == tab[4] && tab[2]==tab[3] && iloczyn > najwiekszyPalindrom){
						System.out.println(i + " " + j + " " + iloczyn);
						najwiekszyPalindrom = iloczyn;
						break;
					}
				}
			}	
		}
	}

}
