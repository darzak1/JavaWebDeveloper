public class Lab3_1_1 {
    public static void main(String[] args) {
        int a = 14000;

        System.out.println("Inwestycja = " + a);
        System.out.println();

        double b = a * 1.4;

        System.out.println("Wartość inwestycji po roku wynosi: " + b + "zł");
        System.out.println();

        double c = b - 1500;
        System.out.println("Wartość inwestycji po dwóch latach wynosi: " + c + "zł");
        System.out.println();

        double d = c * 1.12;
        System.out.printf("Wartość inwestycji po trzech latach wynosi: %.2f zł", d);//zaokrągla do dwóch miejsc po przecinku %.2f
        System.out.println();

    }
}
