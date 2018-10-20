import java.text.DecimalFormat;

public class Vars {
    public static void main(String[] args) {

        int numberOfCats = 20;

        final int DAYS_IN_WEEK = 7;

        byte b = 1;
        double x = 12e55; // 12 * 10 ^ 22
        double y = 12e-55;// 12 * 10 ^ 22

        DecimalFormat decimalFormat = new DecimalFormat("#.### ### ### ### ### ### ### ### ### ### ### ### ### ### ### ### ### ###");

        System.out.println(y);
        System.out.println(decimalFormat.format(y));
        System.out.println(x);
        System.out.println(decimalFormat.format(x));

        int i = 3_500_000;
        System.out.println(i);




    }

}
