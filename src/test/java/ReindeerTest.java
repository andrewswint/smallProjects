import christmas.Reindeer;
import christmas.Santa;
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

    @Test
    public void testAddingToArray() {
        Reindeer[] reindeer = new Reindeer[0];
        Reindeer prancer = new Reindeer("prancer");
        assertEquals(0,reindeer.length);
        reindeer = Santa.addReindeer(reindeer, prancer);
        System.out.println(reindeer.length);
        assertEquals(1, reindeer.length);
    }

}
