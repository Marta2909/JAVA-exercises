import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sol {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int liczba = Integer.parseInt(S); 
            System.out.println(liczba);
        } catch(Exception e){
            System.err.println("Bad String");
        } 
    }
}