/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokercartas;

/**
 *
 * @author Maria
 */
public class JuegoPoker {
    public static final int NADA = 0;
    public static final int PAREJA = 1;
    public static final int TRIO = 2;
    public static final int POKER = 3;
    public static final int REPOKER = 4;
    
    private int jugada;
    private int combinacion;
    
    public JuegoPoker(int jugada, int combinacion){
        this.jugada=jugada;
        this.combinacion= combinacion;
    }

    public int getCombinacion() {
        return combinacion;
    }

    
}
