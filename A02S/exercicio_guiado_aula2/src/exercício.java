import java.util.Scanner;

public class exercício {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = leitor.next();
        String sobrenome = leitor.next();
        System.out.println("Digite sua data de nascimento: ");
        System.out.println(imprimeNome(nome, sobrenome)
        + nome.substring(0,1) + sobrenome.substring(0,1)
        + "Sua data de nascimento é: " + imprimeData(leitor.nextInt(), leitor.nextInt(), leitor.nextInt()));
        leitor.close();
    }
    public static String imprimeNome(String nome, String sobrenome) {
        return "Seu nome é: " + nome + " " + sobrenome;
    }
    public static String imprimeData(Integer dia, Integer mes, Integer ano) {
        return dia + "/" + mes + "/" + ano;
    }
}
