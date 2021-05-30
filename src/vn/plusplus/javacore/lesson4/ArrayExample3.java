package vn.plusplus.javacore.lesson4;

public class ArrayExample3 {
    public static void main(String[] args) {
        int[] toan ={1,3,5};
        int[] van = {2,4,6};
        int[] anh = {5,7,4};
        /*
        *   1
        *   2
        *   3
        *   4
        * */

        int[][] b = {{1,2, 5}, {3,4, 7}, {5,6,4}};
        /*
        * A:      1   2   5
        * B:      3   4   7
        * C:      5   6   4
        * */
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.println(b[i][j]);
            }
        }
    }
}
