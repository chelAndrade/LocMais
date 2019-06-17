/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

import java.util.Date;



/**
 *
 * @author michel,Christian 
 */
public class Filme {
     private int idFilme;
     private String titulo;
     private Date anoLancamento;
     private String classificacaoIndicativa;
     private int quantiDisponivel;
     private float valorAlocacao;
     private float valorCompra;

    /**
     * @return the idFilme
     */
    public int getIdFilme() {
        return idFilme;
    }

    /**
     * @param idFilme the idFilme to set
     */
    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the anoLancamento
     */
    public Date getAnoLancamento() {
        return anoLancamento;
    }

    /**
     * @param anoLancamento the anoLancamento to set
     */
    public void setAnoLancamento(Date anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    /**
     * @return the classificacaoIndicativa
     */
    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    /**
     * @param classificacaoIndicativa the classificacaoIndicativa to set
     */
    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    /**
     * @return the quantiDisponivel
     */
    public int getQuantiDisponivel() {
        return quantiDisponivel;
    }

    /**
     * @param quantiDisponivel the quantiDisponivel to set
     */
    public void setQuantiDisponivel(int quantiDisponivel) {
        this.quantiDisponivel = quantiDisponivel;
    }

    /**
     * @return the valorAlocacao
     */
    public float getValorAlocacao() {
        return valorAlocacao;
    }

    /**
     * @param valorAlocacao the valorAlocacao to set
     */
    public void setValorAlocacao(float valorAlocacao) {
        this.valorAlocacao = valorAlocacao;
    }

    /**
     * @return the valorCompra
     */
    public float getValorCompra() {
        return valorCompra;
    }

    /**
     * @param valorCompra the valorCompra to set
     */
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
     
     public void cadastrarFilme(int idFilme,String titulo,Date anoLancamento,String classificacaoIndicativa,int quantiDisponivel){
         
     }
     
     public void adicionarFilme(int idFilme,String titulo,Date anoLancamento,String classificacaoIndicativa,int quantiDisponivel){
     
     }
     
     public void excluirFilme(int idFilme,String titulo,Date anoLancamento,String classificacaoIndicativa,int quantiDisponivel){
     }
     
     public void editarFilme(int idFilme,String titulo,Date anoLancamento,String classificacaoIndicativa,int quantiDisponivel){
     }
     
}
