import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GalleryTest {
import org.junit.jupiter.api.Test;


    class MainTest {

        @Test
        public void canPrintGalleryName() {

            //Given
            String input = "HELLO";

//            When
            String actual = input.toLowerCase();

//            Then
            String expected = "hello";
            assertThat(actual).isEqualTo(expected);


        }
    }
}
