package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author rpachotome
 */
public class Masaxista extends Equipo {

    private String titulacion;
    private int anosExperiencia;

    /**
     *Constructor vacío
     */
    public Masaxista() {

    }

    /**
     *
     * @param id
     * @param nome
     * @param apelidos
     * @param idade
     * @param titulacion
     * @param anosExperiencia
     */
    public Masaxista(int id, String nome, String apelidos, int idade, String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;

    }

    /**
     *método vacío que no devuelve nada
     */
    public void darMasaxe() {

    }
/**
*Se sobreescribe el metodo de la superclase con un mensaje diferente que mostrar por pantalla
*/
    @Override
    public void viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os masaxistas");
    }
/**
*Se sobreescribe el metodo de la superclase con toString que une la información
*/
    @Override
    public String toString() {
        return super.toString() + "\nTitulación: " + titulacion + "\nAnos d eexperiencia: " + anosExperiencia;
    }
    /**
**Muestra el tipo de empleo que desarrolla dentro del equipo
*/
    public void amosarTipoPers(){
        System.out.println("Masajistas!");
    }

}
