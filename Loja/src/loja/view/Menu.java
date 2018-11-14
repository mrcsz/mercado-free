/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.view;

import javax.swing.JFrame;
import loja.controller.ControllerProduto;

/**
 *
 * @author Administrador
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrarProdutos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnListarProdutos = new javax.swing.JButton();
        btnRealizarVendas = new javax.swing.JButton();
        btnListagemVendas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrarProdutos.setText("Cadastrar Produto");
        btnCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menu Loja");

        btnListarProdutos.setText("Listagem de produtos");
        btnListarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProdutosActionPerformed(evt);
            }
        });

        btnRealizarVendas.setText("Realizar venda");
        btnRealizarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVendasActionPerformed(evt);
            }
        });

        btnListagemVendas.setText("Listagem de vendas");
        btnListagemVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemVendasActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListarProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(btnCadastrarProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRealizarVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListagemVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(btnCadastrarProdutos)
                .addGap(18, 18, 18)
                .addComponent(btnListarProdutos)
                .addGap(18, 18, 18)
                .addComponent(btnRealizarVendas)
                .addGap(18, 18, 18)
                .addComponent(btnListagemVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutosActionPerformed
        // TODO add your handling code here:
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
        ControllerProduto.telaCadastro();
    }//GEN-LAST:event_btnCadastrarProdutosActionPerformed

    private void btnListagemVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListagemVendasActionPerformed

    private void btnListarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarProdutosActionPerformed

    private void btnRealizarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarVendasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void Menu() {

        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProdutos;
    private javax.swing.JButton btnListagemVendas;
    private javax.swing.JButton btnListarProdutos;
    private javax.swing.JButton btnRealizarVendas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}