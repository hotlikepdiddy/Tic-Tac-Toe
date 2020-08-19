import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i=0;i<size;i++) {
            array[i] = scanner.nextInt();
        }
        int max = 0;
        for (int ele : array) {
            if (ele >= max) {
                max = ele;
            }
        }
        int index = 0;
        for (int i = 0;i<size;i++) {
            if (array[i] == max) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}