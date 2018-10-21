import java.util.StringTokenizer;

public class Lab3_2_1 {

    public static void main(String[] args) {

        StringTokenizer st1;

        String dataUrodzin = "29/04/2016";
        st1 = new StringTokenizer(dataUrodzin,"/");

        System.out.println("Dzień: \t\t" + st1.nextToken());
        System.out.println("Miesiąc: \t" + st1.nextToken());
        System.out.println("Rok: \t\t" + st1.nextToken());

//
    }

}
