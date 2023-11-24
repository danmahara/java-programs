package Assignment_03;

public class Pattern11_14 {

    public static void main(String args[]) {
        byte i, j;
        char ch = 'A';
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }

    }
}
