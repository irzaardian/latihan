import java.util.Random;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Game");
        Scanner sc = new Scanner(System.in);
        int mode = sc.nextInt();
        switch (mode) {
            case 1:
                System.out.print("Player 1: ");
                String pilihan_player1 = sc.next();
                System.out.print("Player 2: ");
                String pilihan_player2 = sc.next();
                sc.close();
                if (pilihan_player1.equals(pilihan_player2)) {
                    System.out.println("Seri!");
                } else if (pilihan_player1.equals("B")) {
                    if (pilihan_player2.equals("G"))
                        System.out.println("Player 1 menang!");
                    else if (pilihan_player2.equals("K"))
                        System.out.println("Player 2 menang!");
                } else if (pilihan_player1.equals("K")) {
                    if (pilihan_player2.equals("G"))
                        System.out.println("Player 2 menang!");
                    else if (pilihan_player2.equals("B"))
                        System.out.println("Player 1 menang!");
                } else if (pilihan_player1.equals("G")) {
                    if (pilihan_player2.equals("K"))
                        System.out.println("Player 1 menang!");
                    else if (pilihan_player2.equals("B"))
                        System.out.println("Player 2 menang!");
                } else
                    System.out.println("Invalid");
                break;
            case 2:
                String pilihan[] = { "B", "G", "K" };
                System.out.print("Player 1: ");
                String pilihan_user = sc.next();
                sc.close();
                String pilihan_comp = pilihan[random.nextInt(pilihan.length)];
                System.out.println("Computer: " + pilihan_comp);
                if (pilihan_user.equals(pilihan_comp)) {
                    System.out.println("Seri!");
                } else if (pilihan_user.equals("B")) {
                    if (pilihan_comp.equals("G"))
                        System.out.println("Player 1 menang!");
                    else if (pilihan_comp.equals("K"))
                        System.out.println("Computer menang!");
                } else if (pilihan_user.equals("K")) {
                    if (pilihan_comp.equals("G"))
                        System.out.println("Computer menang!");
                    else if (pilihan_comp.equals("B"))
                        System.out.println("Player 1 menang!");
                } else if (pilihan_user.equals("G")) {
                    if (pilihan_comp.equals("K"))
                        System.out.println("Player 1 menang!");
                    else if (pilihan_comp.equals("B"))
                        System.out.println("Computer menang!");
                } else
                    System.out.println("Invalid");
                break;
        }
    }
}
