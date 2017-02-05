import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sty1017_zad1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int m = in.nextInt();
        int[] p = new int[n];
        for(int p_i=0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int max = 0;
        for (int i=0; i < p.length; i++){
            if (p[i] >= max){
                max = p[i];
            }
        }
        //System.out.println("Maksymalana liczba osób w grupie to " + max);
        int capacity = c*m;
        //System.out.println("Maksymalna liczba osób, które mog¹ byæ jednokrotnie zabrane na ³ódki to " + capacity);
        if (capacity >= max){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
