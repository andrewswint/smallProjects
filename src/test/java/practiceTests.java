import org.junit.Test;
import static org.junit.Assert.*;
import exercises.*;

public class practiceTests {

    @Test
    public void perimeterTest (){
        assertEquals(14, edabit.perimeter(3,4));
        assertEquals(0, edabit.perimeter(0,5));

    }

}
