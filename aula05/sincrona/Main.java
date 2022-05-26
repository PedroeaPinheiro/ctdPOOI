public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(123);
        cliente.setNome("ana");
        System.out.println(cliente.getNome());

        cliente.aumentarDivida(100.0);
//        cliente.pagarDivida(50.0);

    }
}