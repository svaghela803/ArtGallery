import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ArtworkTest {
import org.junit.jupiter.api.Test;


    class MainTest {

        @Test
        void myFirstTest() {

//            Given
            String input = "HELLO";

//            When
            String actual = input.toLowerCase();

//            Then
            String expected = "hello";
            assertThat(actual).isEqualTo(expected);

        }
    }

}
