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
public class A {
    int codigoA;
    String nomeA;
    
    public String getNomeA(){
        return this.nomeA;
    }
    
    public int getCodigoA(){
        System.out.println ("codigoA");
        return this.codigoA;
    }
    
    public void setCodigoA(int codigoA){
        System.out.println ("codigoA");
        this.codigoA = codigoA;
    }
    
}
