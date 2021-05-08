package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.mirror.Mirror;

public class GHappyTest {
    @ParameterizedTest(name = "{0}({1}, {2})")
    @CsvSource({
        // Happy Words
        "'happy-word',xxggxx,true", "'happy-word',xggxggxx,true", "'happy-word',ggg,true",
    })
    public void testAlgorithmTrue(String partition, String word, String expectedResult) {
        Boolean result = new GHappy().gHappy(word);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest(name = "{0}({1}, {2})")
    @CsvSource({
        // Happy Words
        "'happy-word',xxgxx,false", "'happy-word',xxggyygxx,false", "'happy-word',g,false",
    })
    public void testAlgorithmFalse(String partition, String word, String expectedResult) {
        Boolean result = new GHappy().gHappy(word);
        Assertions.assertFalse(result);
    }
}
