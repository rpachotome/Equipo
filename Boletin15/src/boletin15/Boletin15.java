package boletin15;

public class Boletin15 {
/** @author Raul
 * @version 1.0
 * @param args 
 */
    public static void main(String[] args) {
        Equipo equ = new Equipo() {

            @Override
            public void amosarTipoPers() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Masaxista masa = new Masaxista();
        Xogador xog = new Xogador();
        Adestrador ade = new Adestrador();
        xog.Equipo();
        equ.concentrarse();
        masa.concentrarse();
        xog.concentrarse();
        ade.concentrarse();
        equ.viaxar();
        xog.viaxar();
        masa.viaxar();
        ade.viaxar();

    }

}
