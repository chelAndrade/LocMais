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
public class FilmeTerror  extends Filme{
    private String classificacaoIndicativa;

    public FilmeTerror(int idFilme, String titulo, Date anoLancamento, String classificacaoIndicativa, int quantiDisponivel, float valorAlocacao, float valorCompra) {
        super(idFilme, titulo, anoLancamento, classificacaoIndicativa, quantiDisponivel, valorAlocacao, valorCompra);
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
    
     public void classificarIdade(String idade){
         if (this.classificacaoIndicativa == "16") {
             System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
            }else{
                if (this.classificacaoIndicativa == "18") {
                    System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
                    }
                }
     }
      
    public boolean disponAluguel(int idFilme){
        return true;
    }
}
