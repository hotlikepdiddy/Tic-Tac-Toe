import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        int[][] rotate = new int[col][row];

        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                rotate[j][matrix.length-1-i] = matrix[i][j];
            }
        }
        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(rotate[i][j]);
            }
            System.out.println();
        }


    }
}