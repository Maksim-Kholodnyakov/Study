import java.util.Arrays;

public class Separator {
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int a = 0;
        int b = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ++a;

            }
        }

        int[] array1 = new int[a];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array1[b] = array[i];
                ++b;
            }
        }
        return array1;
    }

    public static void main(String[] args) {
        Separator w = new Separator(new int[]{2,3,1234,7});
        System.out.println(Arrays.asList(w.even()));
    }
}
