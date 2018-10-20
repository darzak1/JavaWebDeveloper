import javax.jws.soap.SOAPBinding;

public class Weather {
    public static void main(String[] args) {

        float fah = 86;
        System.out.println();
        System.out.println(fah + " stopni Fahreheita to ... " );
        fah = fah - 32; // fah -=32
        fah = fah / 9;
        fah = fah * 5;
        System.out.println(fah + " stopni Celsjusza");

        System.out.println();

        float cel = 30;
        System.out.println(cel + " stopni celreheita to ... " );
        cel = cel * 9; // cel -=32
        cel = cel / 5;
        cel = cel + 32;
        System.out.println(cel + " stopni Fahreheita");

        System.out.println();

        int a = 5;
        int b = 2;

        System.out.println(a/b);// wydrukuje bez reszty
        System.out.println(5f/b);// wydrukuje dokładnie
        System.out.println(a%b);// wdrukuje tylko resztę
        System.out.println("testnocny");

        //kahoot.it strona s quizami





    }
}
