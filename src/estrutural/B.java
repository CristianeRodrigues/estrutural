/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutural;

/**
 *
 * @author Cristiane
 */
public class B {
    int codigoB;
    String nomeB;
    A ClassA;
    
    public int getCodigoB(){
        ClassA.setCodigoA(codigoB);
        return this.codigoB;
    }
    public void setCodigoB(int codigoB){
        this.codigoB = codigoB;
        ClassA.setCodigoA(codigoB);
    }
}
