/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

import java.util.ArrayList;

/**
 *
 * @author miche
 */
public class Locadora {
    private int quantFilmes;
    private String fornecedor[];
    private String filmes[];
    private String pessoas[];
    private int idPessoa;
    private int idFornecedor;
    private int idFilmes;

    
  
    /**
     * @return the quantFilmes
     */
    public int getQuantFilmes() {
        return quantFilmes;
    }

    /**
     * @param quantFilmes the quantFilmes to set
     */
    public void setQuantFilmes(int quantFilmes) {
        this.quantFilmes = quantFilmes;
    }

    /**
     * @return the fornecedor
     */
    public String[] getFornecedor() {
        System.out.println("");
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String[] fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the filmes
     */
    public String[] getFilmes() {
        return filmes;
    }

    /**
     * @param filmes the filmes to set
     */
    public void setFilmes(String[] filmes) {
        this.filmes = filmes;
    }

    /**
     * @return the pessoas
     */
    public String[] getPessoas() {
        return pessoas;
    }

    /**
     * @param pessoas the pessoas to set
     */
    public void setPessoas(String[] pessoas) {
        this.pessoas = pessoas;
    }
    
    
    
    public boolean buscaIdFornecedor(int idFornecedor){
        //ArrayList<String> fornecedor = new ArrayList<String>();
        //for(String fornecedorf : this.fornecedor){
         for (int i = 0; i < this.fornecedor.length; i++) {
            String string = this.fornecedor[i];
            /*if (this.fornecedor  == this.idFornecedor) {
                return this.fornecedor;  
            }else{
                return false;
            }*/
        }
         return true;
    }
    
    public boolean buscaIdFilmes(int idFilmes){
         for (int i = 0; i < this.filmes.length; i++) {
            String string = this.filmes[i];  
             /*if (this.filmes == this.idFilmes) {
                return this.filmes;
            }else{
                return false;
             }*/
        }
         return true;
    }
    
    public boolean buscaIdPessoa(int idPessoa){
        for (int i = 0; i < pessoas.length; i++) {
                String string = pessoas[i]; { 
                    /*if (this.pessoas == this.idPessoa) {
                        return this.pessoas;     
                }else{
                    return false;
                }*/
            }
            
        }
        return true;
    }
    
    public void alterarDados(){
        
    }
    
    public void excluirDados(){
        
    }
    
    
  
}
