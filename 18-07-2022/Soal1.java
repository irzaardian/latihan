import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buku[] = { "Inventing Anna", "A Walk To Remember", "Pride and Prejudice",
                "Harry Potter and The Goblet of Fire", "Anna Karenina", "The Walking Dead",
                "Harry Potter and The Deathly Hollows" };
        String buku_op[] = new String[buku.length];
        String input = sc.nextLine();
        sc.close();
        for (int i = 0; i < buku_op.length; i++) {
            buku_op[i] = buku[i].toLowerCase();
        }
        for (int i = 0; i < buku_op.length; i++) {
            for (int j = i + 1; j < buku_op.length; j++) {
                if (buku_op[i].compareTo(buku_op[j]) > 0) {
                    String temp = buku_op[i];
                    buku_op[i] = buku_op[j];
                    buku_op[j] = temp;

                    String temp_buku = buku[i];
                    buku[i] = buku[j];
                    buku[j] = temp_buku;
                }
            }
        }
        for (int i = 0; i < buku_op.length; i++) {
            if (buku_op[i].contains(input)) {
                System.out.println(buku[i]);
            }
        }
    }
}
