import java.util.Scanner;

public class helpers {
     public static void print(String output) {
        System.out.println(output);
    }

    public static void prInt(int output) {
        System.out.println(output);
    }

    public static String input(String message) {
        Scanner scanner = new Scanner(System.in);
        print(message);
        String input = scanner.nextLine();

        return input;
    }

    public static int IntPut(String word) {
        String number = input(word);
        int num = Integer.parseInt(number);

        return num;
    }

    public static String StringPut(String message) {
        Scanner scanner = new Scanner(System.in);
        print(message);

        String input = scanner.nextLine();

        return input;
    }

    public static void main(String[] args) {
        return;
    }
}
