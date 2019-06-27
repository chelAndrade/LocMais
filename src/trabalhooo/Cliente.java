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
public class Cliente extends Pessoa{
  
    //construtor
    public Cliente(String nome,String cpf,String endereco,String telefone,int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
    }
    public Cliente leCliente(){
        Scanner teclado = new Scanner(System.in);
        String nome;
        String cpf;
        String endereco;
        String telefone;
        int idade;
        
        System.out.print("Digite o nome do cliente: ");
        nome = teclado.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        cpf = teclado.nextLine();
        System.out.println("Digite o endereco do cliente");
        endereco = teclado.nextLine();
        System.out.println("Digite o telefone do cliente");
        telefone = teclado.nextLine();
        System.out.println("Digite a idade do cliente");
        idade = teclado.nextInt();
        
        return new Cliente(nome, cpf, endereco, telefone, idade);
    }
    
    
}
