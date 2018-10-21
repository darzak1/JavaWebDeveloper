import java.awt.*;

public class Lab3_2_2 {

    public static void main(String[] args) {
        D3 d3 = new D3();
        d3.weight = 454;
        d3.height = 235;
        d3.depth = 120;

        System.out.println("Głębokość to: \t" + d3.depth);
        System.out.println("Wysokość to: \t" + d3.height);
        System.out.println("Waga to: \t\t" + d3.weight);



    }


}


class D3 {
    int height, weight, depth;

}