import java.util.Arrays;

public class main {

    public static int[] flip (int[] array) {
        for(int x = 0, y = array.length - 1; x <= (array.length / 2) -1 && y >= (array.length / 2); x++, y--) {
                int temp1 = array[x];
                int temp2 = array[y];
                array[x] = temp2;
                array[y] = temp1;
        }
        return array;
    }

    public static void main (String[] args) {
		int[] arr = {1,2,3,4,5,6};

//		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(flip(arr)));

    }
}
