import java.util.Scanner;

public class mesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu número");
        int numero = sc.nextInt();
        System.out.println(ePrimo(numero));
        sc.close();
    }
    public static boolean ePrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (eDivisivel(n, i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean eDivisivel(int n, int divisor) {
        return (n % divisor == 0);
    }
}
