import emailApp.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmailTest {
    Email test1;
    @Before
    public void creation() throws Exception {
        test1 = new Email();
    }

    @Test
    public void testCreationOfEmailAccount() {
        Email test2 = null;
        assertNotNull(test1);
        assertNull(test2);
    }

    @Test
    public void testEmailGetters() {
        assertEquals("Andrew", test1.getFirstName());
        assertEquals("Swint", test1.getLastName());
    }

    @Test
    public void testPassword() {
        assertNotNull(test1.getPassword());
    }

    @Test
    public void testDepartmentMethod() {
        assertNotNull(test1.getDepartment());
    }

}