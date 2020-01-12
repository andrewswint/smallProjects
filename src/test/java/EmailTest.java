import emailApp.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmailTest {

    @Test
    public void testCreationOfEmailAccount() {
        Email test1 = new Email("TestFirst", "testLast");
        Email test2 = null;
        assertNotNull(test1);
        assertNull(test2);
    }

    @Test
    public void testEmailGetters() {
        Email test1 = new Email("testFirst", "testLast");
        assertEquals("testFirst", test1.getFirstName());
        assertEquals("testLast", test1.getLastName());
    }

}
