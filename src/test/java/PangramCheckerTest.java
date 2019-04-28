import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PangramCheckerTest {

    private PangramChecker pangramChecker;

    @Before
    public void setup() {
        pangramChecker = new PangramChecker();
    }

    @Test
    public void testEmptySentenceIsNotPangram() {
        assertFalse(pangramChecker.isPangram(""));
    }

    @Test
    public void testPerfectLowerCasePangram() {
        assertTrue(pangramChecker.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testPangramWithOnlyLowerCaseLettersIsRecognizedAsPangram() {
        assertTrue(pangramChecker.isPangram("the quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void testPhraseMissingCharacterXIsNotPangram() {
        assertFalse(pangramChecker.isPangram("a quick movement of the enemy will jeopardize five gunboats"));
    }

    @Test
    public void testPhraseMissingAnotherCharacterIsNotPangram() {
        assertFalse(pangramChecker.isPangram("five boxing wizards jump quickly at it"));
    }

    @Test
    public void testPangramWithUnderscoresIsRecognizedAsPangram() {
        assertTrue(pangramChecker.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }

    @Test
    public void testPangramWithNumbersIsRecognizedAsPangram() {
        assertTrue(pangramChecker.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }

    @Test
    public void testPhraseWithMissingLettersReplacedByNumbersIsNotPangram() {
        assertFalse(pangramChecker.isPangram("7h3 qu1ck brown fox jumps ov3r 7h3 lazy dog"));
    }

    @Test
    public void testPangramWithMixedCaseAndPunctuationIsRecognizedAsPangram() {
        assertTrue(pangramChecker.isPangram("\"Five quacking Zephyrs jolt my wax bed.\""));
    }

    @Test
    public void testUpperAndLowerCaseVersionsOfTheSameCharacterShouldNotBeCountedSeparately() {
        assertFalse(pangramChecker.isPangram("the quick brown fox jumps over with lazy FX"));
    }
}