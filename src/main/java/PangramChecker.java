import java.util.*;

/*
Determine if a sentence is a pangram. A pangram is a sentence using every
letter of the alphabet at least once. The best known English pangram is:

The quick brown fox jumps over the lazy dog.

The alphabet used consists of ASCII letters a to z, inclusive, and is case
insensitive. Input will not contain non-ASCII symbols.
 */
public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase().replaceAll("[^a-z]", "");
        char[] sentence = input.toCharArray();

        Set<Character> alphabet = new HashSet<>();
        for (char c : sentence) alphabet.add(c);

        return alphabet.size() == 26;
    }

}