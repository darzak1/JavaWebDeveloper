public class Lab3_2_3 {
    public static void main(String[] args) {



        D c1 = new D();
        D c2 = new D();


        System.out.println("Stworzono " + D.counter + " obiektów");

        D c3 = new D();
        D c4 = new D();
        D c5 = new D();

        for (int i=1; i < 100000; i++){
            new D();
        }

    }
}

class D {

    static int counter;

    public D() {

        counter++;


        System.out.println("Tworzę nowy Obiekt");


    }
}