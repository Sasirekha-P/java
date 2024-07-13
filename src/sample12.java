import java.util.Arrays;
public class sample12 {
    private static int maxElement(int[] row){
        int max = row[0];
        for (int i : row) max = Math.max(max, i);
        return max;
    }
    private static int[] maxElementRow(int[][] matrix) {
        int[] rowMaxElements = new int[matrix.length];
        int i = 0;
        for(int[] row: matrix) {
            rowMaxElements[i] = maxElement(row);
            i++;
        }
        return rowMaxElements;
    }
    public static void main(String[] args) {
        int[][] matrix = {{8, 9},
                            {7, 9},
                            {1, 4},
                            {5, 0}};
        int[] maxElements = maxElementRow(matrix);
        System.out.println("Maximum elements in each row are as follows: ");
        System.out.println(Arrays.toString(maxElements));
    }
}