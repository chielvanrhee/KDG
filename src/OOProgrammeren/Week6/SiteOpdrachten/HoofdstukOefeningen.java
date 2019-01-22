package Week6;

public class HoofdstukOefeningen {

    public static void main(String[] args) {

//
//        int arrayname[] = new int[10];
//
//        arrayname[2] = 3;
//
//        //forloop array
//        for (int i = 0; i < arrayname.length; i++) {
//            arrayname[i] = i * i;
//            System.out.println(arrayname[i]);
//        }
//
//        //foreach
//        for (int x : arrayname) {
//            System.out.println(x);
//        }

//
//        int[] priemgetallen = new int[30];
//        int counter = 0;
//
//        for (int i = 0; i < 100; i++) {
//            int priemcounter = 0;
//            for (int ix = i; ix > 0; ix--) {
//                if (i%ix==0 ) {
//                    priemcounter++;
//                }
//                }
//                if (priemcounter == 2){
//                    priemgetallen[1+counter] = i;
//                    counter++;
//                }
//            }
//        for (int i:priemgetallen
//             ) {
//            System.out.println(i);
//

        //bubblesort
        int[] bubbleSort = new int[]{5, 4, 3, 12, 3, 45, 678, 94, 345, 7456, 22, 5, 5, 6, 7, 99, 3, 11};
        int length = bubbleSort.length - 1;
        int temp = 0;
        boolean completed = false;
        int counter = 0;

        while (!completed) {
            counter = 0;
            for (int i = length; i > 0; i--) {
                if (bubbleSort[i] < bubbleSort[i - 1]) {
                    temp = bubbleSort[i];
                    bubbleSort[i] = bubbleSort[i - 1];
                    bubbleSort[i - 1] = temp;
                    counter++;
                }

            }
            if (counter == 0) {
                completed = true;
            }
        }
        for (int p : bubbleSort
        ) {
            System.out.println(p);

        }


    }
}

