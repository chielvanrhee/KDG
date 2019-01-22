package OOTechnieken.Week5.BoekOpdrachten.OpdrachtVijf;

import java.util.PriorityQueue;
import java.util.Queue;

public class SimpleObjectTester {
    public static void main(String[] args) {

        SimpleObject finnished = new SimpleObject(0);

        SimpleObject x = new SimpleObject(1);
        SimpleObject y = new SimpleObject(222);

        //System.out.println(x.compareTo(y));;

        Queue<SimpleObject> list = new PriorityQueue<>();
        list.offer(x);
        list.offer(y);
        list.offer(x);
        list.offer(new SimpleObject(6));
        list.offer(new SimpleObject(400));
        list.offer(new SimpleObject(7));
        list.offer(new SimpleObject(4));

        while (finnished != null){
            System.out.println(list.poll());
            finnished = list.peek();
        }
    }
}
