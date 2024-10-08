import java.util.Scanner;
public class Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();
        if (str1.length()>str2.length()) {
            System.out.println(str1+" is longer");
        } else { if (str2.length()>str1.length()) {
            System.out.println(str2+" is longer");
        } else {
            System.out.println("Both strings have the same length");
        }
        
        }
        String str1First = str1.substring(0, (str1.length()/2));
        System.out.print("First half: " + str1First + "\n");
        String str1Second = str1.substring(str1.length()/2);
        System.out.print("Second half: " + str1Second + "\n");
        String str2First = str2.substring(0, (str2.length()/2));
        System.out.print("First half: " + str2First + "\n");
        String str2Second = str2.substring(str2.length()/2);
        System.out.print("Second half: " + str2Second + "\n");
        if (str1.indexOf(str2)!=-1) {
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        } else {
            System.out.println(str2 + " is NOT found in " + str1);
        }
        
    }
}