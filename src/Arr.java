import java.util.Arrays;

public class Arr {

    public static void main(String[] args) {
        String st = "bdcagefhas";
        char[] arr = new char[st.length()];
        for (int i = 0; i < st.length(); i++) {
            arr[i] = st.charAt(i);
        }

        Arrays.sort(arr);

        for (int l = 0; l < arr.length; l++) {

            System.out.println(arr[l]);

        }

    }
}
