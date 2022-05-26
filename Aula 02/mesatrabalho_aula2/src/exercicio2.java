import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os três números: ");
        System.out.println("O maior é: " + qualeMaior(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        sc.close();
    }
    public static Integer qualeMaior(Integer a, Integer b, Integer c) {
        return Integer.max(Integer.max(a,b), c);
    }
}
