package mesa;

public class Dog {
    private String raca;
    private int anoNascimento;
    private float peso;
    private boolean possuiChip;
    private boolean ferido;
    private String primeiroNome;  

    public void setRaca (String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPossuiChip(boolean possuiChip) {
        this.possuiChip = possuiChip;
    }

    public boolean getPossuiChip() {
        return possuiChip;
    }

    public void setFerido (boolean ferido) {
        this.ferido = ferido;
    }

    public boolean getFerido() {
        return ferido;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }


    public int calcularIdade() {

    }

    public boolean validarChip() {

    }

    public boolean aptoPraAdocao() {

    }
}