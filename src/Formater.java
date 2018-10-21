public class Formater {

    public static void main(String[] args) {


        int i = 89878;
        String s = "Jakiś napis";
        double d = Math.PI;

        System.out.printf("%20d",i);
        System.out.println();

        System.out.printf("%50s", s);
        System.out.println();

        System.out.printf("%.50f\n", d);

        System.out.println(d);

        C c1 = new C();
        C c2 = new C();
        C c3 = new C();
        C c4 = new C();
        C c5 = new C();

    }
}

class C {
    public C (){

        System.out.println("Tworzę nowy Obiekt");

    }
}
