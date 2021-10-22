package exercises;


import java.util.ArrayList;
import java.util.List;

public class codeWarsChallenges {

    public static String makeComplement(String dna) {
        List<Character> chars = new ArrayList<>();
        List<Character> newChars = new ArrayList<>();
        String lowerCaseDNA = dna.toLowerCase();
        for(char ch : lowerCaseDNA.toCharArray()) {
            chars.add(ch);
        }

        for (Character aChar : chars) {
            if (aChar.toString().equalsIgnoreCase("a")) {
                newChars.add('T');
            } else if (aChar.toString().equalsIgnoreCase("t")) {
                newChars.add('A');
            } else if (aChar.toString().equalsIgnoreCase("c")) {
                newChars.add('G');
            } else if (aChar.toString().equalsIgnoreCase("g")) {
                newChars.add('C');
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Character ch : newChars) {
            sb.append(ch);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(makeComplement("atcg"));
    }
}
