import christmas.Reindeer;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReindeerTest {

    @Test
    public void testCreationOfReindeer() {
        Reindeer dancer = new Reindeer("dancer");
        Reindeer prancer = null;
        assertNotNull(dancer);
        assertNull(prancer);
    }

}
