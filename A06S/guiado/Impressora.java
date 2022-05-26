package guiado;

import java.time.LocalDate;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate data;
    private int folhasDisponiveis;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private boolean temPapel() {
        if(folhasDisponiveis > 0) {
            return true;
        } else {
            return false;
        }
    }

    private String imprimirTexto(String texto) {
        if(this.temPapel()) {
            return texto;
        } else {
            return "Coloque papel na impressora";
        }
    }

    
}