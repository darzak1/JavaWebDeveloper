import java.util.SortedMap;

public class StringChecker {
    public static void main(String[] args) {

        String str = "Lannister zawsze spłaca swoje długi.";

        System.out.println("teskst to: " + str);
        System.out.println("długość Tesktu: " + str.length() + " znaków");
        System.out.println("Znak na pozycji szóstej to " + str.charAt(0));
        System.out.println("fragmnet od znaku 10 do 16: >>" + str.substring(10,16) + "<<");
        System.out.println("Indeks pierszej litery 'T': " + str.indexOf('t'));
        System.out.println("Ideks pierszego podtekstu \"długi\": " + str.indexOf("długi"));
        System.out.println("Wyświtla tekst wielkimi literami: " + str.toUpperCase());
    }
}
