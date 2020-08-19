import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[][] matrix = new String[size][size];

        for (int i=0;i<size;i++) {
            for (int j=0;j<size;j++) {
                if (i==j) {
                    matrix[i][j] = "*";
                } else if (i == size - j - 1){
                    matrix[i][j] = "*";
                } else if (i == size / 2) {
                    matrix[i][j] = "*";
                } else if (j == size / 2) {
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = ".";
                }
            }
        }
        for (int i=0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}