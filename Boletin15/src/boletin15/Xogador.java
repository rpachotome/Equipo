package boletin15;

import javax.swing.JOptionPane;

public class Xogador extends Equipo {

    private int dorsal;
    private String desmarcar;

    public Xogador() {

    }
    

    public Xogador(int id, String nome, String apelidos, int idade, int dorsal, String desmarcar) {
        this.dorsal = dorsal;
        this.desmarcar = desmarcar;
    }

    public void xogarPartido() {

    }

    public void entrenar() {

    }

    @Override
    public void viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os xogadores");
    }

    @Override
    public String toString() {
        return super.toString() + "\nDorsal " + dorsal + "\nDesmarcar " + desmarcar;
    }

    @Override
    public void amosarTipoPers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
