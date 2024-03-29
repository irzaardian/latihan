import java.util.ArrayList;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        String formatChecker[] = a.split(" ");
        ArrayList<String> opearatorChecker = new ArrayList<String>();
        opearatorChecker.add("+");
        opearatorChecker.add("-");
        opearatorChecker.add("*");
        opearatorChecker.add("/");
        boolean containOperator = opearatorChecker.contains(formatChecker[formatChecker.length - 1]);

        if (containOperator == false) {
            a = a.replace(" ", "");

            String numberStr[] = a.split("[+*/()-]+");
            String operatorStr[] = a.split("[.\\d]+");
            int result = Integer.parseInt(numberStr[0]);

            for (int i = 1; i < operatorStr.length; i++) {
                switch (operatorStr[i]) {
                    case "+":
                        result += Integer.parseInt(numberStr[i]);
                        break;
                    case "-":
                        result -= Integer.parseInt(numberStr[i]);
                        break;
                    case "*":
                        result *= Integer.parseInt(numberStr[i]);
                        break;
                    case "/":
                        result /= Integer.parseInt(numberStr[i]);
                        break;
                }
            }
            System.out.println(result);
        } else {
            System.out.println("Input tidak valid");
        }
    }
}
