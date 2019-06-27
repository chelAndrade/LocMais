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
public class CadastroFuncionario {

    Funcionario funcionario;    
    
    public CadastroFuncionario(String nome,String endereco, String telefone,String cpf, float salario, String cargo) {
        
        this.funcionario = new Funcionario();
        this.funcionario.setNome(nome);
        this.funcionario = new Funcionario();
        this.funcionario.setEndereco(endereco);
        this.funcionario = new Funcionario();
        this.funcionario.setTelefone(telefone);
        this.funcionario = new Funcionario();
        this.funcionario.setCpf(cpf);
        this.funcionario = new Funcionario();
        this.funcionario.setSalario(salario);
        this.funcionario = new Funcionario();
        this.funcionario.setCargo(cargo);
        
   
        
        
    }

    
    
}
