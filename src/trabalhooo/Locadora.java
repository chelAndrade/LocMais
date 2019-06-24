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
    private ArrayList<String> fornecedores = new ArrayList();
    private ArrayList<String> filmes = new ArrayList();
    private ArrayList<String> pessoas = new ArrayList();

    public boolean buscaFornecedor(String fornecedor){
        String nome;
        for (int i = 0; i < getFornecedores().size(); i++) {
            nome = getFornecedores().get(i);
            if(getFornecedores().get(i) == fornecedor) {
                return true;  
            }
        }
         return false;
    }
    
    public boolean buscaFilme(String filme){
        String nome;
        for (int i = 0; i < this.getFilmes().size(); i++) {
            nome = this.getFilmes().get(i);  
             if (this.getFilmes().get(i) == filme) {
                return true;
            }
        }
         return false;
    }
    
    public boolean buscaPessoa(String pessoa){
        for (int i = 0; i < getPessoas().size(); i++) {
            if(this.getPessoas().get(i) == pessoa)
                return true;  
        }
        return false;  
    }
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
     * @return the fornecedores
     */
    public ArrayList<String> getFornecedores() {
        return fornecedores;
    }

    /**
     * @param fornecedores the fornecedores to set
     */
    public void setFornecedores(ArrayList<String> fornecedores) {
        this.fornecedores = fornecedores;
    }

    /**
     * @return the filmes
     */
    public ArrayList<String> getFilmes() {
        return filmes;
    }

    /**
     * @param filmes the filmes to set
     */
    public void setFilmes(ArrayList<String> filmes) {
        this.filmes = filmes;
    }

    /**
     * @return the pessoas
     */
    public ArrayList<String> getPessoas() {
        return pessoas;
    }

    /**
     * @param pessoas the pessoas to set
     */
    public void setPessoas(ArrayList<String> pessoas) {
        this.pessoas = pessoas;
    }
    
}
