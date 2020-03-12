import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import exercises.*;

public class practiceTests {

    @Test
    public void perimeterTest(){
        assertEquals(14, edabit.perimeter(3,4));
        assertEquals(0, edabit.perimeter(0,5));

    }

    @Test
    public void denimFlipTest() {
        int[] arr ={1,2,3,4};
        int[] arr2 = new int[0];
        Assert.assertArrayEquals(new int[]{4,3,2,1}, denimFlip.flip(arr));
        Assert.assertArrayEquals(new int[]{}, denimFlip.flip(arr2));

    }

}
