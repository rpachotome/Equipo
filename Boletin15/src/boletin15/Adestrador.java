package boletin15;

import javax.swing.JOptionPane;

public class Adestrador extends Equipo {

    private String idFederacion;

    public Adestrador() {

    }

    public Adestrador(int id, String nome, String apelidos, int idade, String idFederacion) {

    }

    public void dirixirPartido() {

    }

    public void dirixirAdestramento() {

    }

    @Override
    public void viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os adestradores");
    }

    @Override
    public String toString() {
        return super.toString() + "\nID da Federación:  " + idFederacion;
    }

    @Override
    public void amosarTipoPers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
