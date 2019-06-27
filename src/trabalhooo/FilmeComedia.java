
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
public class FilmeComedia extends Filme{
    private String classificacaoIndicativa;


    public FilmeComedia(String titulo, String anoLancamento, String classificacaoIndicativa, int quantDisponivel, float valorAlocacao) {
        super(titulo, anoLancamento, classificacaoIndicativa, quantDisponivel, valorAlocacao);
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
         if (this.getClassificacaoIndicativa() == "livre") {
            System.out.println("O usuario pode alugar o filme");
            
        }else{
            if (this.getClassificacaoIndicativa() == "12") {
                 System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
            }else{
                if (this.getClassificacaoIndicativa() == "14") {
                    System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
                }else{
                    if (this.getClassificacaoIndicativa() == "16") {
                        System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
                    }else{
                        if (this.getClassificacaoIndicativa() == "18") {
                            System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
                        }
                    }
                }
            }
        }  
     }
}
