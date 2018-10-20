public class IncDec {
    public static void main(String[] args) {

        int x, y, z;
        x = 42;
        y = x++;// y=42, x=43
        z = ++x;// x=44, z=44
        System.out.println();
        System.out.println("x to " + x);
        System.out.println();
        System.out.println("y to " + y);
        System.out.println();
        System.out.println("z to " + z);

        System.out.println();

        int a = 0, b;

        b = a++ + a++; // 0, 1, 3
                    //0 1
                    //1 2
        System.out.println(a);
        System.out.println(b);

        boolean value;
        int g = 5;
        int h = 7;

        value = 5 == 7;
        System.out.println(value);
        value = g != h;
        System.out.println(value);

        int i = 5;
        int j = 5;

        System.out.println((i > 5) && (j < 7));
        System.out.println((i > 5) || (j < 7));
        System.out.println();
        System.out.println();
        System.out.println("abcd" + 1 +2);
        System.out.println(1 +2 + "abcd");
        System.out.println();

        String myName = "Darek";
        myName += " Jr ";
        System.out.println(myName);
        System.out.println();

        int k = 6 + 4 / 2;
        System.out.println(y);




    }
}
