import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];

        //Reading
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        //Find max
        int max = -2147483648;
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++){
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        for (int i=0;i<row;i++) {
           for (int j=0;j<col;j++) {
               if (matrix[i][j] == max) {
                   System.out.println(i + " " + j);
                   return;
               }
           }
        }

    }
}