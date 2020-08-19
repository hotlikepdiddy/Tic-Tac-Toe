import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        int[] box1 = new int[size];
        int[] box2 = new int[size];
        for (int i = 0; i < size; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            box2[i] = scanner.nextInt();
        }
        Arrays.sort(box1);
        Arrays.sort(box2);
        if (Arrays.equals(box1, box2)) {
            System.out.println("Box 1 = Box 2");
        } else if ((getMin(box1) > getMin(box2)) && (getMax(box1) < getMax(box2))) {
            System.out.println("Incomparable");
        } else if ((getMin(box1) < getMin(box2)) && (getMax(box1) > getMax(box2))) {
            System.out.println("Incomparable");
        } else if ((getMin(box1) < getMin(box2)) || (getMax(box1)) < getMax(box2)) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Box 1 > Box 2");
        }
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
}