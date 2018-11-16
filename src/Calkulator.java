import java.util.Scanner;

public class Calkulator {

    public static void main(String[] args) {

        int x; //pierwsza liczba działania, o którą program zapyta
        int y; // druga ------------||----------------------------
        char znak; // zmienna, która przechowuje znak dodawania, odejmownia lub dzielenia
        Scanner in = new Scanner(System.in);// metoda umożliwiająca WCZYTYWANIE danych do programu z klawiatury - tu liczb działania
        System.out.println("Podaj pierwszą liczbę działania:");
        x = in.nextInt(); // przypisanie do int x wpisywanej liczby
        System.out.println("Podaj drugą liczbę działania:");
        y = in.nextInt();

        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb - wciśnij -");
        System.out.println("Mnożenie dwóch liczb - wciśnij *");

        String string1 = in.next();// pobiera symbol operacji od uzytkownika
        znak = string1.charAt(0); // równa stworzony string1 do do zadeklarowanego wcześniej char "znak"
        switch(znak)     // w zależności od wyboru wykonuje daną operację
        {
            case '+':    // dodawanie zmiennych "x" i "y" // pokazuje co robić gdy uzytkownik wpisze dany znak
            {
                System.out.println(x + y);
                break;
            }
            case '-':    // odejmowanie dwóch zmiennych
            {
                System.out.println(x - y);
                break;
            }
            case '*':    // mnożenie dwóch zmiennych
            {
                System.out.println(x * y);
                break;
            }

        }



    }

}
