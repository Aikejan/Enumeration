import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sity [] sity = Sity.values();
        for (Sity s: sity){
            System.out.println(s+" "+s.getCountry());
        }

    }
}