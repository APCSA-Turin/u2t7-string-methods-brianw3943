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
        System.out.print("Enter next word: ");
        String nextNextWord = scan.nextLine();
        wordCount ++;
    }
}
