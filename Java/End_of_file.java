import java.io.*;
import java.util.*;

public class End_of_file {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 1;
        while(sc.hasNext()) {
            System.out.println(i + " " + sc.nextLine());
            i++;
        }
    }
}