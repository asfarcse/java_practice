package stringExample;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckVowel {
    public static void main(String[] args) {
    	List<Character> character = Arrays.asList('a','s','f','a','r');
    	Set<Character> charSet = character.stream().filter(c->isVowel(c)).collect(Collectors.toSet());
    	System.out.println(charSet);
    }

    
    private static boolean isVowel(Character c) {
    	return "AEIOUaeiou".contains(c.toString());
    }
}
