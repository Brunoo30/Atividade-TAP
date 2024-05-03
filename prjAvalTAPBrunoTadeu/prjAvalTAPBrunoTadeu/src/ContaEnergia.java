
/**
 *
 * @author Felipe Parra Alves
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ContaEnergia {
    private String numero;
    private int leituraAnterior;
    private int leituraAtual;

    public ContaEnergia(String numero) {
        this.numero = numero;
    }

    public void setLeituraAnterior(int leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public void setLeituraAtual(int leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public double calcConsumo() {
        return leituraAtual - leituraAnterior;
    }

    public double calcValorPagar() {
        double consumo = calcConsumo();
        if (consumo <= 100) {
            return consumo * 0.35;
        } else {
            return consumo * 0.60;
        }
    }
}
