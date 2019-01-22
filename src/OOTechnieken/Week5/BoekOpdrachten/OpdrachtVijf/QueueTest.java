package OOTechnieken.Week5.BoekOpdrachten.OpdrachtVijf;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {

        BurgerOrder finnished = new BurgerOrder("empty",0);

        Queue<BurgerOrder> orders = new PriorityQueue<>();
        orders.offer(new BurgerOrder("chiel" ,1 ));
        orders.offer(new BurgerOrder("karel" ,2 ));
        orders.offer(new BurgerOrder("fred" ,5 ));
        orders.offer(new BurgerOrder("manfried" ,7 ));
        orders.offer(new BurgerOrder("edkolom" ,12 ));
        orders.offer(new BurgerOrder("manfried" ,8 ));
        orders.offer(new BurgerOrder("manfried" ,19 ));
        orders.offer(new BurgerOrder("manfried" ,44 ));


        //duplicaat
        orders.offer(new BurgerOrder("chiel" ,1 ));

        System.out.println("\nnu volgen de orders als PriorityQueue (gesorteerd op nummer zoals aangegeven in het object via comparable)\n");

        while (finnished != null){
            System.out.println(orders.poll());
            finnished = orders.peek();

        }
        BurgerOrder finnishedTwo = new BurgerOrder("empty",0);

        System.out.println("\nnu volgen de orders als linkedlist (FIFO)\n");

        Queue<BurgerOrder> ordersTwo = new LinkedList<>();
        ordersTwo.offer(new BurgerOrder("chiel" ,1 ));
        ordersTwo.offer(new BurgerOrder("karel" ,2 ));
        ordersTwo.offer(new BurgerOrder("fred" ,5 ));
        ordersTwo.offer(new BurgerOrder("manfried" ,7 ));
        ordersTwo.offer(new BurgerOrder("edkolom" ,12 ));
        ordersTwo.offer(new BurgerOrder("manfried" ,8 ));
        ordersTwo.offer(new BurgerOrder("manfried" ,19 ));
        ordersTwo.offer(new BurgerOrder("manfried" ,44 ));


        //duplicaat
        ordersTwo.offer(new BurgerOrder("chiel" ,1 ));

        while (finnishedTwo != null){
            System.out.println(ordersTwo.poll());
            finnishedTwo = ordersTwo.peek();
        }
    }
}
