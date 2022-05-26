import java.util.Scanner;

public class alimentarDog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do cachorrinho: ");
        String nome = in.next();
        System.out.println("Digite a quantidade de ração: ");
        float qtdRacao = in.nextFloat();
        System.out.println(quantosPacotes(nome, qtdRacao));
        in.close();
    }
    public static String quantosPacotes(String nome, float qtdRacao) {
        Scanner in = new Scanner(System.in);
        int pacote = 0;
        float peso = 0.0f;

        if(qtdRacao >= 3) {
            while(peso < pacote) {
                System.out.println("Digite o peso por pacote: ");
                float pesoPorPacoteDigitado = in.nextFloat();
                peso = peso + pesoPorPacoteDigitado;
                pacote = pacote + 1;
            }
            return "O cachorrinho " + nome + "precisa de " + pacote + "por dia";
        } else {
            return "O cachorro ladrou a noite inteira, perdeu!";
        }
    }
}