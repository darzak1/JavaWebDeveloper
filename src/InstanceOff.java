public class InstanceOff {

    public static void main(String[] args) {

        String str1,str2;
        str1 = str2 = "jakiś tekst";

        String name = str1.getClass().getName();

        System.out.println();
        System.out.println(name);


        boolean check1 = "Teksas" instanceof String;
        System.out.println();
        System.out.println(check1);


    }
}
