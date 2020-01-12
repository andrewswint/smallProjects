import emailApp.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmailTest {
    Email test1;
    @Before
    public void creation() throws Exception {
        test1 = new Email("testFirst", "testLast");
    }

    @Test
    public void testCreationOfEmailAccount() {
        Email test2 = null;
        assertNotNull(test1);
        assertNull(test2);
    }

    @Test
    public void testEmailGetters() {
        assertEquals("testFirst", test1.getFirstName());
        assertEquals("testLast", test1.getLastName());
    }

    @Test
    public void testDepartmentMethod() {
        
    }

}
