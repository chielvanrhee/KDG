package Week6;

public class HoofdstukOefeningen3 {
    public static void main(String[] args) {

        int[][] table = new int[12][16];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);


            }

        }
        for (int[] row : table) {
            for (int el : row) {
                System.out.print(el + "\t");
            }
            System.out.println();
        }


    }
}
