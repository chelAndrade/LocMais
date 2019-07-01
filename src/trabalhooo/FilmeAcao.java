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
public class FilmeAcao extends Filme{
     private int classificacaoIndicativa;
     private int quantDisponivel;


    public FilmeAcao(String titulo, String anoLancamento, int classificacaoIndicativa, int quantDisponivel, float valorAlocacao) {
        super(titulo, anoLancamento, classificacaoIndicativa, quantDisponivel, valorAlocacao);

    

    }
     
    
    /**
     * @return the classificacaoIndicativa
     */
    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    /**
     * @param classificacaoIndicativa the classificacaoIndicativa to set
     */
    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
    
    /**
     * @return the quantDisponivel
     */
    public int getQuantiDisponivel() {
        return quantDisponivel;
    }

    /**
     * @param quantDisponivel the quantDisponivel to set
     */
    public void setQuantiDisponivel(int quantDisponivel) {
        this.quantDisponivel = quantDisponivel;
    }
       
    public void classificarIdade(String idade){
        if (this.classificacaoIndicativa == 0) {
            System.out.println("O usuario pode alugar o filme");
            
        }else{
            if (this.classificacaoIndicativa == 12) {
                 System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
            }else{
                if (this.classificacaoIndicativa == 14) {
                    System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
                }else{
                    if (this.classificacaoIndicativa == 16) {
                        System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
                    }else{
                        if (this.classificacaoIndicativa == 18) {
                            System.out.println("O usuario so pode alugar o filme mediante apresentacao de documento");
                        }
                    }
                }
            }
        }  
    }  
}
