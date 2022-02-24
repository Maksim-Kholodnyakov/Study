import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("VVedite chislo 1:");
        int operand1 = scanner.nextInt();
        System.out.println("Vvedite operand:");
        char operation = scanner.next().charAt(0);
        System.out.println("Vvedite chislo 2:");
        int operand2 = scanner.nextInt();
        System.out.println("Result:");
        System.out.println(Oper(operand1,operation,operand2));
    }

    public static int Oper(int oper1, char dei, int oper2) {
        int a=0;
        switch (dei) {
            case '+': a=oper1+oper2;
            break;
            case '-': a=oper1-oper2;
            break;
            case '/': a=oper1/oper2;
            break;
            case '*': a=oper1*oper2;
            break;
            default:
                System.out.println("Vvedite korrektniy operand");
        }
        return a;
    }



}





