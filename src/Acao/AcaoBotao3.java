/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tela.TelaPessoa;

/**
 *
 * @author miche
 */
public class AcaoBotao3 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        TelaPessoa tela = new TelaPessoa();
        tela.setVisible(true);
    }
}
