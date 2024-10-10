package U2T7_P3_StringMethods;

public class CustomStringMethodsRunner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();

        boolean bool = methods.longerThan("pear", 4);
        System.out.println(bool);
        String str1 = methods.funnyString("laptop", 3);
        System.out.println(str1);
        String str2 = methods.halvesReversed("skies");
        System.out.println(str2);
        String str3 = methods.pigLatin("desk");
        System.out.println(str3);
        String str4 = methods.removeCharacter("October", 5);
        System.out.println(str4);
        String str5 = methods.insertAt("ghost", "hi!", "o");
        System.out.println(str5);
        String str6 = methods.endUp("It's Wednesday", 3);
        System.out.println(str6);
        String str7 = methods.yellOrWhisper("Hello!");
        System.out.println(str7);
                                                
        
        

    }
}
