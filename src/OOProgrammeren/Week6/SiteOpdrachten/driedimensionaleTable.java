package Week6;

public class driedimensionaleTable {
    public static void main(String[] args) {
        int[][][] driedee = new int[11][11][11];
        for (int i = 0; i < driedee.length; i++) {
            for (int j = 0; j < driedee[i].length; j++) {
                for (int k = 0; k < driedee[i][j].length; k++) {
                    driedee[i][j][k] = i * j * k;
                }
            }
        }
        for (int[][] table : driedee) {
            for (int[] row : table) {
                for (int number : row) {
                    System.out.print(number + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
