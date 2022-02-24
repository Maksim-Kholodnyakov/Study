import java.util.Arrays;
public class Tank2 {

   public static void main(String[] args) {
        String str = "ndsdsmnandmj"; //nnddsdmn
   /*     for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char c1 = str.charAt(j);
                if (c == c1) {
                    num++;
                    System.out.println(str.charAt(j));
                }
            }
        } */
       char[] ar = new char[str.length()];
       int y=0;
        int i=0;
        int o=0;
       // huu:
        while (i<(str.length()-1)) {
             //++y;
            System.out.println("cikl S bukv " + str.charAt(i));

            ++y;

            //while (j<str.length())
                for (int j = y; j < str.length(); ++j) {
                    System.out.println("bukva " + str.charAt(i) + " srav S bukv " +str.charAt(j));

                if (str.charAt(i)==str.charAt(j)) {
                    System.out.println("ravni");
                    //for (int l=0; l<str.length();l++) {
                     ++o;
                     for (int q=0;q<str.length();q++) {
                         if (ar[q]==str.charAt(j)) {
                             //ar[q]=null;
                             System.out.println("ne PRISV");

                         } else {

                             System.out.println("ZAPIS V MASS");
                             ar[o] = str.charAt(j);
                         }
                     }
                        //ar[o] = str.charAt(j);
                       // i++;
                        //continue huu;
                   // }
                    //System.out.println(str.charAt(j));

                }

                }
            //j++;
            i++;
       }
        Arrays.sort(ar);

       for (int z=0; z<str.length();z++) {

           System.out.println(ar[z]);
       }
    }
}




