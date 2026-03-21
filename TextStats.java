import java.util.Arrays;
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
        String[] sArray = text.split(" ");
        char[] cArray = text.toCharArray();

        System.out.println(Arrays.toString(sArray));
        System.out.println(Arrays.toString(cArray));
        int charAmount = charCount(cArray);
        System.out.println("Text has "+charAmount+" characters in it");
        int wordAmount = wordAmount(sArray);
        System.out.println("Text has "+wordAmount+" words in it");
        int AveWordLen = AverageWordLength(cArray, wordAmount);
        System.out.println("Text has an average of "+AveWordLen+" letters in it");
        int LongestLen = LongestWord(sArray);
        System.out.println("The longest word is "+LongestLen+" long");
        int Shortest = ShortestWord(sArray);
        System.out.println("The shortest word is "+Shortest+" long");

        
      
    }

    public static int charCount(char[] in) {
        return in.length;
    }

    public static int wordAmount(String[] in) {
        return in.length;
    }

    public static int AverageWordLength(char[] in, int wordsAmount) {
        int total = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == ' ') {
                i++;
            } else {
                total++;
            }
        }
        return total / wordsAmount;
    }

    public static int LongestWord(String[] in) {
        int highestLen = 0;
        int countCurrent = 0;
        String longWord = "";

        for (int i = 0; i < in.length; i++) {
            countCurrent = in[i].length();

            if (countCurrent > highestLen) {
                highestLen = countCurrent;
                longWord = in[i];
            } else {
                continue;
            }
        }

        System.out.println("The longest word is " + longWord);
        return highestLen;
    }

    public static int ShortestWord(String[] in) {
        int LowestLen = 100;
        int countCurrent = 0;
        String ShortWord = "";

        for (int i = 0; i < in.length; i++) {
            countCurrent = in[i].length();

            if (countCurrent < LowestLen&&in[i]!=" ") {
                LowestLen = countCurrent;
                ShortWord = in[i];
            } else {
                continue;
            }
        }

        System.out.println("The shortest word is " + ShortWord);
        return LowestLen;
    }

    public static void interm(String text) {
    }

    public static void expert(String text) {
    }
}
