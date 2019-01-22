package Weken.E_Collections.BoekOpdrachten.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class TestCollections {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);

        for (int x : list){
            System.out.println(x);
        }
        Integer[] test = list.toArray(new Integer[0]);

        Collection<String> listTwo = new LinkedList<>();
    }
}
