package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.chocolate.ChocolateBags;

public class MirrorTest {
    @ParameterizedTest(name = "{0}({1}, {2})")
    @CsvSource({
            // Full mirror word
            "'mirror-word',aba,ab", "'mirror-word',abcba,abc", "'mirror-word',a,a",
            // Word with one mirror character
            "'one-char-mirror',aBCa,a", "'one-char-mirror',gBbcsCg,g", "'one-char-mirror',aByba,a",
            // Word with many mirror characters
            "'many-char-mirror',abUIJDba,ab", "'many-char-mirror',uysURIEWHsyu,uys", "'many-char-mirror',GnMtreMnG,GnM",
            // Word with non mirror characters
            "'no-mirror-word',abc,''", "'no-mirror-word',gvdsdf,''", "'no-mirror-word',yhvs,''",
            // Word with non mirror characters
            "'even-mirror-word',abba,ab", "'even-mirror-word',bcgtrugcb,bcg", "'even-mirror-word',abcercba,abc",
    })
    public void testAlgorithm(String partition, String word, String expectedResult) {
        String result = new Mirror().mirrorEnds(word);
        Assertions.assertEquals(expectedResult, result);
    }
}
