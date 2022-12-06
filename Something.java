import java.util.Scanner;

public class Something {


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int N, G;
        String text;
        
        System.out.println("Enter Text:");
        text = scanner.nextLine().toUpperCase();
        System.out.println("Enter N:");
        N = scanner.nextInt();
        System.out.println("Enter G:");
        G = scanner.nextInt();

        System.out.println("Encryption");
        String encryptedText = Encryption(N,G,text);

        System.out.println("\n");
        System.out.println("Decryption");
        Decryption(N,G,encryptedText);

    }

    static String Encryption(int N, int G, String text) {
        StringBuilder encryptedText = new StringBuilder();

        System.out.print(" | ");
        for (int i = 0; i < text.length(); i++) {
            System.out.printf( "%-3s | ", text.charAt(i));
        }
        System.out.println();

        System.out.print(" | ");
        for (int i = 0; i < text.length(); i++) {
            System.out.printf("%-3d | ", (int)(text.charAt(i) - 'A'));
        }
        System.out.println();

        System.out.print(" | ");
        for (int i = 1; i <= text.length(); i++) {
            int NG = i % 2 == 1 ? i * N * G : -i * N * G;
            System.out.printf( "%-3d | ", NG);
        }
        System.out.println();

        System.out.print(" | ");
        for (int i = 1; i <= text.length(); i++) {
            int NG = i % 2 == 1 ? i * N * G : -i * N * G;
            int newNum = (NG + (int)(text.charAt(i - 1) - 'A'));
            System.out.printf( "%-3d | ", newNum);
        }
        System.out.println();

        System.out.print(" | ");
        for (int i = 1; i <= text.length(); i++) {
            int NG = i % 2 == 1 ? i * N * G : -i * N * G;
            int newNum = (NG + (int)(text.charAt(i - 1) - 'A')) % 26;
            if (newNum < 0)
                newNum += 26;
            System.out.printf( "%-3d | ", newNum);
        }
        System.out.println();

        System.out.print(" | ");
        for (int i = 1; i <= text.length(); i++) {
            int NG = i % 2 == 1 ? i * N * G : -i * N * G;
            int newNum = (NG + (int)(text.charAt(i - 1) - 'A')) % 26;
            if (newNum < 0)
                newNum += 26;
            System.out.printf( "%-3s | ", (char)('A' + newNum));
            encryptedText.append((char)('A' + newNum));
        }
        System.out.println();
        return encryptedText.toString();
    }

    static String Decryption(int N, int G, String text) {
        StringBuilder decryptedText = new StringBuilder();
        System.out.print(" | ");
        for (int i = 0; i < text.length(); i++) {
            System.out.printf( "%-3s | ", text.charAt(i));
        }
        System.out.println();

        System.out.print(" | ");
        for (int i = 0; i < text.length(); i++) {
            System.out.printf("%-3d | ", (int)(text.charAt(i) - 'A'));
        }
        System.out.println();

        System.out.print(" | ");
        for (int i = 1; i <= text.length(); i++) {
            int NG = i % 2 == 1 ? i * N * G : -i * N * G;
            System.out.printf( "%-3d | ", NG);
        }
        System.out.println();

        System.out.print(" | ");
        for (int i = 1; i <= text.length(); i++) {
            int NG = i % 2 == 1 ? i * N * G : -i * N * G;
            int newNum = (-NG + (int)(text.charAt(i - 1) - 'A'));
            System.out.printf( "%-3d | ", newNum);
        }
        System.out.println();

        System.out.print(" | ");
        for (int i = 1; i <= text.length(); i++) {
            int NG = i % 2 == 1 ? i * N * G : -i * N * G;
            int newNum = (-NG + (int)(text.charAt(i - 1) - 'A')) % 26;
            if (newNum < 0)
                newNum += 26;
            System.out.printf( "%-3d | ", newNum);
        }
        System.out.println();

        System.out.print(" | ");
        for (int i = 1; i <= text.length(); i++) {
            int NG = i % 2 == 1 ? i * N * G : -i * N * G;
            int newNum = (-NG + (int)(text.charAt(i - 1) - 'A')) % 26;
            if (newNum < 0)
                newNum += 26;
            System.out.printf( "%-3s | ", (char)('A' + newNum));
            decryptedText.append((char)('A' + newNum));
        }
        System.out.println();
        return decryptedText.toString();
    }
}
