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
public class FilmeTerror  extends Filme{
    private String classificacaoIndicativa;


    public FilmeTerror( String titulo, String anoLancamento, String classificacaoIndicativa, int quantDisponivel, float valorAlocacao) {
        super( titulo, anoLancamento, classificacaoIndicativa, quantDisponivel, valorAlocacao);
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
     
}