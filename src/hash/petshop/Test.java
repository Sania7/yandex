package hash.petshop;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(25.0);
        list.add(25.0);
        list.add(25.0);
        list.add(25.0);

        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum +=  list.get(i);
        }
        System.out.println(sum);
    }

}
