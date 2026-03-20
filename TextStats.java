import java.util.Scanner;

/*
1. Takes in text and asks for different modes of analysis
2. Sends text to according function for analysis 
*/
public class TextStats {

    public static void main(String[] args) {
        Scanner kbm = new Scanner(System.in);
        String textin = "";
        int Difflevel;
        helpers help = new helpers();
        final String question = "Enter the text you want to get processed";
        final String DiffAsk = "What level of difficulty would you like to analyse it (1-3)";

        textin = help.input(question);
        Difflevel = help.IntPut(DiffAsk);

        if (Difflevel == 1) {
            basic(textin);
        } else if (Difflevel == 2) {
            interm(textin);
        } else if (Difflevel == 3) {
            expert(textin);
        }
    }

    public static void basic(String text) {
        int charAmount = charCount(text);
        int wordAmount = wordAmount(text);
        int AveWordLen = AverageWordLength(text);
        String Longest = LongestWord(text);
        String Shortest = ShortestWord(text);
    }

    public static int charCount(String in) {
        return 0;
    }

    public static int wordAmount(String in) {
        return 0;
    }

    public static int AverageWordLength(String in) {
        return 0;
    }

    public static String LongestWord(String in) {
        return "";
    }

    public static String ShortestWord(String in) {
        return "";
    }

    public static void interm(String text) {
    }

    public static void expert(String text) {
    }
}
