/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tela.TelaFilmes;


/**
 *
 * @author miche
 */
public class AcaoBotao1 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        TelaFilmes tela = new TelaFilmes();
        tela.setVisible(true);
    }
}