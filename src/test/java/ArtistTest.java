import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;

public class ArtistTest {

    import org.junit.jupiter.api.Test;

    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Vincent van Gogh");
    }

    @Test
    public void hasName(){
        assertThat(artist.getName()).isEqualTo("Vincent van Gogh");
    }
}

    }

