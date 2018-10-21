public class Casting_rzutowanie {
    public static void main(String[] args) {

        double d = 4.45;
        short s = 8;
        int i;

        //i = (int)d; //jawne rzutowanie
        i = s;

        System.out.println(i);

    Employee emp = new Employee();
    VicePresident veep = new VicePresident();

    emp = veep;

    veep = (VicePresident) emp; //jawne rzutowanie

        Float f1 = 4.23f;
        Float f2 = 6.34f;

        System.out.println(Math.min(f1,f2));


    }

}
class Employee {}

class VicePresident extends Employee{}