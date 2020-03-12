import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;
import exercises.*;
import util.Input;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class practiceTests<TextFromStandardInputStream> {

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

    @Test
    public void nameConcatTest() {
        assertEquals("Andrew Swint", edabit.name("Andrew", "Swint"));
    }

    @Test
    public void EOFTest() {
        String data = "line 1\n" +
                "line 2\n" +
                "line 3\n";
        InputStream stdin = System.in;
        String output = "";
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            Scanner sc = new Scanner(System.in);
            int i = 0;
            while(sc.hasNext()) {
                String input = sc.nextLine();
                i++;
                output += (i + " " + input + "\n");
            }
        } finally {
            System.setIn(stdin);
        }
        assertEquals("1 line 1\n" +
                "2 line 2\n" +
                "3 line 3\n", output);
    }
}
