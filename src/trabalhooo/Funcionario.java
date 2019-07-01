/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

import java.util.Scanner;

/**
 *
 * @author miche
 */
public class Funcionario extends Pessoa{
    private float salario;
    private String cargo;
    private String loginUsuario;
    
    public Funcionario(){}
    
    
    public Funcionario(float salario,String cargo){
        System.out.println("Digite a senha do funcionario");
        Scanner teclado = new Scanner(System.in);
        this.loginUsuario = teclado.nextLine();
        this.salario = salario;
        this.cargo = cargo;
        
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
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

}
