/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tela.TelaFornecedor;

/**
 *
 * @author miche
 */
public class AcaoBotao implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        TelaFornecedor tela = new TelaFornecedor();
        tela.setVisible(true);
    }

}
