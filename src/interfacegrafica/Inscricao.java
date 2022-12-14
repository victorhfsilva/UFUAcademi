/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ufuacademi.Aluno;
import ufuacademi.Atividade;
import ufuacademi.UFUAcademi;

/**
 * JFrame Inscricao
 */
public class Inscricao extends javax.swing.JFrame {

    /**
     * Creates new form Inscrição
     */
    public Inscricao() {
        initComponents();
         Color cinza = new Color(80, 80, 80);
        getContentPane().setBackground(cinza);
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        atividadeLabel = new javax.swing.JLabel();
        alunoComboBox = new javax.swing.JComboBox<>();
        atividadeComboBox = new javax.swing.JComboBox<>();
        inscreverButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tituloLabel.setFont(new java.awt.Font("Lato Black", 1, 18)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("INSCRIÇÃO DE ALUNOS  ");

        nomeLabel.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeLabel.setText("NOME DO ALUNO");

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGO UFUACADEMI.png"))); // NOI18N

        atividadeLabel.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        atividadeLabel.setForeground(new java.awt.Color(255, 255, 255));
        atividadeLabel.setText("ATIVIDADE:");

        inscreverButton.setText("INSCREVER");
        inscreverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscreverButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inscreverButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel)
                            .addComponent(atividadeLabel))
                        .addContainerGap(116, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atividadeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alunoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tituloLabel)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alunoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atividadeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atividadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inscreverButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inscreverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscreverButtonActionPerformed
        Aluno aluno = UFUAcademi.gerenciadorAlunos.getListaAlunos().get(alunoComboBox.getSelectedIndex());
        Atividade atividade = UFUAcademi.gerenciadorAtividades.getListaAtividades().get(atividadeComboBox.getSelectedIndex());
        boolean foiInscrito = aluno.inscrever(atividade);
        if(foiInscrito) atividade.inscrever(aluno);
        UFUAcademi.gerenciadorAlunos.exportar("src/dados/ListaDeAlunos.csv");
        UFUAcademi.gerenciadorAtividades.exportar("src/dados/ListaDeAtividades.csv");
        JOptionPane.showMessageDialog(null,"Sua inscrição foi realizada com sucesso.","Inscrição completa.",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_inscreverButtonActionPerformed
    
    /**
     *  Carrega os elementos ComboBoxes com os nomes dos Alunos e a Categoria + Códigos das Atividades 
     */
    public void setComboBoxes(){
        ArrayList<Aluno> alunos = UFUAcademi.gerenciadorAlunos.getListaAlunos();
        for (Aluno aluno: alunos){
            alunoComboBox.addItem(aluno.getNome());
        }
        ArrayList<Atividade> atividades = UFUAcademi.gerenciadorAtividades.getListaAtividades();
        for (Atividade atividade: atividades){
            atividadeComboBox.addItem(atividade.getCategoria()+": "+atividade.getCodigo());
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
            java.util.logging.Logger.getLogger(Inscricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscricao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alunoComboBox;
    private javax.swing.JComboBox<String> atividadeComboBox;
    private javax.swing.JLabel atividadeLabel;
    private javax.swing.JButton inscreverButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
