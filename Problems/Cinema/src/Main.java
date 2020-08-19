import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();
        int[][] cinema = new int[rows][seats];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<seats;j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }
        int tickets = scanner.nextInt();
        for (int i=0;i<rows;i++) { // Iterate trough each row
            int counter = 0; // Reset counter every time it runs
            for (int j=0;j<seats;j++) { // Iterate trough each seat of row
                if (cinema[i][j] == 0) { // If I encounter 0 in the row increment counter of empty seats
                    counter++;
                    if (counter == tickets) { // Moreover stop and print if condition fulfilled
                        System.out.println(i+1);
                        return;
                    }
                } else if (cinema[i][j] == 1) { // Else reset the counter
                    counter = 0;
                }
            }
        }
        System.out.println(0); // If no match then return 0
    }
}