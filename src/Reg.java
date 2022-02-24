import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    char с='n';
/*
    public static void main(String[] args) {

        String stringTest = "[а-яА-Я]*[n]{1,}[а-яА-Я]*";
        String text = "Ночь, улица, фоnарь, аптека,\n" +
                "Бессмыслеnnый и тусклый свет.\n" +
                "Живи еще хоть четверть века —\n" +
                "Всё будет так. Исхода nет.\n" +
                "\n" +
                "Умрешь — nачнешь опять сnачала\n" +
                "И повторится всё, как встарь:\n" +
                "Ночь, ледяnая рябь каnала,\n" +
                "Аптека, улица, фоnарь.";
        Pattern pattern = Pattern.compile(stringTest);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    } */
public static void main(String[] args) {
    String text = "Ночь, street, фонарь, аптека,\n" +
            "Бессмысленый и тусклый свет.\n" +
            "Живи еще хоть четверть века —\n" +
            "Всё будет так. Исхода nет.\n" +
            "\n" +
            "Умрешь — начнешь опять сначала\n" +
            "И повторится всё, как встарь:\n" +
            "Ночь, ледяная рябь канала,\n" +
            "Аптека, street, фонарь.";
    Pattern pattern = Pattern.compile("\s(street)\s");

    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
        int start = matcher.start();
        int end = matcher.end();
        System.out.println("Found match\n" + text.substring(start, end) + "\nfrom " + start + " to " + (end - 1));

    }

    System.out.println("Clean the text");
    System.out.println(matcher.replaceAll("улица"));
    System.out.println(text);

}
}


    /* public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.deleteCharAt(2);
            System.out.println((System.currentTimeMillis() - startTime));
        }
    }

     */


