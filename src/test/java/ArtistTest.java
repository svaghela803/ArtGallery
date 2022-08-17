import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ArtistTest {

    import org.junit.jupiter.api.Test;


    class MainTest {

        @Test
        void canprintArtistname() {

//            Given
            String ArtistName = "DA VINCI"

//          When
            String actual = ArtistName.toLowerCase();

//            Then
            String expected = "da vinci";
            assertThat(actual).isEqualTo(expected);


        }
    }
}
