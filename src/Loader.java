import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }

    }
    private static boolean checkName(String name) {
        int a=0;
        boolean b=true;
        String nam;
        nam=name.trim();
        String[] name1 = nam.split(" ");
        for (String name2: name1) {
            ++a;
            if  (name1[0].length()> name1[1].length()) {
                if (name1[0].length() > name1[2].length() && name1[2].length() > name1[1].length()) {
                    System.out.println(name1[0] + " " + name1[2] + " " + name1[1]);
                } else System.out.println(name1[0] + " " + name1[1] + " " + name1[2]);
            }
        }
        if (a!=3) {
            b= false;
        } else {
            System.out.println(name);
        }
        return b;

    }

    }



      /*  String a = "Иван Иванов";
        String b = " вон ир hjghj gjgj ";
        chekUserName(a,b);
    }

    public static void chekUserName(String a, String b) {
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Выберите другое имя пользователя");
        } else {
            System.out.println("Отличное имя!");
            b=b.trim();
            b=b.replaceAll("\\s","");
            System.out.println("Ваше имя имеет длину <" + b.length() +"> символов");

        }
    } */