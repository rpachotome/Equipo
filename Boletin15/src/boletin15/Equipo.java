package boletin15;

import javax.swing.JOptionPane;
/**
 * Este metodo funciona como superclase
 * @author rpachotome
 * @version 1.0
 */
public abstract class Equipo {

    private int id;
    private String nome;
    private String apelidos;
    private int idade;
/**
 * Constructor vacío
 */
    public void Equipo() {

    }
    /**
     * Constructor con parámetros
     * @param id
     * @param nome
     * @param apelidos
     * @param idade 
     */

    public void Equipo(int id, String nome, String apelidos, int idade) {
        this.id = id;
        this.nome = nome;
        this.apelidos = apelidos;
        this.idade = idade;
    }
/**
 * Este método sirve para mostrar un mensaje en un cuadro de diálogo
 */
    public void concentrarse() {
        JOptionPane.showMessageDialog(null, "Concentrase a selección");
    }
/**
 * Este método tambien sirve para mostrar un mensaje en un cuadro de diálogo
 */
    public  void viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa a selección");
    }
/** 
 * Este método agrupa información para mostrarla como un String posteriormente
 * @return String a
 */
    public String toString() {
        String a = "Id: " + id + "\nNome: " + nome + "\nApelidos: " + apelidos + "\nIdade: " + idade;
        return a;
    }
public abstract void amosarTipoPers();
// método abtracto
}
