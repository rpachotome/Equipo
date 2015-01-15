package boletin15;

import javax.swing.JOptionPane;
/**
 * 
 * @author rpachotome
 */
public class Adestrador extends Equipo {

    private String idFederacion;
/**
 * Constructor vacío
 */
    public Adestrador() {

    }
/**
 * Contstructor con parámetros
 * @param id
 * @param nome
 * @param apelidos
 * @param idade
 * @param idFederacion 
 */
    public Adestrador(int id, String nome, String apelidos, int idade, String idFederacion) {

    }
/**
 * Metodo vacío que no devuelve nada
 */
    public void dirixirPartido() {

    }
/**
 * Metodo vacío que no devuelve nada
 */
    public void dirixirAdestramento() {

    }
/**
*Se sobreescribe el metodo de la superclase con un mensaje diferente que mostrar por pantalla
*/
    @Override
    public void viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os adestradores");
    }
/**
*Se sobreescribe el metodo de la superclase con toString que une la información
*/
    @Override
    public String toString() {
        return super.toString() + "\nID da Federación:  " + idFederacion;
    }

    @Override
    public void amosarTipoPers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
