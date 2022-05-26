/**
 * Caminhão
 */
public class Caminhão {
    private String marca;
    private String patente;
    private static double valorCombustivel;
        public void Caminhao(String modelo, String patente, double combustivel) {
            this.marca = modelo;
            this.patente = patente;
        }
    public double gastoCombustivel(int litros) {
        return litros * Caminhão.valorCombustivel;
    }
    public double mudarPrecoCombustivel(double preco) {
        return valorCombustivel = preco;
    }
}