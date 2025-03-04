public class ZweiDimArray {
    public static void main(String[] args) {
        int[][] zahlen = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < zahlen.length; i++) {
            for (int j = 0; j < zahlen[i].length; j++) {
                System.out.print(zahlen[i][j] + " ");
            }
            System.out.println();
        }
    }
}
