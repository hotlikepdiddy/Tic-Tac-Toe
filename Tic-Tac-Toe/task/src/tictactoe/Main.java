package tictactoe;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void displayBoard(HashMap<String, Character> board) {
        System.out.println("---------");
        System.out.println("| " + board.get("13") + " " + board.get("23") + " " + board.get("33") + " |");
        System.out.println("| " + board.get("12") + " " + board.get("22") + " " + board.get("32") + " |");
        System.out.println("| " + board.get("11") + " " + board.get("21") + " " + board.get("31") + " |");
        System.out.println("---------");
    }

    public static boolean checkBoard(HashMap<String, Character> board) {
        boolean row1 = board.get("13") == board.get("23") && board.get("13") == board.get("33") && board.get("33") != '_';
        boolean row2 = board.get("12") == board.get("22") && board.get("12") == board.get("32") && board.get("32") != '_';
        boolean row3 = board.get("11") == board.get("21") && board.get("11") == board.get("31") && board.get("31") != '_';
        boolean col1 = board.get("13") == board.get("12") && board.get("13") == board.get("11") && board.get("11") != '_';
        boolean col2 = board.get("23") == board.get("22") && board.get("23") == board.get("21") && board.get("21") != '_';
        boolean col3 = board.get("33") == board.get("32") && board.get("33") == board.get("31") && board.get("31") != '_';
        boolean dia1 = board.get("13") == board.get("22") && board.get("13") == board.get("31") && board.get("31") != '_';
        boolean dia2 = board.get("33") == board.get("22") && board.get("33") == board.get("11") && board.get("11") != '_';

        // If difference between X and O is > 2 print "Impossible"

        int count__ = 0;

        for (String key : board.keySet()) {
            if  (board.get(key).toString().equals("_")) { count__++;}
        }

        // Check all conditions
         if (row1 || col1 || dia1) {
            System.out.println(board.get("13") + " wins");
            return false;
        } else if (row2 || col2 || dia2) {
            System.out.println(board.get("22") + " wins");
            return false;
        } else if (row3 || col3) {
            System.out.println(board.get("31") + " wins");
            return false;
        } else if (count__ != 0) {
            /*System.out.println("Game not finished");*/
            return true;
        } else {
            System.out.println("Draw");
            return false;
        }

    }

    public static void userMove(HashMap<String, Character> board, int counter) {
        Scanner scanner = new Scanner(System.in);
        String[] fields = {"13", "23", "33", "12", "22", "32", "11", "21", "31"};
        boolean retry_input = true;
        String input;
        while (retry_input) {
            System.out.println("Enter the coordinates:");
            input = (String.valueOf(scanner.nextInt()) + scanner.nextInt());
            try {
                Integer.parseInt(input);
                boolean input_ok = Arrays.asList(fields).contains(input);
                if (((input_ok) && board.get(input).equals('_'))) {
                    if (counter % 2 != 0){
                        board.put(input, 'X');
                    } else {
                        board.put(input, 'O');
                    }
                    retry_input = false;
                } else if (!input_ok) {
                    System.out.println("Coordinates should be from 1 to 3!");
                }
                else {
                    System.out.println("This cell is occupied! Choose another one!");
                    retry_input = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
                retry_input = true;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter cells:");
        // Initializing board hashmap
        HashMap<String, Character> board = new HashMap<>() {{
            put("13",'_');
            put("23",'_');
            put("33",'_');
            put("12",'_');
            put("22",'_');
            put("32",'_');
            put("11",'_');
            put("21",'_');
            put("31",'_');
        }
        };
        displayBoard(board);
        int counter = 1;
        while (checkBoard(board)) { // If true then continue game, if false the no
            userMove(board, counter);
            displayBoard(board);
            counter++;
        }
    }
}
