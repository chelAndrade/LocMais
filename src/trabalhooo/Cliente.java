/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

/**
 *
 * @author miche
 */
public class Cliente extends Pessoa{
  
    private String loginUsuario;
    private float saldo;
    
    
    public Cliente(){
        this.loginUsuario = loginUsuario;
        this.saldo = saldo;
    }

    /**
     * @return the loginUsuario
     */
    public String getLoginUsuario() {
        return loginUsuario;
    }

    /**
     * @param loginUsuario the loginUsuario to set
     */
    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }
    
    public float  getSaldo(){
        return saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    /*public void buscarUsuario(int idPessoa){
        
    }*/
    
    public void verificarPendencias(float saldo){
        
    }

    
}
