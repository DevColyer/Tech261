import com.sparta.dc.katas.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class KataTests {

    private static class IntToIntArrayTestData {
        int[] input;
        int expected;

        IntToIntArrayTestData(int[] input, int expected) {
            this.input = input;
            this.expected = expected;
        }
    }

    static Stream<IntToIntArrayTestData> getIntToIntArrayTestData() {
        return Stream.of(
                new IntToIntArrayTestData(new int[]{0, 0, 1, 2, 3}, 123), // leading 0s
                new IntToIntArrayTestData(new int[]{1, 23, 4, 5}, 12345), // multiple digits
                new IntToIntArrayTestData(new int[]{1}, 1), // single digit
                new IntToIntArrayTestData(new int[]{}, 0) // empty array
        );
    }

    @ParameterizedTest
    @MethodSource("getIntToIntArrayTestData")
    @DisplayName("Given a series of integers, return the integer value of the appended digits")
    void testWeek2Kata1(IntToIntArrayTestData testData) {
        int actual = App.getWeek2Kata1(testData.input);
        Assertions.assertEquals(testData.expected, actual);
    }
}
