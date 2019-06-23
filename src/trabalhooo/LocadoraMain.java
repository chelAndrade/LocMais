/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author miche
 */
public class LocadoraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("ola mundo");
         JFrame frame = new JFrame("LocMais");
         JPanel painel = new JPanel();
        
        
        JButton botao = new JButton("Cadastrar Filmes");
       
        botao.setToolTipText("Clique aqui para salvar");
        painel.add(botao);
        
        JButton botao1 = new JButton("Cadastar Fornecedor");
        
        botao1.setToolTipText("Clique aqui para salvar");
        painel.add(botao1);
       
        JButton botao2 = new JButton("Cadastrar Clientes");
        
        botao2.setToolTipText("Clique aqui para salvar");
        painel.add(botao2);
        
        frame.getContentPane().add(new JButton("Teste")); 
       
        frame.getContentPane().add(painel);
        
        frame.setSize(400, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
    
    }
}