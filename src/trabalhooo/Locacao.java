/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

import java.util.Date;

/**
 *
 * @author miche
 */
public class Locacao {
    
   private Date dataLocacao;
   private Date dataDevolucao;

    /**
     * @return the dataLocacao
     */
    public Date getDataLocacao() {
        return dataLocacao;
    }

    /**
     * @param dataLocacao the dataLocacao to set
     */
    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    /**
     * @return the dataDevolucao
     */
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
   
   public boolean alugar(){
       return true;
   }
   
   public boolean  devolver(){
     return true;
   }
}
