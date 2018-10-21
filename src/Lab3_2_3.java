public class Lab3_2_3 {
    public static void main(String[] args) {



        C c1 = new C();
        C c2 = new C();


        System.out.println("Stworzono " + C.counter + " obiektów");

        C c3 = new C();
        C c4 = new C();
        C c5 = new C();

        for (int i=1; i < 100000; i++){
            new C()
        }

    }
}

class C {

    static int counter;

    public C (){

        counter++
    }

        System.out.println("Tworzę nowy Obiekt");

    }


