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
public class FilmeAventura extends Filme{
    private String classificacaoIndicativa;

<<<<<<< HEAD
    public FilmeAventura(String titulo, Date anoLancamento, String classificacaoIndicativa, int quantiDisponivel, float valorAlocacao, float valorCompra) {
        super(titulo, anoLancamento, classificacaoIndicativa, quantiDisponivel, valorAlocacao, valorCompra);
=======
    public FilmeAventura(int idFilme, String titulo, Date anoLancamento, String classificacaoIndicativa, int quantiDisponivel, float valorAlocacao, float valorCompra) {
        super(idFilme, titulo, anoLancamento, classificacaoIndicativa, quantiDisponivel, valorAlocacao, valorCompra);
>>>>>>> 33d221c8855a141f9036985a13e6a7228bba174c
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
          if (this.classificacaoIndicativa == "livre") {
            System.out.println("O usuario pode alugar o filme");
            
        }else{
            if (this.classificacaoIndicativa == "12") {
                 System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
            }else{
                if (this.classificacaoIndicativa == "14") {
                    System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
                }else{
                    if (this.classificacaoIndicativa == "16") {
                        System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
                    }else{
                        if (this.classificacaoIndicativa == "18") {
                            System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
                        }
                    }
                }
            }
        }  
        
    }
    
    public boolean disponAluguel(){
        return true;
    }
}
