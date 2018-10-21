public class Equals {

    public static void main(String[] args) {

        String str1, str2;
        str1 = new String("to jest jakiś tekst");
        str2 = new String("to jest jakiś tekst");

        System.out.println(str1);
        System.out.println(str2);

        if (str1.equals(str2)){

            System.out.println("Równe!!!!");
        }


        A a = new A();
        B b = new B();



        if (a.equals(b)) { // == porównuje miejsce w pamięci lepiej używać equals
            System.out.println();
            System.out.println("równe");
        }

    }
}


class A {}
class B {}
