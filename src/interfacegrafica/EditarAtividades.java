/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import java.awt.Color;
import javax.swing.JOptionPane;
import ufuacademi.Atividade;
import ufuacademi.UFUAcademi;
import ufuacademi.exceptions.EmptyCodeException;
import ufuacademi.exceptions.EmptyNameException;

/**
 * JFrame EditarAtividades
 */
public class EditarAtividades extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarAtividades
     */
    public EditarAtividades() {
        initComponents();
        Color cinza = new Color(80, 80, 80);
        getContentPane().setBackground(cinza);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarAtividadesButton = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        logoUfu = new javax.swing.JLabel();
        descricaoLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        descricaoTextField = new javax.swing.JTextField();
        categoriaLabel = new javax.swing.JLabel();
        categoriasComboBox = new javax.swing.JComboBox<>();
        codigoLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(80, 80, 80));
        setResizable(false);

        cadastrarAtividadesButton.setText("EDITAR ATIVIDADES");
        cadastrarAtividadesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAtividadesButtonActionPerformed(evt);
            }
        });

        tituloLabel.setFont(new java.awt.Font("Lato Black", 1, 18)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("EDIÇÃO DE ATIVIDADES");

        nomeLabel.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeLabel.setText("NOME DA ATIVIDADE:");

        logoUfu.setBackground(new java.awt.Color(80, 80, 80));
        logoUfu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGO UFUACADEMI.png"))); // NOI18N

        descricaoLabel.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        descricaoLabel.setForeground(new java.awt.Color(255, 255, 255));
        descricaoLabel.setText("DESCRIÇÃO:");

        categoriaLabel.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        categoriaLabel.setForeground(new java.awt.Color(255, 255, 255));
        categoriaLabel.setText("CATEGORIA:");

        categoriasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aeróbicos", "Aquáticos", "Esportes", "Levantamento de Peso" }));

        codigoLabel.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        codigoLabel.setForeground(new java.awt.Color(255, 255, 255));
        codigoLabel.setText("CÓDIGO DA ATIVIDADE:");

        codigoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descricaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descricaoTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codigoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(categoriaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoriasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cadastrarAtividadesButton)
                                .addGap(111, 111, 111)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(logoUfu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloLabel)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoUfu, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(cadastrarAtividadesButton)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarAtividadesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAtividadesButtonActionPerformed
        String codigo = codigoTextField.getText();
        String nome = nomeTextField.getText();
        String descricao = descricaoTextField.getText();
        String categoria;
        switch (categoriasComboBox.getSelectedIndex()){
            case 0 : categoria = "Aeróbicos"; break;
            case 1 : categoria = "Aquáticos"; break;
            case 2 : categoria = "Esportes"; break;
            case 3 : categoria = "Levantamento de Peso"; break;
            default : categoria = ""; break;
        }
        try {
            boolean nomeEstaVazio = nome.trim().isEmpty();
            if (nomeEstaVazio) throw new EmptyNameException();
            boolean codigoEstaVazio = codigo.trim().isEmpty();
            if (codigoEstaVazio) throw new EmptyCodeException();
            Atividade atividade = new Atividade(codigo, nome, descricao, categoria);
            UFUAcademi.gerenciadorAtividades.editar(EscolherAtividade.indiceAtividadeEscolhida,codigo,nome,descricao,categoria);
            super.dispose();
        }
        catch (EmptyNameException ex){
            JOptionPane.showMessageDialog(null,"O nome inserido não contêm caracteres.","Nome Inválido.",JOptionPane.ERROR_MESSAGE);   
        }
         catch (EmptyCodeException ex){
            JOptionPane.showMessageDialog(null,"O código inserido não contêm caracteres.","Código Inválido.",JOptionPane.ERROR_MESSAGE);   
        }
    }//GEN-LAST:event_cadastrarAtividadesButtonActionPerformed

    private void codigoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTextFieldActionPerformed
    
    /**
     * Preenche os elementos TextFields com os dados da atividade escolhida
     * @param codigo
     * @param nome
     * @param descricao
     * @param categoria 
     */
    public void setTextFields(String codigo,String nome,String descricao,String categoria){
        codigoTextField.setText(codigo);
        nomeTextField.setText(nome);
        descricaoTextField.setText(descricao);
        switch (categoria){
            case "Aeróbicos" : categoriasComboBox.setSelectedItem(0); break;
            case "Aquáticos" : categoriasComboBox.setSelectedItem(1); break;
            case "Esportes" : categoriasComboBox.setSelectedItem(2); break;
            case "Levantamento de Peso" : categoriasComboBox.setSelectedItem(3); break;
            default : categoriasComboBox.setSelectedItem(0); break;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarAtividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarAtividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarAtividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarAtividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarAtividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarAtividadesButton;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JComboBox<String> categoriasComboBox;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JLabel logoUfu;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}