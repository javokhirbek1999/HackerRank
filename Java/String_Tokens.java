import java.io.*;
import java.util.*;

public class String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(s, "[A-Z !,?._'@]+,");
        int tokens = stringTokenizer.countTokens();
        System.out.println(tokens);
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
        scan.close();
    }
}

