package worksheet5.task1;

public class DotProductThread extends Thread {
    private int[] v1;
    private int[] v2;
    private int dot;

    private int[][] matrix;
    private int i;
    private int j;

    public DotProductThread(int[] v1, int[] v2, int[][] matrix, int i, int j) {
        this.v1 = v1;
        this.v2 = v2;
        dot = 0;

        this.matrix = matrix;
        this.i = i;
        this.j = j;
    }

    public void run() {

        // if (v1 == null || v2 == null || v1.length != v2.length) throw new
        // ArithmeticException();

        for (int i = 0; i < v1.length; i++) {
            dot += v1[i] * v2[i];
        }
        //try{Thread.sleep(1000*20);}catch(InterruptedException e){};
        synchronized (matrix) {
            matrix[i][j] = dot;
        }
    }
}
