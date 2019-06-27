/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

import static java.rmi.Naming.list;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author miche
 */
public class Locacao {
   
   Cliente cliente;
   List<Filme> filmes;
   Date dataLocacao;
   Calendar dataDevolucao;
   
   
   public Locacao(Cliente cliente, List<Filme> filmes) {
        this.cliente = cliente;
        this.filmes = filmes;
        this.dataLocacao = new Date();// data atual
        this.dataDevolucao = Calendar.getInstance();
        dataDevolucao.setTime(dataLocacao);
        dataDevolucao.add(Calendar.DATE, +3); //3 dias acrescentado a data atual
    }
   
    
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
    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
   
   public boolean alugar(){
       return true;
   }
   
   public boolean  devolver(){
     return true;
   }
   
   public static Locacao alugar(List<Filme> filmes, List<Cliente> clientes) {
        ArrayList<String> nomeFilmes = new ArrayList<>();
        String nomeCliente;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Filme> filmesSelecionados = new ArrayList<>();
        filmesSelecionados = null;
        Cliente clienteSelecionado = null;
        String parador = null;
        for(int i=0;parador != "N";i++){
            System.out.println("Digite o nome do filme:"+i+1);
            nomeFilmes.add(teclado.nextLine());
            System.out.println("Se Deseja alugar mais filmes digite 'S' senão digite 'N'");
            parador = teclado.nextLine();
        }
        System.out.println("Digite o nome do cliente:");
        nomeCliente = teclado.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.nome.equals(nomeCliente)) {
                clienteSelecionado = cliente;
                break;
            }
        }

        for (int i=0;i<nomeFilmes.size();i++) {
            for(int j=0;j<filmes.size();j++){
                if (filmes.get(j).titulo.equals(nomeFilmes.get(i))) {
                    filmesSelecionados.add(filmes.get(j));
                    break;
                }
            }
        }

        if (clienteSelecionado != null && filmesSelecionados != null) {
            List<Filme> filmesAlugados = new ArrayList<>();
            filmesAlugados = filmesSelecionados;
            return new Locacao(clienteSelecionado, filmesAlugados);
        } else {
            return null;
        }
    }
}
