package boletin15;

import javax.swing.JOptionPane;
/**
 * 
 * @author rpachotome
 */
public class Xogador extends Equipo {

    private int dorsal;
    private String desmarcar;
    /**
     * Construtor vacío
     */

    public Xogador() {

    }
    /**
     * Contructor con parámetros
     * @param id
     * @param nome
     * @param apelidos
     * @param idade
     * @param dorsal
     * @param desmarcar 
     */

    public Xogador(int id, String nome, String apelidos, int idade, int dorsal, String desmarcar) {
        this.dorsal = dorsal;
        this.desmarcar = desmarcar;
    }
/**
 * Metodo vacío que no devuelve nada
 */
    public void xogarPartido() {

    }
/**
 * Metodo vacío que no devuelve nada
 */
    public void entrenar() {

    }
/**
*Se sobreescribe el metodo de la superclase con un mensaje diferente que mostrar por pantalla
*/
    @Override
    public void viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os xogadores");
    }
/**
*Se sobreescribe el metodo de la superclase con toString que une la información
*/
    @Override
    public String toString() {
        return super.toString() + "\nDorsal " + dorsal + "\nDesmarcar " + desmarcar;
    }

    @Override
    public void amosarTipoPers() {
        throw new UnsupportedOperationException("Xogador"); 
    }
}
