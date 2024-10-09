package U2T7_P2_MoreStringMethods;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int wordCount = 0;
        System.out.print("Enter first word: ");
        String firstWord = scan.nextLine();
        wordCount ++;
        
        System.out.print("Enter next word: ");
        String nextWord = scan.nextLine();
        wordCount ++;
        if (nextWord.compareTo(firstWord)>0) {
            score += 2;
            System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
        }
        if (nextWord.compareTo(firstWord)<0) {
            score -= 5;
            System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
        }
        if (firstWord.equals(nextWord)) {
            score -= 10;
            System.out.println("-10 points: current word exact same; SCORE: " + score);
        }
        if (firstWord.substring((firstWord.length()-2), (firstWord.length())).equals(nextWord.substring(0, 2))) {
            score += 5;
            System.out.println("+5 points: last 2 letters of previous word match first 2 letters of current; SCORE: " + score);
        }
        if (nextWord.contains(firstWord.substring(0, 1))) {
            score += 3;
            System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
        }
        if (firstWord.length()==nextWord.length()) {
            score += 3;
            System.out.println("+3 points: previous word and current word have same length; SCORE: " + score);
        }
        while (score < 50) {
            System.out.print("Enter next word: ");
            String nextNextWord = scan.nextLine();
            wordCount ++;
            if (nextNextWord.compareTo(nextWord)>0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            }
            if (nextNextWord.compareTo(nextWord)<0) {
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            }
            if (nextWord.equals(nextNextWord)) {
                score -= 10;
                System.out.println("-10 points: current word exact same; SCORE: " + score);
            }
            if (nextWord.substring((nextWord.length()-2), (nextWord.length())).equals(nextNextWord.substring(0, 2))) {
                score += 5;
                System.out.println("+5 points: last 2 letters of previous word match first 2 letters of current; SCORE: " + score);
            }
            if (nextNextWord.contains(nextWord.substring(0, 1))) {
                score += 3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }
            if (nextWord.length()==nextNextWord.length()) {
                score += 3;
                System.out.println("+3 points: previous word and current word have same length; SCORE: " + score);
            nextWord = nextNextWord;
            }
        }
       System.out.println("Your final score is: " + score + "\nIt took you " + wordCount + " words to get this score!\nTry again for a lower word count!");
    }
}
