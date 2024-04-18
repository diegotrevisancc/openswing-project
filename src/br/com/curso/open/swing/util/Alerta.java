/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.curso.open.swing.util;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Alerta {

    ImageIcon iconeSucesso = new javax.swing.ImageIcon(getClass().getResource("/br/com/curso/open/swing/img/iconeSucesso.png"));
    ImageIcon iconeErro = new javax.swing.ImageIcon(getClass().getResource("/br/com/curso/open/swing/img/iconeErro.png"));
    ImageIcon iconePergunta = new javax.swing.ImageIcon(getClass().getResource("/br/com/curso/open/swing/img/iconePergunta.png"));

    public void alertNormal(String mensagem) {

        JOptionPane.showMessageDialog(null, mensagem, "Aviso", 2);
    }

    public void alertSucesso(String mensagem) {

        JOptionPane.showMessageDialog(null, mensagem, "Sucesso", 1, iconeSucesso);
    }

    public void alertErro(String mensagem) {

        JOptionPane.showMessageDialog(null, mensagem, "Erro", 0, iconeErro);
    }

    public boolean alertPerguta(String pergunta) {

        return (JOptionPane.showConfirmDialog(null, pergunta, "Confirmação", JOptionPane.YES_NO_OPTION, 1, iconePergunta) == JOptionPane.YES_OPTION);
    }
}
